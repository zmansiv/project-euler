object P4 extends App {
	var highest = -1
	(100 to 999).foreach(i => {
		(100 to 999).foreach(i2 => {
			val prod = i * i2
			if (prod > highest && prod.toString.equals(prod.toString.reverse)) {
				highest = prod
			}
		})
	})
	print(highest)
}
