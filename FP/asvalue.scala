@main def asvalue =
  val nums = (1 to 10).toList
  val doubles = nums.map(_ * 2)
  val lessThanFive = nums.filter(_ < 5)

  println(doubles)
  println(lessThanFive)
