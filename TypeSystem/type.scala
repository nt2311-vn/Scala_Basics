@main def typesystem =
  val a = 1
  val b = 1.0
  val c = "Hi!"

  def isTruthy(a: Boolean | Int | String): Boolean = a match
    case a: Boolean => a
    case a: Int     => a != 0
    case a: String  => a.length > 0

  println(isTruthy(""))
  println(isTruthy(3))

  def dogCatOrWhatever(): Dog | Plant | Car | Sun | None = None
