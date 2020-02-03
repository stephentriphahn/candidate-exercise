package problems

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object ProblemOne {

  case class Rate(rateCode: String, rateGroup: String)
  case class CabinPrice(cabinCode: String, rateCode: String, price: BigDecimal)
  case class BestGroupPrice(cabinCode: String, rateCode: String,
                            price: BigDecimal, rateGroup: String)

  def getBestGroupPrices(rates: Seq[Rate], prices: Seq[CabinPrice])
  : Seq[BestGroupPrice] = {

    val codeToGroup = mutable.HashMap[String, String]()
    for (r <- rates) codeToGroup(r.rateCode) = r.rateGroup

    val groupPrices = prices.map(p => BestGroupPrice(p.cabinCode, p.rateCode,
      p.price, codeToGroup(p.rateCode)))

    val groupedByCabin = groupPrices.groupBy(_.cabinCode)

    // TODO try and make this better, using recursion and List :: cons
    val lowestPrices = ListBuffer[BestGroupPrice]()
    groupedByCabin.values.foreach(v => {
      val groupToPrices = v.groupBy(_.rateGroup)
      groupToPrices.values.foreach(prices => lowestPrices += prices.minBy(_.price))
    })

    lowestPrices.toSeq
  }
}
