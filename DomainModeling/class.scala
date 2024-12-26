@main def main =
  val p = Person("Toan", "Nguyen")
  println(p.firstName)
  p.printFullName()

class Person(val firstName: String, val lastName: String):
  def printFullName() = println(s"$firstName $lastName")
