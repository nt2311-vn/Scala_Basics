@main def maps =

  /* Define map with an init key, value */
  val states = Map(
    "QN" -> "Quang Ngai",
    "HN" -> "Hanoi",
    "SG" -> "Sai Gon",
    "VT" -> "Vung Tau"
  )
  /* Loop through a map to extract key, value */

  for (k, v) <- states do println(s"Abbreviation $k, name $v")

  val emptyMap = Map()

  /* Extract value from key */
  val qn = states("QN")
  val sg = states("SG")

  // using get or else or with default value when init maps to avoid crash when access not exisit key

  val dn = states.getOrElse("DN", "key not exist")

  /* Add and remove element from Map */
  // Assign to new variable since the default Map is imutable every update remove will create new map
  var newStates = states + ("DN" -> "Da Nang")
  newStates = newStates + ("DN" -> "Dong Nai")
  println(s"DN now is ${newStates.getOrElse("DN", "key not exist")}")

  newStates = newStates ++ Seq("DN" -> "Da Nang", "HA" -> "Hoi An")
  newStates = newStates - "HA"

  println(states.size)
  println(emptyMap.size)
  println(qn)
  println(sg)
  println(dn)
  println(newStates)
