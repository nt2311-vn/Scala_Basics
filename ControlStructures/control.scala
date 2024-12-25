@main def main = guardLoop(items)

var x = 5
val items = List("item1", "item2", "item5", "item6")

def controlFlow() =
  if (x > 0) {
    println("postive")
  } else if (x == 0) {
    println("zero")
  } else {
    println("negative")
  }

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
