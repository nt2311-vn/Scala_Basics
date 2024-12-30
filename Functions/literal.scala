@main def main =
  val double = (i: Int) => i * 2
  val x = double(2)

  val triple = (i: Int) => i * 3
  val y = triple(3)

  println(x)
  println(y)
  println(triple(double(3)))
