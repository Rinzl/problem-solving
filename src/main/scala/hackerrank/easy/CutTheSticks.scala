package com.dangiscoding
package hackerrank.easy
import scala.annotation.tailrec
import scala.collection.mutable
object CutTheSticks extends App {
  /*
     * Complete the 'cutTheSticks' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

  def cutTheSticks(arr: Array[Int]): Array[Int] = {
    // Write your code here
    @tailrec
    def cut(array: Array[Int], state: mutable.ArrayBuffer[Int]): Array[Int] = {
      if (array.isEmpty) state.toArray
      else {
        state += array.length
        val minVal = array.min
        cut(array.map(_ - minVal).filter(_ != 0), state)
      }
    }

    cut(arr, mutable.ArrayBuffer[Int]())
  }

  println(cutTheSticks(Array(5, 4, 4, 2, 2, 8)).mkString("Array(", ", ", ")"))
}
