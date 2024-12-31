@main def handling =
  def makeInt(s: String): Int =
    try Integer.parseInt(s.trim)
    catch case e: Exception => 0

  println(makeInt("3"))
  println(makeInt("hey"))
