package design.patterns.factory.creationalfactory

/**
  * App
  * 工厂模式演示App
  *
  * Author: Noprom <tyee.noprom@qq.com>
  * Date: 4/14/16 6:34 AM.
  */
object App {

  def main(args: Array[String]) {
    val clientMySql: DatabaseClient = new MysqlClient
    val clientPgSql: DatabaseClient = new PgSqlClient
    clientMySql.executeQuery("SELECT * FROM users")
    clientPgSql.executeQuery("SELECT * FROM employees")
  }
}
