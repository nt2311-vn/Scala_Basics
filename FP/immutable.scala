@main def imutable =
  val a = List("jame", "jon", "mary", "joe")
  val b = a.filter(_.startsWith("j")).map(_.capitalize)

  println(b)
