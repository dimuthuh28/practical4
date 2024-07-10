import scala.io.StdIn.readLine

object patternMatching extends App{

  print("Enter a Integer: ")
  val intg: Int = readLine().toInt

  def pm(intg: Int): Unit = intg <= 0 match{
    case true  => println("Negetive/Zero")
    case false => intg % 2 match{
      case 0 => println("Even number is given.")
      case 1 => println("Odd number is given ")
    }
  }

  pm(intg)
}
