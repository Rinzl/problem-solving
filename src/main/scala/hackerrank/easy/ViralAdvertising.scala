package com.dangiscoding
package hackerrank.easy

import scala.annotation.tailrec

object ViralAdvertising extends App {
  /*
       * Complete the 'viralAdvertising' function below.
       *
       * The function is expected to return an INTEGER.
       * The function accepts INTEGER n as parameter.
       */
  @tailrec
  def countLikedViral(day: Int, n: Int, received: Int = 5, liked: Int = 0): Int = {
    if (day > n) return liked
    countLikedViral(day + 1, n, received/2*3, liked + received / 2)
  }
  def viralAdvertising(n: Int): Int = {
    // Write your code here
    countLikedViral(1, n)
  }

  println(viralAdvertising(3))
}
