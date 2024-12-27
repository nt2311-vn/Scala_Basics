@main def set =
  /** Init new empty and static elements */
  val emptyNums = Set[Int]()
  val emptyLetters = Set[Char]()
  val nums = Set(1, 2, 3, 4)
  val letters = Set('a', 'b', 'c', 'd')

  /** Add element and set to set, reassign new variable if set is imutable, set
    * in scala can be both imutable and mutable
    */

  val a = Set(1, 2)
  var b = Set('a', 'b', 'c')
  val c = a + 3 ++ Seq(4, 5)

  b = b + 'd' ++ List('e', 'f', 'a')
  b = b - 'a' -- Seq('b', 'e')

  println(emptyNums)
  println(emptyLetters)
  println(nums)
  println(letters)
  println(c)
  println(b)
