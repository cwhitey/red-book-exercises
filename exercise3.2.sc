// Implement the function tail for removing the first element of a List.
// Note that the function takes constant time.
// What are different choices you could make in your implementation if the List is Nil?
// We’ll return to this question in the next chapter.

def tail[A](l: List[A]): List[A] =
  l match {
    case _ :: b => b
    case _ => l
  }

tail(List(1,2,3,4,5))

tail(List(1))

tail(List())