package com.dangiscoding
package hackerrank.easy

import scala.annotation.tailrec

object SubarrayDivision extends App {

  def sumSubArray(arr: Array[Int], begin: Int, end: Int): Int = {
    var sum = 0
    for (i <- begin to end) {
      sum = sum + arr(i)
    }
    sum
  }
    /*
     * Complete the 'birthday' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY s
     *  2. INTEGER d
     *  3. INTEGER m
     */

  def birthday(s: Array[Int], d: Int, m: Int): Int = {
    // Write your code here

    @tailrec
    def countShare(i: Int = 0, count: Int = 0): Int = {
      if (i + m > s.length) return count
      if (sumSubArray(s, i, i + m - 1) == d) countShare(i + 1, count + 1)
      else countShare(i + 1, count)
    }

    countShare()
  }

  println(birthday(Array(2, 2, 1, 3, 2), 4, 2))
}
