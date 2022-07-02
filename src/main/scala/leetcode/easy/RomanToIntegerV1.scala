package com.dangiscoding
package leetcode.easy

import scala.annotation.tailrec
import scala.collection.mutable


object RomanToIntegerV1 extends App {
  val romanToIntegerMap: Map[String, Int] = Map(
    "I" -> 1,
    "II" -> 2,
    "III" -> 3,
    "IV" -> 4,
    "V" -> 5,
    "IX" -> 9,
    "X" -> 10,
    "XL" -> 40,
    "L" -> 50,
    "XC" -> 90,
    "C" -> 100,
    "CD" -> 400,
    "D" -> 500,
    "CM" -> 900,
    "M" -> 1000)

  def romanToInt(s: String): Int = {
    val romanQ: mutable.Queue[String] = mutable.Queue(s.toCharArray.map(String.valueOf): _*)
    @tailrec
    def romanToInt(accumulator: Int = 0): Int = {
      if (romanQ.isEmpty) accumulator
      else romanToInt(accumulator + dequeueUntilInvalid(romanQ, ""))
    }
    romanToInt()
  }

  @tailrec
  def dequeueUntilInvalid(queue: mutable.Queue[String], accumulator: String): Int = {
    if (queue.isEmpty) romanToIntegerMap(accumulator)
    else {
      val head = queue.head
      if (!romanToIntegerMap.contains(accumulator + head)) romanToIntegerMap(accumulator)
      else dequeueUntilInvalid(queue, accumulator + queue.dequeue())
    }
  }

  println(romanToInt("MCMXCIV"))
}
