package design.patterns.factory.creationalfactory.abstractfac

import design.patterns.factory.creationalfactory.{SimpleConnection, SimpleMysqlConnection, SimplePgSqlConnection}

/**
  * DatabaseConnectorFactory
  * 抽象工厂模式
  *
  * Author: Noprom <tyee.noprom@qq.com>
  * Date: 4/22/16 6:07 AM.
  */
trait DatabaseConnectorFactory {
  def connect(): SimpleConnection
}

class MySqlFactory extends DatabaseConnectorFactory {
  override def connect(): SimpleConnection = new SimpleMysqlConnection
}

class PgSqlFactory extends DatabaseConnectorFactory {
  override def connect(): SimpleConnection = new SimplePgSqlConnection
}

class DatabaseClient(connectorFactory: DatabaseConnectorFactory) {
  def executeQuery(query: String): Unit = {
    val connection = connectorFactory.connect()
    connection.executeQuery(query)
  }
}

object AbstractFactoryApp {
  def main(args: Array[String]): Unit = {
    val clientMySql: DatabaseClient = new DatabaseClient(new MySqlFactory)
    val clientPgSql: DatabaseClient = new DatabaseClient(new PgSqlFactory)
    clientMySql.executeQuery("SELECT * FROM users")
    clientPgSql.executeQuery("SELECT * FROM employees")
  }
}