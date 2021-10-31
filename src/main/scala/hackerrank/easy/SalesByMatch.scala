package com.dangiscoding
package hackerrank.easy

object SalesByMatch extends App {
  /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

  def sockMerchant(n: Int, ar: Array[Int]): Int = {
    // Write your code here
    ar
      .groupBy(i => i)
      .map(t => t._2.length/2)
      .sum
  }

  println(sockMerchant(9, Array(10, 20, 20, 10, 10, 30, 50, 10, 20)))
}
