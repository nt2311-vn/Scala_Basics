@main def main = forwardLoop(10)

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
