package functions

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if (0 > c || 0 > r) throw new IllegalArgumentException("Only positive arguments allowed")
    (c, r) match {
      case (0, _) => 1
      case (_, 0) => 1
      case (_, _) if (c == r) => 1
      case _ => pascal(c - 1, r - 1) + pascal(c, r - 1)
    }
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def balanceHelper(opens: Int, closes: Int, charsLeft: List[Char]): Boolean = {
      if (charsLeft.isEmpty) (opens - closes).equals(0)
      else {
        charsLeft.head match {
          case _ if (closes > opens) => false
          case '(' => balanceHelper(opens + 1, closes, charsLeft.tail)
          case ')' => balanceHelper(opens, closes + 1, charsLeft.tail)
          case _ => balanceHelper(opens, closes, charsLeft.tail)
        }
      }
    }

    balanceHelper(0, 0, chars)
  }


  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    coins match {
      case Nil => 0
      case _ if (money < 0) => 0
      case _ if (money == 0) => 1
      case _ => countChange(money, coins.tail) + countChange(money - coins.head, coins)
    }
  }
}
