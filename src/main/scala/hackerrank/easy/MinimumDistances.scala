package com.dangiscoding
package hackerrank.easy

object MinimumDistances extends App {
  /*
   * Complete the 'minimumDistances' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts INTEGER_ARRAY a as parameter.
   */

  def minimumDistances(a: Array[Int]): Int = {
    // Write your code here
    val temp = Array.ofDim[Int](100_000 + 1).map(_ => -1)
    var minDistance = Int.MaxValue
    for (i <- a.indices) {
      val v = a(i)
      if (temp(v) == -1) temp(v) = i
      else if (minDistance > (i - temp(v))) {
        minDistance = i - temp(v)
        temp(v) = i
      }
      else temp(v) = i
    }

    if (minDistance == Int.MaxValue) -1 else minDistance
  }

  println(minimumDistances(Array(7, 1, 3, 4, 1, 7)))
}
