package design.patterns.creational.factory.abstractfac

import design.patterns.creational.factory.{SimplePgSqlConnection, SimpleMysqlConnection, SimpleConnection}

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