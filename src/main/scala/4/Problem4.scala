package `4`

object Problem4 {
  def solve[X](list: Seq[X]): Integer =
    list match
      case Nil => 0
      case something => something.size

  def solveRecursive[X](list: Seq[X]): Integer =
    list match
      case Nil => 0
      case head :: tail => 1 + solveRecursive(tail)
}
