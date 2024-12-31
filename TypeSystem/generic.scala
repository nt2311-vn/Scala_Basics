@main def generic =
  class Stack[A]:
    private var elements: List[A] = Nil

    def push(x: A): Unit =
      elements = elements.prepended(x)

    def peek: A = elements.head
    def pop(): A =
      val currentTop = peek
      elements = elements.tail
      currentTop

  val stackA: Stack[Int] = Stack()
  stackA.push(1)
  stackA.push(5)
  stackA.push(7)

  println(stackA.peek)
  println(stackA.pop())
