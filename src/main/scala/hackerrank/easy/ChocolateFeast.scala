package com.dangiscoding
package hackerrank.easy

object ChocolateFeast extends App {
  /*
   * Complete the 'chocolateFeast' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts following parameters:
   *  1. INTEGER n
   *  2. INTEGER c
   *  3. INTEGER m
   */
  def chocolateFeast(n: Int, c: Int, m: Int): Int = {
    // Write your code here
    val initialBars = n / c
    exchangeWrappers(initialBars, initialBars, m)
  }

  def exchangeWrappers(barCount: Int, wrappers: Int, m: Int): Int = {
    if (wrappers/m == 0) return barCount
    exchangeWrappers(barCount + wrappers / m, wrappers%m + wrappers/m, m)
  }

  println(chocolateFeast(15, 3, 2))
}
