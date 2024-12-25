@main def main = forwardLoop(ints)

var x = 5
val ints = List(1, 2, 3, 4, 5)

def controlFlow() =
  if (x > 0) {
    println("postive")
  } else if (x == 0) {
    println("zero")
  } else {
    println("negative")
  }

def forwardLoop(list: List[Int]) =
  for (num <- list) do println(num)
