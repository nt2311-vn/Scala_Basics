@main def main =
  val x = sum(5, 2)
  println(x)

  val y = concatenate("foo", "bar")
  println(y)

def sum(a: Int, b: Int): Int = a + b
def concatenate(s1: String, s2: String): String = s1 + s2
