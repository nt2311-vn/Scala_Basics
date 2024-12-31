@main def nullval =
  class Address(
      var street1: String,
      var street2: Option[String],
      var city: String,
      var state: String,
      var zip: String
  )

  val santa = Address("1 Main Street", None, "North Pole", "Alaska", "99705")

  println(s"${santa.street2}")
