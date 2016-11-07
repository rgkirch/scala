/**
  * Created by richie on 7/11/16.
  */
object Exercise {
    // get the nth fibinacci number of the sequence starting with 0 1 1
    def f0201Fibinacci(n: Int): Int = {
        def go(n: Int, left: Int, right: Int): Int = {
            if (n <= 0) left
            else go(n - 1, right, left + right)
        }
        go(n, 0, 1)
    }
    def f0202IsSorted[A](as: Array[A], ordered: (A,A) => Boolean): Boolean = {
        as.sliding(2).forall((pair: Array[A]) => ordered(pair(0), pair(1)));
    }
    def f0203Curry[A,B,C](f: (A, B) => C): A => (B => C) = {
        (a: A) => (b: B) => f(a, b)
    }
    def f0204Uncurry[A,B,C](f: A => B => C): (A, B) => C = {
        (a: A, b: B) => f(a)(b)
    }
    def f0205Compose[A,B,C](f: B => C, g: A => B): A => C = {
        (a: A) => f(g(a))
    }
}
