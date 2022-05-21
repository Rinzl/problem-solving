package com.dangiscoding
package leetcode.easy

import scala.annotation.tailrec

object FirstBadVersion extends App {
  def isBadVersion(i: Int): Boolean = {
    i == 1702766719
  }

  // 1 2 3 4
  @tailrec
  def find(start: Int, end: Int): Int = {
    if (start == end) return start
    val mid = start/2 + end/2
    var nStart = start
    var nEnd = end
    if (isBadVersion(mid)) {
      if (isBadVersion(mid - 1)) {
        nStart = start
        nEnd = mid -1
      }
      else return mid
    } else {
      nStart = mid + 1
      nEnd = end
    }
    find(nStart, nEnd)
  }

  def firstBadVersion(n: Int): Int = {
    if(n==1) return 1
    if(isBadVersion(1)) return 1
    find(2, n)
  }

  println(firstBadVersion(2126753390))
}