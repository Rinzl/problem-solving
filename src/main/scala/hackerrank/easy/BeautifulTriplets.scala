package com.dangiscoding
package hackerrank.easy

object BeautifulTriplets extends App {

  /*
    * Complete the 'beautifulTriplets' function below.
    *
    * The function is expected to return an INTEGER.
    * The function accepts following parameters:
    *  1. INTEGER d
    *  2. INTEGER_ARRAY arr
    */

  def beautifulTriplets(d: Int, arr: Array[Int]): Int = {
    var count = 0
    // Write your code here
    for (i <- 0 until arr.length - 2) {
      for (j <- i + 1 until arr.length - 1 if arr(j) - arr(i) == d) {
        for (k <- j + 1 until arr.length if arr(k) - arr(j) == d) {
          println(s"$i - $j - $k")
          if (arr(j) - arr(i) == d && arr(k) - arr(j) == d) count = count + 1
        }
      }
    }
    count
  }

  println(beautifulTriplets(1, Array(2, 2, 3, 4, 4, 5)))
}
