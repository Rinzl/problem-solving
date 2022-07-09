package com.dangiscoding
package leetcode.easy

import scala.annotation.tailrec


object AddStrings extends App {
  def addStrings(num1: String, num2: String): String = {
    val num1CharArr = num1.toCharArray
    val num2CharArr = num2.toCharArray
    if (num1.length >= num2.length) addStrings(num1CharArr, num2CharArr, num1.length - 1,  num2.length - 1)
    else addStrings(num2CharArr, num1CharArr, num2.length - 1, num1.length - 1)
  }

  // add as integer
  // return (remainder, mod value)
  def add(x: String, y: String, remainder: Int): (Int, Int) = {
    val added = x.toInt + y.toInt + remainder
    (added / 10, added % 10)
  }

  // a length must be bigger or equal to b
  @tailrec
  def addStrings(a: Array[Char], b: Array[Char], aIndex: Int,bIndex: Int, remainder: Int = 0):String = {
    if (bIndex < 0 && remainder == 0) String.valueOf(a)
    else if (bIndex < 0 && remainder > 0 && aIndex >= 0) {
      val ai = a(aIndex)
      val added = add(String.valueOf(ai), "0", remainder)
      a(aIndex) = added._2.toString.charAt(0)
      addStrings(a, b, aIndex - 1, bIndex, added._1)
    }
    else if (bIndex < 0 && remainder > 0 && aIndex < 0) {
      remainder.toString + String.valueOf(a)
    }
    else {
      val ai = a(aIndex)
      val bi = b(bIndex)
      val added = add(String.valueOf(ai), String.valueOf(bi), remainder)
      a(aIndex) = added._2.toString.charAt(0)
      addStrings(a, b, aIndex - 1, bIndex - 1, added._1)
    }
  }

  println(addStrings("1", "2"))

}
