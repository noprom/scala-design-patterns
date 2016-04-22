package design.patterns.factory.lazyini

import java.util.Properties

/**
  * CircleUtils
  * 使用懒加载
  *
  * Author: Noprom <tyee.noprom@qq.com>
  * Date: 4/23/16 6:24 AM.
  */
object CircleUtils {
  val basicPi = 3.14

  lazy val precisePi: Double = {
    println("Reading properties for the precise PI.")
    val props = new Properties()
    props.load(getClass.getResourceAsStream("pi.properties"))
    props.getProperty("pi.high").toDouble
  }

  /**
    * 计算面积
    *
    * @param radius    半径
    * @param isPrecise 是否精确到小数点
    * @return 面积
    */
  def area(radius: Double, isPrecise: Boolean = false): Double = {
    val pi: Double = if (isPrecise) precisePi else basicPi
    pi * Math.pow(radius, 2)
  }
}

object LazyApp {
  def main(args: Array[String]) {
    println(s"The basic area for a circle with radius 2.5 is ${CircleUtils.area(2.5)}")
    println(s"The precise area for a circle with radius 2.5 is ${CircleUtils.area(2.5, true)}")
    println(s"The basic area for a circle with radius 6.78 is ${CircleUtils.area(6.78)}")
    println(s"The precise area for a circle with radius 6.78 is ${CircleUtils.area(6.78, true)}")
  }
}
