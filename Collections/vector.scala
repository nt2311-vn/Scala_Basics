@main def vector =
  val nums = Vector(1, 2, 3, 4, 5)
  val strings = Vector("one", "two")

  case class Person(name: String)
  val people = Vector(Person("Bert"), Person("Ernie"), Person("Grover"))

  // Append and prepend new element vector create new sequence
  val a = Vector(1, 2, 3)
  val b = a :+ 4 // append element to vector
  val c = a ++ Vector(4, 5) // append element of vector to vector

  println(nums)
  println(people)
  println(a)
  println(b)
  println(c)
