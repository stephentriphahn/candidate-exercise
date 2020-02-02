package problems

import scala.collection.mutable

object ProblemTwo {
  case class Promotion(code: String, notCombinableWith: Seq[String])
  case class PromotionCombo(promotionCodes: Seq[String])

  def findCombinableWith(allCodes: Seq[String], promotion: Promotion)
  : Set[String] = allCodes.toSet -- promotion.notCombinableWith.toSet

  def codeToValidWithMap(allPromotions: Seq[Promotion])
  : mutable.HashMap[String, Set[String]] = {
    val allCodes = allPromotions.map(_.code)
    val findCombinable = findCombinableWith(allCodes, _: Promotion)

    val codeToCombinable = mutable.HashMap[String, Set[String]]()
    for (p <- allPromotions) codeToCombinable(p.code) = findCombinable(p)
    codeToCombinable
  }

  def allCombinablePromotions(allPromotions: Seq[Promotion])
  : Seq[PromotionCombo] = {
    val validCombo = codeToValidWithMap(allPromotions)
    Seq()
  }

  def combinablePromotions(promotionCode: String, allPromotions: Seq[Promotion])
  : Seq[PromotionCombo] = {

    Seq()
  }
}
