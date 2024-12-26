@main def main = println(verifyVariableType(Map("v" -> 0)))

// var i = 0
// while i < 3 do
//   println(i)
//   i += 1
//

case class Person(name: String)
var x = 5
val items = List("item1", "item2", "item5", "item6")
val names = List("olivia", "tiger", "john")
val p = Person("Fred")

def controlFlow() =
  if x > 0 then println("postive")
  else if x == 0 then println("zero")
  else println("negative")

def loopFromList(list: List[String]) =
  for (item <- list)
    println(item)

def forwardLoop(n: Int) =
  for (num <- 1 to n)
    println(num)

def reverseLoop(n: Int) =
  for (num <- n to 1 by -1)
    println(num)

def skipLoop(n: Int) =
  for (num <- 1 to n by 2)
    println(num)

def guardLoop(list: List[String]) =
  for
    item <- list
    i <- 1 to 3
    if item != "item5" && i == 2
  do println(s"$item $i")

val loopExpression = (numbers: List[Int]) =>
  for number <- numbers
  yield number * 2

val capNames = (guests: List[String]) => guests.map(name => name.capitalize)

def whatDay(dayIdx: Int): String =
  dayIdx match
    case 0 => "Sunday"
    case 1 => "Monday"
    case 2 => "Tuesday"
    case 3 => "Wednesday"
    case 4 => "Thursday"
    case 5 => "Friday"
    case 6 => "Saturday"
    // case _ => "invalid day" // default match all
    case what => s"You gave a $what index day"

def whatPerson() =
  p match
    case Person(name) if name == "Fred" =>
      println(s"$name says, Yubba dubba doo")
    case Person(name) if name == "Bam Bam" => println(s"$name says, Bambam!")
    case _                                 => println("Watch the FlinStones!")

def verifyVariableType(x: Matchable): String = x match
  case s: String  => s"$s is a string"
  case i: Int     => "Int"
  case d: Double  => "Double"
  case l: List[?] => "List"
  case _          => "Unknown"
