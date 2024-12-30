@main def main =
  // def map[A](f: (Int) => A, xs: List[Int]): List[A] =
  //   for x <- xs yield f(x)

  def map[A, B](f: (B) => A, xs: List[B]): List[A] =
    for x <- xs yield f(x)

  def double(i: Int): Int = i * 2
  def strlen(s: String): Int = s.length

  val x = map(double, List(1, 2, 3))
  val y = map(strlen, List("a", "aab", "cc"))

  println(x)
  println(y)
