package example

object Lists {

  /**
   * This method computes the length of the list xs. 
   *
   * For this example assignment you can use the following methods in class
   * `List`:
   *
   * - `xs.isEmpty: Boolean` returns `true` if the list `xs` is empty
   * - `xs.head: Int` returns the head element of the list `xs`. If the list
   * is empty an exception is thrown
   * - `xs.tail: List[Int]` returns the tail of the list `xs`, i.e. the the
   * list `xs` without its `head` element
   *
   * ''Hint:'' instead of writing a `for` or `while` loop, think of a recursive
   * solution.
   *
   * @param xs A list of natural numbers
   * @return The length of the list in `xs`
   */
  def length(xs: List[Int]): Int = {
    def lengthAccumulator(length: Int, xs: List[Int]): Int ={
      xs match {
        case Nil => length
        case _ => lengthAccumulator(length + 1,xs.tail) //tail recursive
      }
    }

    lengthAccumulator(0,xs)
  }

  /**
   * This method returns the smallest element in a list of integers. If the
   * list `xs` is empty it throws a `java.util.NoSuchElementException`.
   *
   * You can use the same methods of the class `List` as mentioned above.
   *
   * ''Hint:'' Again, think of a recursive solution instead of using looping
   * constructs. You might need to define an auxiliary method.
   *
   * @param xs A list of natural numbers
   * @return The smallest element in `xs`
   * @throws java.util.NoSuchElementException if `xs` is an empty list
   */
  def min(xs: List[Int]): Int = {
    def minList(head: Int, list: List[Int]): Int = {
      def minInt( head1: Int): Int = {
        if(head < head1) head else head1
      }
      if (Nil == list) head
      else minList(minInt(list.head), list.tail) //tail recursive
    }

    minList(xs.head, xs.tail)
  }
}