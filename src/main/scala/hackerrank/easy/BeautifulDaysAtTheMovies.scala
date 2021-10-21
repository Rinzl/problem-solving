package com.dangiscoding
package hackerrank.easy

import scala.annotation.tailrec

object BeautifulDaysAtTheMovies extends App {
  /*
       * Complete the 'beautifulDays' function below.
       *
       * The function is expected to return an INTEGER.
       * The function accepts following parameters:
       *  1. INTEGER i
       *  2. INTEGER j
       *  3. INTEGER k
       */

  @tailrec
  def reverse(n: Int, r: Int = 0): Int = {
    if (n == 0) return r
    reverse(n/10, r*10 + n%10)
  }

  @tailrec
  def countBeautifulDays(i: Int, j: Int, current: Int, k: Int, count: Int = 0): Int = {
    if (current < i) return count
    if (Math.abs(current - reverse(current)) % k == 0) countBeautifulDays(i, j, current - 1, k, count + 1)
    else countBeautifulDays(i, j, current - 1, k, count)
  }

  def beautifulDays(i: Int, j: Int, k: Int): Int = {
    // Write your code here
    countBeautifulDays(i, j, j, k)
  }

  println(beautifulDays(13, 45, 3))
}
