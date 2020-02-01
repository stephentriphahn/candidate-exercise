package problems

object ProblemTwo {
  case class Promotion(code: String, notCombinableWith: Seq[String])
  case class PromotionCombo(promotionCodes: Seq[String])

  def findCombinableWith(allCodes: Seq[String], promotion: Promotion)
  : Set[String] = allCodes.toSet -- promotion.notCombinableWith.toSet

  def allCombinablePromotions(allPromotions: Seq[Promotion])
  : Seq[PromotionCombo] = {
    for (code <- allPromotions.map(_.code);
         promotion <- allPromotions if code != promotion.code) {

    }
    Seq()
  }

  def combinablePromotions(promotionCode: String, allPromotions: Seq[Promotion])
  : Seq[PromotionCombo] = {

    Seq()
  }
}
