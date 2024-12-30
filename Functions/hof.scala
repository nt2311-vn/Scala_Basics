@main def main =
  def sayHello(f: () => Unit): Unit = f()
  def helloToan(): Unit = println("Hello, Toan")
  def bonjourToan(): Unit = println("Bonjour, Toan")

  def executeNTimes(f: () => Unit, n: Int): Unit =
    for i <- 1 to n do f()

  sayHello(helloToan)
  sayHello(bonjourToan)
  executeNTimes(helloToan, 5)
