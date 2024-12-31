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

  def consumeMsg(msg: Option[Int]) =
    msg match
      case Some(i) => i
      case None    => None

  val y = for
    a <- clearerMakeInt("1")
    b <- clearerMakeInt("2")
    c <- clearerMakeInt("foo")
  yield a + b + c

  val z = for
    a <- clearerMakeInt("1")
    b <- clearerMakeInt("3")
    c <- clearerMakeInt("5")
  yield a + b + c

  println(consumeMsg(z))
  println(consumeMsg(y))
