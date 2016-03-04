package lists

import scala.annotation.tailrec
import scala.Option

/**
	Problem described here: http://projecteuler.net/problem=67
*/
object MaximumPathSum {

  // sum - is maximum sum of numbers along this path.
  // value - is last number in this path.
  // previous - is link to previous number from this path.
  case class Path(sum:Long, value: Int, previous: Option[Path])

  // Extends previous path by one number of triangle
  def extendPath(newValue: Int, previous: Option[Path]): Path = ???

  // Find optimal solution (path with maximum sum) for every number from the bottom line of triangle. 
  // You can split this function to several ones.
  def calculateOptimalPaths(data:List[List[Int]]): List[Path] = ???

  // Return list of number along the path (staring from top of triangle to bottom).
  def numbersForPath(path:Option[Path]): List[Int] = ???

  // Select path that have maximum sum. Should return empty list if paths is empty list.
  def bestPath(paths:List[Path]): Option[Path] = ???

  // Return sum for best path from paths. Should return zero if paths is empty list. Reuse bestPath to find best path.
  def bestSum(paths:List[Path]): Long = ???

  // Return number along best path. Should return empty list if paths is empty list. Reuse both bestPath and numbersForPath.
  def bestSumNumbers(paths:List[Path]): List[Int] = ???
}