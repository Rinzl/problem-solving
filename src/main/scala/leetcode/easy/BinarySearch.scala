package com.dangiscoding
package leetcode.easy

import scala.annotation.tailrec

object BinarySearch extends App {
  def search(nums: Array[Int], target: Int): Int = {
    @tailrec
    def search(nums: Array[Int], target: Int, start: Int, end: Int): Int = {
      val mid = (start + end) / 2
      if (nums(mid) == target) return mid
      if (start >= end) return -1
      if (nums(mid) < target) {
        search(nums, target, mid + 1, end);
      }
      else {
        search(nums, target, start, mid - 1);
      }
    }

    search(nums, target, 0, nums.length - 1)
  }


  println(search(Array(-1, 0, 3, 5, 9, 12), 2))
}
