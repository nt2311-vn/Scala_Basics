@main def imutable =
  val a = List("jame", "jon", "mary", "joe")
  val b = a.filter(_.startsWith("j")).map(_.capitalize)

  println(b)

  case class Person(fistName: String, lastName: String)
  val reginald = Person("Reginald", "Dwight")
  val elton = reginald.copy("Elton", "John")

  println(s"${elton.fistName} ${elton.lastName}")
