@main def main =
  val d = Dog("Roger")
  println(d.speak())
  d.startTail()
  d.startRunning()

  val c = Cat("Bụp")
  println(c.speak())
  c.startRunning()
  c.stopRunning()

trait Speaker:
  def speak(): String

trait TailWagger:
  def startTail(): Unit = println("tail is wagging")
  def stopTail(): Unit = println("tail is stopped")

trait Runner:
  def startRunning(): Unit = println("I'm running")
  def stopRunning(): Unit = println("Stopped running")

class Dog(name: String) extends Speaker, TailWagger, Runner:
  def speak(): String = s"Woof!, I'm $name"

class Cat(name: String) extends Speaker, TailWagger, Runner:
  def speak(): String = s"Meow, I'm $name"
  override def startRunning(): Unit = println("I dont like running")
  override def stopRunning(): Unit = println("No need to do that")
