package com.dangiscoding
package leetcode.easy

import scala.annotation.tailrec

object RunningSumOf1dArray extends App {
  def runningSum(nums: Array[Int]): Array[Int] = {
    sumOf1dArray(nums, 1)
  }

  @tailrec
  def sumOf1dArray(nums: Array[Int], index: Int): Array[Int] = {
    if (index == nums.length) {
      nums
    } else {
      nums(index) = nums(index - 1) + nums(index)
      sumOf1dArray(nums, index + 1)
    }
  }



  println(runningSum(Array(1, 1, 1, 1, 1)).mkString("Array(", ", ", ")"))
}
