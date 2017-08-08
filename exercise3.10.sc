// Our implementation of foldRight is not tail-recursive and will result
// in a StackOverflowError for large lists (we say it’s not stack-safe).
// Convince yourself that this is the case, and then write another general
// list-recursion function, foldLeft, that is tail-recursive, using the
// techniques we discussed in the previous chapter.

def length[A](as: List[A]): Int =
  as.foldLeft(0)((acc, _) => acc + 1)

length(List(1,2,3,4))
length(List(2))
length(List())