package com.dangiscoding
package hackerrank.easy

object RepeatedString extends App {

  def aIndices(s: String): Array[Int] = {
    s.toCharArray
      .zipWithIndex
      .filter(_._1 == 'a')
      .map(_._2 + 1)
  }

    /*
     * Complete the 'repeatedString' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. LONG_INTEGER n
     *
     * f(x) = ((n - index) / s.length) + 1 if n > s.length
     */
  def repeatedString(s: String, n: Long): Long = {
    // Write your code here
    if (n > s.length) {
      aIndices(s)
        .map(i => ((n - i)/s.length) + 1)
        .sum
    } else {
      s
        .substring(0, n.toInt)
        .toCharArray
        .count(_ == 'a')
    }
  }

  println(repeatedString("aba", 10))
}
