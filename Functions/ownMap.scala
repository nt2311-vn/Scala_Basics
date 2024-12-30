@main def main =
  def map[A](f: (Int) => A, xs: List[Int]) =
    for x <- xs yield f(x)

  def map[A, B](f: (B) => A, xs: List[B]): List[A] =
    for x <- xs yield f(x)
