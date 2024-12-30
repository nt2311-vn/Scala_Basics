@main def main =
  def sayHello(f: () => Unit): Unit = f()
  def helloToan(): Unit = println("Hello, Toan")

  sayHello(helloToan)
