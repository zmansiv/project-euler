object P6 extends App {
	val result = math.pow((1 to 100).sum, 2).toInt - (1 to 100).map(math.pow(_, 2)).sum.toInt
	print(result)
}
