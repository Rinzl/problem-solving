package com.dangiscoding
package hackerrank.easy

import scala.collection.mutable

object StringAnagram extends App {
  /*
       * Complete the 'stringAnagram' function below.
       *
       * The function is expected to return an INTEGER_ARRAY.
       * The function accepts following parameters:
       *  1. STRING_ARRAY dictionary
       *  2. STRING_ARRAY query
       */

  def stringAnagram(dictionary: Array[String], query: Array[String]): Array[Int] = {
    val transformedDict = dictionary.map(sortString)
    val transformedQuery = query.map(sortString)
    val anagramCountMap = mutable.Map[String, Int]()
    transformedQuery.foreach(s => anagramCountMap += (s -> 0))

    def count(s: String): Unit = {
      if (anagramCountMap.contains(s)) {
        val count = anagramCountMap(s) + 1
        anagramCountMap += (s -> count)
      } else {
        anagramCountMap += (s -> 1)
      }
    }

    transformedDict.foreach(count)

    transformedQuery.map(s => anagramCountMap.getOrElse(s, 0))
  }

  def sortString(str: String): String = {
    val array = str.toCharArray

    new String(array.sorted)
  }

  println(stringAnagram(Array("heater", "cold", "clod", "reheat", "docl"), Array("codl", "heater", "abcd")).mkString("Array(", ", ", ")"))
}
