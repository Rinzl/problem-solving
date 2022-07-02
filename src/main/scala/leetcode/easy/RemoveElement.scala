package com.dangiscoding
package leetcode.easy

object RemoveElement extends App {
  def remove(nums: Array[Int], v: Int, k: Int = 0,  index: Int = 0): Int = {
    var k1 = k
    if (index == nums.length) return k
    if (nums(index) != v) {
      nums(k) = nums(index)
      k1 = k + 1
    }
    remove(nums, v, k1, index + 1)
  }

  def removeElement(nums: Array[Int], `val`: Int): Int = {
    remove(nums, `val`)
  }
}
