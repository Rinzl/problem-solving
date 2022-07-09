package com.dangiscoding
package leetcode.easy

import scala.annotation.tailrec

object ReverseString extends App {

  def reverseString(s: Array[Char]): Unit = {
    reverseString(s, 0, s.length - 1)
  }

  @tailrec
  def reverseString(s: Array[Char], i: Int, j: Int): Array[Char] = {
    if (i > j) s
    else {
      val t = s(i)
      s(i) = s(j)
      s(j) = t
      reverseString(s, i + 1, j - 1)
    }
  }

  val s = Array('h', 'e', 'l', 'l', 'o')
  reverseString(s)
  println(s.mkString("Array(", ", ", ")"))
}
