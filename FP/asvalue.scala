@main def asvalue =
  val nums = (1 to 10).toList
  val doubles = nums.map(_ * 2)
  val lessThanFive = nums.filter(_ < 5)

  def double(i: Int): Int = i * 2
  def underFive(i: Int): Boolean = i < 5

  println(doubles)
  println(lessThanFive)
  println(nums.map(double))
  println(nums.filter(underFive))
