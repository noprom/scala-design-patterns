package design.patterns.creational.factory

/**
  *
  * Author: Noprom <tyee.noprom@qq.com>
  * Date: 4/14/16 6:25 AM.
  */
trait SimpleConnection {
  def getName(): String

  def executeQuery(query: String): Unit
}

class SimpleMysqlConnection extends SimpleConnection {
  override def getName(): String = "SimpleMysqlConnection"

  override def executeQuery(query: String): Unit = {
    System.out.println(s"Executing the query '$query' the MySQL way.")
  }
}
