package `3`

object Problem3 {
  
  def solve[X](n: Integer, list: Seq[X]): Option[X] = 
    list match
      case Nil => None
      case something if something.size > n => Some(something(n))
      case _ => None

  def solveRecursive[X](n: Integer, list: Seq[X]): Option[X] = 
    n match 
      case 0 if list.isEmpty=> None
      case 0 => Some(list.head)
      case x if list.size > 1 => solveRecursive(x - 1, list.tail)
      case x => None

}
    