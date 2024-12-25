@main def main = controlFlow()

var x = 5

def controlFlow() =
  if (x > 0) {
    println("postive")
  } else if (x == 0) {
    println("zero")
  } else {
    println("negative")
  }
