/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Example:
 *
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */

import scala.util.control.Breaks._
object TwoSums extends App {

  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    val targetSumIndices = new Array[Int](2)
    breakable {
      for(i <- nums.indices; j <- 1 until nums.length) {
        if(i != j &&  nums(i) + nums(j) == target) {
          targetSumIndices(0) = i
          targetSumIndices(1) = j
          break
        }
      }
    }
    targetSumIndices
  }

//  val num = Array(2, 7, 11, 15)
//  val num = Array(3, 3)
  val num = Array(2, 5, 5, 11)
  val res = twoSum(num, 10)
  for(r <- 0 until res.length) {
    println(res(r))
  }

}
