package problems

import scala.collection.mutable

object ProblemTwo {
  case class Promotion(code: String, notCombinableWith: Seq[String])
  case class PromotionCombo(promotionCodes: Seq[String])

  def findCombinableWith(allPrmotions: Seq[String], promotion: Promotion)
  : Seq[String] = allPrmotions.diff(promotion.notCombinableWith)

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
    /*
    1. take first code (p1)
    2. find next combinable promotion (p2)
    3. find next combinable promotion of that (p3), check if included in existing
       4. If it is not combinable with the first one (true), find the next and
       repeat
       5. If there are no more combinable (true), return PromotionCombo
     */
    Seq()
  }

  def combinablePromotions(promotionCode: String, allPromotions: Seq[Promotion])
  : Seq[PromotionCombo] = {
    // remove notCombinableWith items

    // remove notCombinableWith for next combinable promotion

    // do this until items removed + combinable == allPromotions.length
    Seq()
  }
}




