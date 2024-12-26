@main def main =
  val a = List(1, 2, 3).map(i => i * 2)
  val b = List(1, 2, 3).map(_ * 2)
  val c = List(1, 2, 3).map(double)
  val d = List(1, 2, 3).map(i => double(i))
  val m = (1 to 10).toList.filter(_ > 3).filter(_ < 7).map(_ * 10)

  println(a)
  println(b)
  println(c)
  println(d)
  println(m)

def double(i: Int): Int = i * 2
