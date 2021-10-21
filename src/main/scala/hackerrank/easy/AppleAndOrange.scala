package com.dangiscoding
package hackerrank.easy

object AppleAndOrange extends App {
  /*
     * Complete the 'countApplesAndOranges' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER s
     *  2. INTEGER t
     *  3. INTEGER a
     *  4. INTEGER b
     *  5. INTEGER_ARRAY apples
     *  6. INTEGER_ARRAY oranges
     */

  def countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array[Int], oranges: Array[Int]) {
    // Write your code here
    val apple = apples
      .map(_ + a)
      .count(h => h >= s && h <= t)

    val orange = oranges
      .map(_ + b)
      .count(h => h >= s && h <= t)

    println(apple)
    println(orange)
  }
}
