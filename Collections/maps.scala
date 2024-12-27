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

  println(states.size)
  println(emptyMap.size)
  println(qn)
  println(sg)
  println(dn)
