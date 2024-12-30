@main def main =
  val doubledOdds: PartialFunction[Int, Int] = {
    case i if i % 2 == 1 => i * 2
  }

  val checkInts = List(3, 4, 5)
  checkInts.foreach(i => println(doubledOdds.isDefinedAt(i)))

  val res = List(1, 2, 3).collect({ case i if i % 2 == 1 => i * 2 })
  println(res)
