// Using the same idea, implement the function setHead for replacing
// the first element of a List with a different value.

def setHead[A](l: List[A], thing: A): List[A] =
  l match {
    case _ :: b => thing :: b
    case _ => l
  }

setHead(List(1,2,3,4,5), 100)

setHead(List(1), 100)

setHead(List(), 100)