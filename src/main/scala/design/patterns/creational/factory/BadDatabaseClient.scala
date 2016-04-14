package design.patterns.creational.factory

/**
  * BadDatabaseClient
  *
  * Author: Noprom <tyee.noprom@qq.com>
  * Date: 4/15/16 6:14 AM.
  */
abstract class BadDatabaseClient {
  def executeQuery(query: String): Unit = {
    val connection = connect()
    val connectionPrinter = getConnectionPrinter()
    connectionPrinter.printSimpleConnection(connection)
    connection.executeQuery(query)
  }

  protected def connect(): SimpleConnection

  protected def getConnectionPrinter(): SimpleConnectionPrinter
}

class SimpleMySqlConnectionPrinter extends SimpleConnectionPrinter {
  override def printSimpleConnection(connection: SimpleConnection): Unit = {
    System.out.println(s"I require a MySQL connection. It is: ${connection.getName()}'")
  }
}

class SimplePgSqlConnectionPrinter extends SimpleConnectionPrinter {
  override def printSimpleConnection(connection: SimpleConnection): Unit = {
    System.out.println(s"I require a PgSQL connection. It is: ${connection.getName()}'")
  }
}

