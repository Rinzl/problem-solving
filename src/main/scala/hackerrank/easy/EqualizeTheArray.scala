package com.dangiscoding
package hackerrank.easy

object EqualizeTheArray extends App {
  /*
     * Complete the 'equalizeArray' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

  def equalizeArray(arr: Array[Int]): Int = {
    // Write your code here
    val maxOccurrenceVal = arr
      .groupMapReduce(i => i)(_ => 1)(_ + _)
      .toList
      .maxBy(_._2)
      ._1
    arr.count(_ != maxOccurrenceVal)
  }

  println(equalizeArray(Array(1, 2, 2, 3)))
}
