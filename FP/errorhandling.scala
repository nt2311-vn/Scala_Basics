@main def handling =
  def makeInt(s: String): Int =
    try Integer.parseInt(s.trim)
    catch case e: Exception => 0

  def clearerMakeInt(s: String): Option[Int] =
    try Some(Integer.parseInt(s.trim))
    catch case _: Exception => None

  println(makeInt("3"))
  println(makeInt("hey"))

  println(clearerMakeInt("3"))
  println(clearerMakeInt("foo"))

  clearerMakeInt("bar") match
    case Some(i) => println(i)
    case None    => println("Cannot make int on provided value")
