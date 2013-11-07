import scala.util.control.Breaks._

object P9 extends App {
	var result = -1
	breakable {
		(1 to 998).foreach(a => {
			(2 to 998).foreach(b => {
				(3 to 998).foreach(c => {
					if (a + b + c == 1000 && a * a + b * b == c * c) {
						result = a * b * c
						break()
					}
				})
			})
		})
	}
	println(result)
}
