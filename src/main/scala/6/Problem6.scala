package `6`

object Problem6 {
  def solve[X](list: Seq[X]): Boolean = 
    list match
      case Nil => false
      case x :: Nil => false
      case longerList => longerList == longerList.reverse

  def solveRecursive[X](list: Seq[X]): Boolean = 
    list match 
      case Nil => false
      case x :: Nil => true
      case first :: second :: Nil => first == second
      case longer => longer.head == longer.last && solveRecursive(longer.slice(1, longer.size - 1))

  def solveWithLoop[X](list: Seq[X]): Boolean = 
    list match
      case Nil => false
      case x :: Nil => false
      case longer => {
        val listSize = longer.size
        val loopCount = Math.ceil(listSize.doubleValue / 2).intValue
        val lastElementIndex = listSize - 1
        val checks = for (i <- 0 until loopCount) yield longer(i) == longer(lastElementIndex - i)
        checks.forall(x => x == true)
      }
}
    