object P2 extends App {
  lazy val stream: Stream[Int] = 0 #:: 1 #:: stream.zip(stream.tail).map(n => n._1 + n._2)
  val result = stream.takeWhile(_ < 4000000).filter(_ % 2 == 0).sum
  print(result)
}