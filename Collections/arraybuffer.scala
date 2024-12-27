import scala.collection.mutable.ArrayBuffer

@main def arraybuffer =

  /** create empty array buffer */

  case class Person(name: String)
  var strings = ArrayBuffer[String]()
  var ints = ArrayBuffer[Int](20)
  var people = ArrayBuffer[Person]()

  /** create with initial elements */

  val nums = ArrayBuffer(1, 2, 3)
  val guestList = ArrayBuffer(Person("Bert"), Person("Ernie"), Person("Grover"))

  /** methods */

  // Add an element to array buffer
  nums += 4

  // array buffer is mutable so add or remove direct modify the original array (modify the reference storage)

  nums ++= ArrayBuffer(5, 6)
  nums.prependAll(List(-1, 0))
  nums.prepend(-2)

  // update element in array buffer
  nums(0) = -3
  nums.update(nums.length - 1, 2000)

  println(strings)
  println(ints)
  println(people)
  println(nums)
  println(guestList)
  println(nums)
