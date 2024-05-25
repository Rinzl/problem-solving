package com.dangiscoding
package leetcode.easy

import scala.annotation.tailrec

object DefangingAnIPAddress extends App {
  def defangIPaddr(address: String): String = {
    defang(address)
  }

  @tailrec
  def defang(s: String, index: Int = 0, accum: StringBuilder = new StringBuilder()): String = {
    if (index == s.length) return accum.toString()
    val sToAppend = if (s.charAt(index) == '.') "[.]" else s.charAt(index)
    accum.append(sToAppend)
    defang(s, index + 1, accum)
  }

  println(defangIPaddr("1.1.1.1"))
}
