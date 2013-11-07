object P12 extends App {
	val result = Iterator.from(1).map(i => (1 to i).sum).find(sum => {
		val sqrt = math.sqrt(sum).toInt
		((1 until sqrt).count(sum % _ == 0) * 2 + (if (sqrt * sqrt == sum) 1 else 0)) > 500
	}).get
	print(result)
}
