import scala.math.*

@main def main =
  val x = StringUtils.isNullOrEmpty("")
  val y = StringUtils.leftTrim("        find me!")
  val circle1 = Circle(64.0)

  println(x)
  println(y)
  println(s"Area of circle ${circle1.area}")

object StringUtils:
  def isNullOrEmpty(s: String): Boolean = s == null || s.trim.isEmpty
  def leftTrim(s: String): String = s.replaceAll("^\\s+", "")
  def rightTrim(s: String): String = s.replaceAll("\\s+$", "")

// companion object or class can access private method of its companion
class Circle(radius: Double):
  import Circle.*
  def area: Double = calculateArea(radius)

object Circle:
  private def calculateArea(radius: Double): Double =
    Pi * pow(radius, 2.0)
