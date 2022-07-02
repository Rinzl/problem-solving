package com.dangiscoding
package leetcode.easy

object ImplementstrStr extends App {

  def strStr(haystack: String, needle: String): Int = {
    if (needle.isEmpty) 0
    else if (needle.length > haystack.length) -1
    else indexOf(needle, haystack, 0)

  }

  def compareSub(needle: String, haystack: String, index: Int): Boolean = {
    needle == haystack.substring(index, index + needle.length)
  }

  def indexOf(needle: String, haystack: String, index: Int): Int = {
    if (index > haystack.length - needle.length) -1
    else if (compareSub(needle, haystack, index)) index
    else indexOf(needle, haystack, index + 1)
  }

  println(strStr("aaaaa", "bbaz"))
}
