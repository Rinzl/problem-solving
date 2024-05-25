package com.dangiscoding
package leetcode.easy

import scala.annotation.tailrec
import scala.collection.mutable

object HowManyNumbersAreSmallerThanTheCurrentNumber extends App {
  def smallerNumbersThanCurrent(nums: Array[Int]): Array[Int] = {
    val occurrences = nums
      .groupMapReduce(identity)(_ => 1)(_ + _)
    println(occurrences)
    val runningCountMap = runningCount(occurrences.toList.sorted, 0, 0, mutable.Map())
    println(runningCountMap)
    for (elem <- nums) yield runningCountMap(elem)
  }

  @tailrec
  def runningCount(arr: List[(Int, Int)], index: Int, count: Int, accumMap: mutable.Map[Int, Int]): mutable.Map[Int, Int] = {
    if (index == arr.length) return accumMap
    accumMap += (arr(index)._1 -> count)
    runningCount(arr, index + 1, count + arr(index)._2, accumMap)
  }

  println(smallerNumbersThanCurrent(Array(8, 7, 8, 5, 10, 7, 0)).mkString("Array(", ", ", ")"))
}
