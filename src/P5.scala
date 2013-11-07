object P5 extends App {
	val result = Iterator.from(20).find(i => (1 to 20).forall(i % _ == 0)).get
	print(result)
}
