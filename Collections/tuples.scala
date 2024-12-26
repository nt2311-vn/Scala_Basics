case class Person(name: String)

@main def tuples =
  val t = (7, "eleven", Person("Mike"))

  // Tuple extract
  val (num, store, person) = t

  println(s"First value ${t(0)}")
  println(s"Second value ${t(1)}")
  println(s"Third value ${t(2)}")
  println(s"$num$store ${person.name}")
