package `2`


// should one element array return the only element? 
object Problem2 {

  def solve[X](list: Seq[X]): Option[X] = 
    list match
      case Nil => None
      case nonEmptyList => nonEmptyList.length match
        case 0 => None
        case 1 => Some(nonEmptyList.head)
        case _ => Some(nonEmptyList.init.reverse.head)

  def solveRecursive[X](list: Seq[X]): Option[X] =
    list match 
      case Nil => None
      case onlyElement :: Nil => Some(onlyElement)
      case lastButOne :: _ :: Nil => Some(lastButOne)
      case first :: rest => solveRecursive(rest)
  
}
