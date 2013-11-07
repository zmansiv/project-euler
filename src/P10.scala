object P10 extends App {
	val result = findPrimes(2000000).map(_.toLong).sum
	println(result)

	def findPrimes(limit: Int): Array[Int] = {
		val isPrime: Array[Boolean] = new Array[Boolean](limit + 1)
		val sqrt = math.sqrt(limit).round.intValue
		(1 to sqrt).foreach(x => {
			(1 to sqrt).foreach(y => {
				var n = (4 * x * x) + (y * y)
				if (n <= limit && (n % 12 == 1 || n % 12 == 5)) {
					isPrime(n) = !isPrime(n)
				}
				n = (3 * x * x) + (y * y)
				if (n <= limit && (n % 12 == 7)) {
					isPrime(n) = !isPrime(n)
				}
				n = (3 * x * x) - (y * y)
				if ((x > y) && (n <= limit) && (n % 12 == 11)) {
					isPrime(n) = !isPrime(n)
				}
			})
		})
		(5 to sqrt).foreach(n => {
			if (isPrime(n)) {
				val primeSquared = n * n
				var inc = 1
				var primeSquaredInc = primeSquared * inc
				while (primeSquaredInc <= limit) {
					isPrime(primeSquaredInc) = false
					inc += 1
					primeSquaredInc = primeSquared * inc
				}
			}
		})
		val primes: Array[Int] = new Array[Int](limit)
		var found = 2
		primes(0) = 2
		primes(1) = 3
		(5 until limit).foreach(n => {
			if (isPrime(n)) {
				primes(found) = n
				found += 1
			}
		})
		primes.take(found)
	}
}
