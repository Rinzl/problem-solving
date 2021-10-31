package com.dangiscoding
package hackerrank.easy

object AlternatingCharacters extends App {
  /*
   * Complete the 'alternatingCharacters' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts STRING s as parameter.
   */
  def countDeletion(s: String, curPos: Int, prevChar: Char, deletionNums: Int = 0): Int = {
    if (curPos == s.length) return deletionNums
    if (s.charAt(curPos) == prevChar) countDeletion(s, curPos + 1, prevChar, deletionNums + 1)
    else countDeletion(s, curPos + 1, s.charAt(curPos), deletionNums)
  }

  def alternatingCharacters(s: String): Int = {
    // Write your code here
    countDeletion(s, 1, s.charAt(0))
  }

  println(alternatingCharacters("AAAA"))
}
