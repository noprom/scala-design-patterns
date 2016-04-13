import scala.annotation.tailrec

/**
  * FactorialRecur2
  *
  * Author: Noprom <tyee.noprom@qq.com>
  * Date: 16/3/10 下午3:05.
  */
object FactorialRecur2 {

  /**
    * 递归求阶乘
    *
    * @param i
    * @return
    */
  def factorial(i: BigInt): BigInt = {
    @tailrec
    def fact(i: BigInt, accumulator: BigInt): BigInt =
      if (i == 1) accumulator
      else fact(i - 1, i * accumulator)
    fact(i, 1)
  }

  def main(args: Array[String]) {
    println(s"365! = ${factorial(365)}")
//    for (i <- 1 to 10)
//      println(s"$i:\t${factorial(i)}")
  }
}

/**
  * 1:	1
  * 2:	2
  * 3:	6
  * 4:	24
  * 5:	120
  * 6:	720
  * 7:	5040
  * 8:	40320
  * 9:	362880
  * 10:	3628800
  **/