// Compute the length of a list using foldRight.

def length[A](as: List[A]): Int =
  as.foldRight(0)((_, acc) => acc + 1)

length(List(1,2,3,4))
length(List(2))
length(List())