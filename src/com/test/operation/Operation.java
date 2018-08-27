package com.test.operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.test.layout.Layout;

/**
 * @author 谢伟宁
 *
 */
public class Operation {

	protected static final String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	protected final String urlName = "jdbc:sqlserver://localhost:1433;DatabaseName=dormitorysystem";
	protected final String passWord = "azhuzai";
	protected final String userName = "sa";
	static Connection connection = null;

	public Operation() {

	}

	// 实现数据库连接的方法
	public static Connection openConnection(String urlName, String userName, String passWord)
			throws ClassNotFoundException, SQLException {
		Class.forName(driverName);

		if (null != connection && !connection.isClosed()) {
			return connection;

		} else {
			connection = DriverManager.getConnection(urlName, userName, passWord);
		}
		return connection;
	}

	// 关闭数据库
	public void close() throws SQLException {
		if (connection != null && !connection.isClosed()) {
			connection.close();
		}
	}

}
