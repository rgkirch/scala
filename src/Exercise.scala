/**
  * Created by richie on 7/11/16.
  */
object Exercise {
    def main(args: Array[String]): Unit = {
        print(f0201Fibinacci(5));
    }
    // get the nth fibinacci number of the sequence starting with 0 1 1
    def f0201Fibinacci(n: Int): Int = {
        def go(n: Int, left: Int, right: Int): Int = {
            if (n <= 0) left
            else go(n - 1, right, left + right)
        }
        go(n, 0, 1)
    }
}
