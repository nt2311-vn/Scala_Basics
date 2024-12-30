@main def main =
  def greet(): String => Unit =
    (name: String) => println(s"Hello, $name")

  val greetFunction = greet()
  greetFunction("Toan")
  greet()("Toan")

  def hello(theGreeting: String): String => Unit =
    (name: String) => println(s"$theGreeting, $name")

  hello("Bonjour")("Toan")
