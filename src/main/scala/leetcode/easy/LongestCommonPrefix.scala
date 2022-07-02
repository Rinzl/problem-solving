package com.dangiscoding
package leetcode.easy

object LongestCommonPrefix extends App {
  def longestCommonPrefix(strs: Array[String]): String = {
    if (!testPrefixCommon(strs, 0)) ""
    else {
      val i = longestCommonPrefix(strs, 1)
      strs(0).substring(0, i)
    }
  }

  def longestCommonPrefix(strs: Array[String], index: Int = 1): Int = {
    if (!testPrefixCommon(strs, index)) index
    else longestCommonPrefix(strs, index + 1)
  }

  def testPrefixCommon(strs: Array[String], index: Int): Boolean = {
    try {
      val c = strs(0).charAt(index)
      val count = strs
        .count(_.charAt(index) == c)
      count == strs.length
    } catch {
      case _: Throwable => false
    }
  }

  println(longestCommonPrefix(Array("dog","racecar","car")))
}
