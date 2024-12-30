@main def main =
  def greet(): String => Unit =
    (name: String) => println(s"Hello, $name")

  val greetFunction = greet()
  greetFunction("Toan")
  greet()("Toan")

  def hello(theGreeting: String): String => Unit =
    (name: String) => println(s"$theGreeting, $name")

  hello("Bonjour")("Toan")

  def createGreetingFunc(desireLanguage: String): String => Unit =
    val englishGreeting = (name: String) => println(s"Hello, $name")
    val frenchGreeting = (name: String) => println(s"Bonjour, $name")
    desireLanguage match
      case "english" => englishGreeting
      case "french"  => frenchGreeting
      case lang => (name: String) => println(s"Sorry, we do not know $lang")

  createGreetingFunc("french")("Toan")
  createGreetingFunc("spain")("Juan")
