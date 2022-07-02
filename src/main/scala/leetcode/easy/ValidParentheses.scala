package com.dangiscoding
package leetcode.easy
import scala.collection.mutable

object ValidParentheses extends App {
  def isClose(c: Char): Boolean = {
    c == '}' || c == ')' || c == ']'
  }
  def isCloseRight(openChar: Char, closeChar: Char): Boolean = {
    (openChar == '(' && closeChar == ')') ||
      (openChar == '{' && closeChar == '}') ||
      (openChar == '[' && closeChar == ']')
  }

  def isValid(s: String, index:Int, openStack: mutable.Stack[Char]): Boolean = {
    val si = s(index)
    if (isClose(s(index))) {
      if (openStack.isEmpty) return false
      val c = openStack.pop()
      if (!isCloseRight(c, si)) return false
    }
    else {
      openStack.push(si)
    }
    if(index == s.length - 1 && openStack.isEmpty) return true
    else if (index == s.length - 1 && openStack.nonEmpty) return false
    isValid(s, index + 1, openStack)
  }

  def isValid(s: String): Boolean = {
    val openStack = mutable.Stack[Char]()
    isValid(s, index = 0, openStack)
  }
}
