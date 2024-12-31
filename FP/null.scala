@main def nullval =
  class Address(
      var street1: String,
      var street2: Option[String],
      var city: String,
      var state: String,
      var zip: String
  )

  val santa = Address("1 Main Street", None, "North Pole", "Alaska", "99705")
  val britishPM = Address(
    "10 Downing Street",
    Some("Room 1"),
    "London",
    "Greater London",
    "SW1A"
  )

  println(s"${santa.street2}")
  println(s"${britishPM.street1} ${britishPM.street2}")
