/**
 *@author{ΰ��} 
 *@ע�ͣ�
 */
package com.test.operation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.test.layout.Layout;

/**
 * @author лΰ��
 *
 */
public class InsertOperation {

	Operation operation = new Operation();
	String urlName = operation.urlName;
	String userName = operation.userName;
	String passWord = operation.passWord;
	Connection connection = operation.connection;

	// ����ѧ�Ų�ѯѧ����ķ���
	public void InsertOp(String sql) throws ClassNotFoundException, SQLException {
		connection = Operation.openConnection(urlName, userName, passWord);
		PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
		preparedStatement.executeUpdate();
		operation.close();
		preparedStatement.close();
	}

}
