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
