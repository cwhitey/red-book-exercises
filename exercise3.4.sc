// Generalize tail to the function drop, which removes the first n elements from a list.
// Note that this function takes time proportional only to the number of elements
// being dropped—we don’t need to make a copy of the entire List.

def drop[A](l: List[A], n: Int): List[A] =
  l match {
    case _ :: b if n > 0 => drop(b, n - 1)
    case _ => l
  }

drop(List(1,2,3,4,5), 2)

drop(List(1,2,3,4,5), 4)

drop(List[Int](), 4)