
import problems.{ProblemOne, TestData}

object Main extends App {
  println("Running Problem One...")

  val result = ProblemOne.getBestGroupPrices(TestData.rates, TestData.cabinPrices)
  println("Best Cabin Prices:")
  result.foreach(r => println(r))

  println("Running Problem Two")
}
