import scala.collection.mutable.ArrayBuffer

@main def arraybuffer =

  // create empty array buffer
  case class Person(name: String)
  var strings = ArrayBuffer[String]()
  var ints = ArrayBuffer[Int](20)
  var people = ArrayBuffer[Person]()

  // create with initial elements
  val nums = ArrayBuffer(1, 2, 3)
  val guestList = ArrayBuffer(Person("Bert"), Person("Ernie"), Person("Grover"))

  println(strings)
  println(ints)
  println(people)
  println(nums)
  println(guestList)
