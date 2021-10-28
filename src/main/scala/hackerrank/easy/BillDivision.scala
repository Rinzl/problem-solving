package com.dangiscoding
package hackerrank.easy

object BillDivision extends App {
  def bonAppetit(bill: Array[Int], k: Int, b: Int): Unit = {
    // Write your code here
    val actual = bill
      .zipWithIndex
      .filter(_._2 != k)
      .map(_._1)
      .sum / 2

    if (actual == b) println("Bon Appetit")
    else println(b - actual)
  }
  bonAppetit(Array(3, 10, 2, 9), 1, 12)
}
