package design.patterns.creationalfactory

/**
  * 工厂模式的客户端
  *
  * Author: Noprom <tyee.noprom@qq.com>
  * Date: 4/14/16 6:31 AM.
  */
abstract class DatabaseClient {
  def executeQuery(query: String): Unit = {
    val connection = connect()
    connection.executeQuery(query)
  }

  protected def connect(): SimpleConnection
}

class MysqlClient extends DatabaseClient {
  override protected def connect(): SimpleConnection = new
      SimpleMysqlConnection
}

class PgSqlClient extends DatabaseClient {
  override protected def connect(): SimpleConnection = new
      SimplePgSqlConnection
}
