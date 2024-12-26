@main def main =
  // list is imutable when add or remove or perform any mutable operation to list we create new one
  case class Person(name: String)
  val x = (1 to 5).toList
  val y = List.range(1, 10, 3)
  val a = List(10, 20, 30, 40, 10, 50, 60)
  val sum = a.reduce(_ + _)
  val names = "Joel" :: "Chris" :: "Ed" :: Nil
  val mixTypeLists: List[Int | String | Double] = List(1, "three", 5.0)
  val listAnyTypes: List[Any] = List(List(1, 2, 3), Person("Red"), "")
  val anotherSum = a.reduceLeft(_ + _)
  val sumPlus100 = a.foldLeft(100)(_ + _)

  val b = 0 :: a // prepend one element
  val c = List(-10, 0) ::: a // prepend another list
  val snap = LazyList.range(1, Int.MaxValue)
  snap.take(1)
  snap.take(5)
  snap.map(_ + 1)

  println(x)
  println(y)
  println(a.sortWith((a, b) => a <= b))
  println(a.drop(2))
  println(a.sorted.dropWhile(_ < 25))
  println(a.filter(_ < 25))
  println(a.slice(2, 4))
  println(s"Length ${a.length}")
  println(a.head)
  println(a.tail)
  println(a.take(3))
  println(a.takeWhile(_ > 30))
  println(sum)
  println(anotherSum)
  println(sumPlus100)
  println(names)
  println(mixTypeLists)
  println(listAnyTypes)
  println(b)
  println(c)
  println(snap)

  // compute its element when needed (force)
  snap.take(1000).foreach(println)
