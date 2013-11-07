object P7 extends App {
	val result = Iterator.from(2).filter(isPrime).drop(10000).next()
	print(result)

	def isPrime(i: Int): Boolean = {
		(2 to i/2).foreach(i2 => {
			if (i % i2 == 0) {
				return false
			}
		})
		true
	}
}