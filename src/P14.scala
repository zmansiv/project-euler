object P14 extends App {
	def chainLength(num: Long, count: Int = 0): Int = {
		val _count = count + 1
		if (num == 1) {
			_count
		} else {
			chainLength(if (num % 2 == 0) num / 2 else 3 * num + 1, _count)
		}
	}
	val result = (1 until 1000000).maxBy(chainLength(_))
	println(result)
}
