// Implement dropWhile, which removes elements from the List prefix
// as long as they match a predicate.

def dropWhile[A](l: List[A], f: A => Boolean): List[A] =
  l match {
    case a :: b if f(a) => dropWhile(b, f)
    case _ => l
  }

dropWhile[Int](List(1,2,3,4,5), _ < 4)

dropWhile[Int](List(1,2,3,4,5), _ == 1)

dropWhile[Int](List(), _ == 0)