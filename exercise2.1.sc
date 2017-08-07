// Write a recursive function to get the nth Fibonacci number (http://mng.bz/C29s).
// The first two Fibonacci numbers are 0 and 1.
//The nth number is always the sum of the previous two—the sequence begins 0, 1, 1, 2, 3, 5.
// Your definition should use a local tail-recursive function.

@annotation.tailrec
def fib(n: Int): Int =
  n match {
    case n if n == 0 || n == 1 => n
    case _ => fib(n - 1) + fib(n - 2)
  }

fib(6)
fib(10)