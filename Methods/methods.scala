@main def main =
  val x = sum(5, 2)
  println(x)

  val y = concatenate("foo", "bar")
  println(y)

  makeConnection("google.com")
  println("1".makeInt(2))
  println("10".makeInt(2))
  println("256".makeInt(8))

def sum(a: Int, b: Int): Int = a + b
def concatenate(s1: String, s2: String): String = s1 + s2
def makeConnection(url: String, timeout: Int = 5000): Unit =
  println(s"url=$url, timeout=$timeout")

extension (s: String) def makeInt(radix: Int): Int = Integer.parseInt(s, radix)
