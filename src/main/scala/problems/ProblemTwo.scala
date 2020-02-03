package problems

import scala.collection.mutable

object ProblemTwo {
  case class Promotion(code: String, notCombinableWith: Seq[String])
  case class PromotionCombo(promotionCodes: Seq[String])

  def findCombinableWith(allCodes: Seq[String], promotion: Promotion)
  : Seq[String] = allCodes.diff(promotion.notCombinableWith)

  def codeToValidWithMap(allPromotions: Seq[Promotion])
  : mutable.HashMap[String, Seq[String]] = {
    val allCodes = allPromotions.map(_.code)
    val findCombinable = findCombinableWith(allCodes, _: Promotion)

    val codeToCombinable = mutable.HashMap[String, Seq[String]]()
    for (p <- allPromotions) codeToCombinable(p.code) = findCombinable(p)
    codeToCombinable
  }

  def allCombinablePromotions(allPromotions: Seq[Promotion])
  : Seq[PromotionCombo] = {
    val possibleCombosByCode = codeToValidWithMap(allPromotions)

    Seq()
  }

  def combinablePromotions(promotionCode: String, allPromotions: Seq[Promotion])
  : Seq[PromotionCombo] = {

    Seq()
  }
}
