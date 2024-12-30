@main def main =
  def sayHello(f: () => Unit): Unit = f()
  def helloToan(): Unit = println("Hello, Toan")
  def bonjourToan(): Unit = println("Bonjour, Toan")

  def executeNTimes(f: () => Unit, n: Int): Unit =
    for i <- 1 to n do f()

  def executeAndPrint(f: (Int, Int) => Int, i: Int, j: Int): Unit = println(
    f(i, j)
  )

  def add(x: Int, y: Int): Int = x + y
  def multiply(x: Int, y: Int): Int = x * y

  sayHello(helloToan)
  sayHello(bonjourToan)
  executeNTimes(helloToan, 5)
  executeAndPrint(add, 2, 3)
  executeAndPrint(multiply, 4, 5)
