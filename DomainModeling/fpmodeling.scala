enum CrustSize:
  case Small, Medium, Large

enum CrustType:
  case Thin, Thick, Regular

enum Topping:
  case Cheese, Pepperoni, BlackOlives, GreenOlives, Onions

import CrustSize.*
val currentCrustSize = Small

@main def main =
  currentCrustSize match
    case Small  => println("Small crust size")
    case Large  => print("Large crust size")
    case Medium => println("Medium crust size")
