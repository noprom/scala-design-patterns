package design.patterns.creationalfactory

/**
  * BasApp
  *
  * Author: Noprom <tyee.noprom@qq.com>
  * Date: 4/15/16 6:26 AM.
  */
object BasApp {

  def main(args: Array[String]) {
    val clientMySql: BadDatabaseClient = new BadMySqlClient
    val clientPgSql: BadDatabaseClient = new BadPgSqlClient
    clientMySql.executeQuery("SELECT * FROM users")
    clientPgSql.executeQuery("SELECT * FROM employees")
  }
}
