import org.scalatest.FunSuite
import problems.TestData
import problems.ProblemOne.{BestGroupPrice, getBestGroupPrices}

class ProblemOneTest extends FunSuite {

  test("ProblemOne getBestGroupPrices") {
    val bestPrices = getBestGroupPrices(TestData.rates, TestData.cabinPrices)
    assert(bestPrices.length == 4)
    assert(bestPrices.contains(BestGroupPrice("CB","M1",230.0,"Military")))
    assert(bestPrices.contains(BestGroupPrice("CB","S1",245.0,"Senior")))
    assert(bestPrices.contains(BestGroupPrice("CA","M1",200.0,"Military")))
    assert(bestPrices.contains(BestGroupPrice("CA","S1",225.0,"Senior")))
  }

}
