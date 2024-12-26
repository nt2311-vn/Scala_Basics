// public class and parameter of its become imutable

case class Person(name: String, vocation: String)

@main def main =
  val p = Person("J.Cole", "Singer")
  println(p.name)

  val p2 = p.copy(name = "Kendrick")
  println(p2.name)
