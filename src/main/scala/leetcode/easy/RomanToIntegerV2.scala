package com.dangiscoding
package leetcode.easy


object RomanToIntegerV2 extends App {
  val romanToIntegerMap: Map[Char, Int] = Map(
    'I' -> 1,
    'V' -> 5,
    'X' -> 10,
    'L' -> 50,
    'C' -> 100,
    'D' -> 500,
    'M' -> 1000)

  def romanToInt(s: String): Int = {
    romanToInt(s.toCharArray)
  }

  def romanToInt(array: Array[Char], pos: Int = 0, accumulator: Int = 0): Int = {
    if (pos == array.length) accumulator
    else {
      val accum = if (pos != array.length - 1 && romanToIntegerMap(array(pos)) < romanToIntegerMap(array(pos + 1)))
        {
          accumulator - romanToIntegerMap(array(pos))
        } else {
        accumulator + romanToIntegerMap(array(pos))
      }
      romanToInt(array, pos + 1, accum)
    }
  }

  println(romanToInt("MCMXCIV"))
}
