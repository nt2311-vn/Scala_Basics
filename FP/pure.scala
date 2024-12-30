@main def pure =
  def double(i: Int): Int = i * 2

  def sum(xs: List[Int]): Int = xs match
    case Nil          => 0
    case head :: tail => head + sum(tail)

  println(double(2))
  println(sum(List(5, 2, 3, 8)))
  println(double(sum(List(2, 3, 2, 5))))
