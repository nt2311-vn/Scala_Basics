@main def main =
  val ints = List(1, 2, 3)
  val doubleInts = ints.map(_ * 2)

  println(doubleInts)
  ints.foreach(i => println(i))
