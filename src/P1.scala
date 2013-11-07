object P1 extends App {
  val result = (1 until 1000).filter(n => n % 3 == 0 || n % 5 == 0).sum
  print(result)
}