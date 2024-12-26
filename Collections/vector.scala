@main def vector =
  val nums = Vector(1, 2, 3, 4, 5)
  val strings = Vector("one", "two")

  case class Person(name: String)
  val people = Vector(Person("Bert"), Person("Ernie"), Person("Grover"))

  println(nums)
  println(people)
