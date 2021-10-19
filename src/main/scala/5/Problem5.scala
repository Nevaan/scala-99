package `5`

object Problem5 {
  def solve[X](list: Seq[X]): Seq[X]= 
    list match
      case Nil => List()
      case x => x.reverse

  def solveRecursive[X](list: Seq[X]): Seq[X] = 
    list match
      case Nil => List()
      case something => something.last :: solveRecursive(something.init).toList
}
    