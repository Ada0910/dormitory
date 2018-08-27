package com.test.operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.test.layout.Layout;

/**
 * @author лΰ��
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

	// ʵ�����ݿ����ӵķ���
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

	// �ر����ݿ�
	public void close() throws SQLException {
		if (connection != null && !connection.isClosed()) {
			connection.close();
		}
	}

}
