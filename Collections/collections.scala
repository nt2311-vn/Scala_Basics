@main def main =
  val x = (1 to 5).toList
  val y = List.range(1, 10, 3)
  val a = List(10, 20, 30, 40, 10, 50, 60)

  println(x)
  println(y)
  println(a.sortWith((a, b) => a <= b))
  println(a.drop(2))
  println(a.sorted.dropWhile(_ < 25))
