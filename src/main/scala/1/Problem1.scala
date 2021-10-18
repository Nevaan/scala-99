package `1`

object Problem1 {
  def solve[X](list: Seq[X]): X = list.last

  def solveRecursive[X](list: Seq[X]): X = 
    list match 
      case lastElement :: Nil => lastElement
      case element :: moreElements => solveRecursive(moreElements)
      case _ => throw new NoSuchElementException
}
