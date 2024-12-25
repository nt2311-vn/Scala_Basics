@main def main =
  var i = 0
  while i < 3 do
    println(i)
    i += 1

var x = 5
val items = List("item1", "item2", "item5", "item6")
val names = List("olivia", "tiger", "john")

def controlFlow() =
  if x > 0 then println("postive")
  else if x == 0 then println("zero")
  else println("negative")

def loopFromList(list: List[String]) =
  for (item <- list) do println(item)

def forwardLoop(n: Int) =
  for (num <- 1 to n) do println(num)

def reverseLoop(n: Int) =
  for (num <- n to 1 by -1) do println(num)

def skipLoop(n: Int) =
  for (num <- 1 to n by 2) do println(num)

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
