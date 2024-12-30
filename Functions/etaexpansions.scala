@main def main =
  def isLessThan(x: Int, y: Int): Boolean = x < y
  val methods = List(isLessThan)
  val methodA = List(isLessThan(_, _))
  val methodB = List((x, y) => isLessThan(x, y))
