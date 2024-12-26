@main def main =
  val p = Person("Toan", "Nguyen")
  println(p.firstName)
  p.lastName = "Legend"
  p.printFullName()

class Person(var firstName: String, var lastName: String):
  def printFullName() = println(s"$firstName $lastName")
