// Implement isSorted, which checks whether an Array[A] is sorted according to a given comparison function:

def isSorted[A](as: Array[A], ordered: (A,A) => Boolean): Boolean =
  as.sortWith(ordered).deep == as.deep

isSorted[Int](Array(1, 2), _ < _) // true

isSorted[Int](Array(2, 1), _ < _) // false