package com.dangiscoding
package hackerrank.easy

import scala.annotation.tailrec

object CountingValleys extends App {
  /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

  def countingValleys(steps: Int, path: String): Int = {

    @tailrec
    def count(i: Int = 0, steps: Int, seaLevel: Boolean = true, height: Int = 0, valleys: Int = 0): Int = {
      if (i == steps) return valleys
      if (seaLevel && path.charAt(i) == 'D') count(i + 1, steps, seaLevel = false, height - 1, valleys + 1)
      else if (path.charAt(i) == 'D') count(i + 1, steps, (height - 1) == 0, height - 1, valleys)
      else count(i + 1, steps, (height + 1) == 0, height + 1, valleys)
    }

    // Write your code here
    count(0, steps)
  }

  println(countingValleys(8, "UDDDUDUU"))
}
