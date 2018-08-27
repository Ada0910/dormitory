/**
 *@author{Î°Äþ} 
 *@×¢ÊÍ£º
 */
package com.test.operation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.test.layout.Layout;

public class DeleteOperation {

	Operation operation = new Operation();
	String urlName = operation.urlName;
	String userName = operation.userName;
	String passWord = operation.passWord;
	Connection connection = Operation.connection;

	public void result(String sql) throws ClassNotFoundException, SQLException {
		connection = Operation.openConnection(urlName, userName, passWord);
		PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
		preparedStatement.executeUpdate();
		operation.close();
		preparedStatement.close();

	}

}
