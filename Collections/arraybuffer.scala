import scala.collection.mutable.ArrayBuffer

@main def arraybuffer =

  // create empty array buffer
  case class Person(name: String)
  var strings = ArrayBuffer[String]()
  var ints = ArrayBuffer[Int](20)
  var people = ArrayBuffer[Person]()
