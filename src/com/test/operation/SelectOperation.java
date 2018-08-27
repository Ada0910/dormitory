package com.test.operation;

import java.awt.Font;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.test.insert.StudentInsert;
import com.test.layout.Layout;

public class SelectOperation {

	Operation operation = new Operation();
	String urlName = operation.urlName;
	String userName = operation.userName;
	String passWord = operation.passWord;
	Connection connection = Operation.connection;
	

	public void result(String sql) throws ClassNotFoundException, SQLException {
		connection = Operation.openConnection(urlName, userName, passWord);
		Layout.jTextArea.append("\n");
        Layout.jTextArea.setFont(new Font("kaiti", 1, 24));
		PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
				Layout.jTextArea.append(resultSet.getString(i) + "  ");

			}
			Layout.jTextArea.append("\n");
		}
		Layout.jTextArea.append("\n\n");
		operation.close();
		preparedStatement.close();

	}
	
	public void lateInformation(String sql) throws SQLException, ClassNotFoundException{
		connection = Operation.openConnection(urlName, userName, passWord);
		Layout.jTextArea.append("\n");
        Layout.jTextArea.setFont(new Font("kaiti", 1, 24));
			CallableStatement callableStatement =null;
			ResultSet resultSet=null;
			callableStatement = connection.prepareCall("{call lateInfo(?)}");
			callableStatement.setString(1, sql);
			resultSet =callableStatement.executeQuery();
			while (resultSet.next()) {
				for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
					Layout.jTextArea.append(resultSet.getString(i) + "  ");

				}
				Layout.jTextArea.append("\n");
			}
			Layout.jTextArea.append("\n\n");
			callableStatement.close();
		
		
			// TODO Auto-generated catch block
		
	}



public void leaveInformation(String sql) throws SQLException, ClassNotFoundException{
	connection = Operation.openConnection(urlName, userName, passWord);
	Layout.jTextArea.append("\n");
    Layout.jTextArea.setFont(new Font("kaiti", 1, 24));
		CallableStatement callableStatement =null;
		ResultSet resultSet=null;
		callableStatement = connection.prepareCall("{call leaveInfo(?)}");
		callableStatement.setString(1, sql);
		resultSet =callableStatement.executeQuery();
		while (resultSet.next()) {
			for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
				Layout.jTextArea.append(resultSet.getString(i) + "  ");

			}
			Layout.jTextArea.append("\n");
		}
		Layout.jTextArea.append("\n\n");
		callableStatement.close();
	
	
		// TODO Auto-generated catch block
	
}



public void repairInformation(String sql) throws SQLException, ClassNotFoundException{
	connection = Operation.openConnection(urlName, userName, passWord);
	Layout.jTextArea.append("\n");
    Layout.jTextArea.setFont(new Font("kaiti", 1, 24));
		CallableStatement callableStatement =null;
		ResultSet resultSet=null;
		callableStatement = connection.prepareCall("{call repairInfo(?)}");
		callableStatement.setString(1, sql);
		resultSet =callableStatement.executeQuery();
		while (resultSet.next()) {
			for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
				Layout.jTextArea.append(resultSet.getString(i) + "  ");

			}
			Layout.jTextArea.append("\n");
		}
		Layout.jTextArea.append("\n\n");
		callableStatement.close();
	
	
		// TODO Auto-generated catch block
	
}



public void possessionInformation(String sql) throws SQLException, ClassNotFoundException{
	connection = Operation.openConnection(urlName, userName, passWord);
	Layout.jTextArea.append("\n");
    Layout.jTextArea.setFont(new Font("kaiti", 1, 24));
		CallableStatement callableStatement =null;
		ResultSet resultSet=null;
		callableStatement = connection.prepareCall("{call possessionInfo(?)}");
		callableStatement.setString(1, sql);
		resultSet =callableStatement.executeQuery();
		while (resultSet.next()) {
			for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
				Layout.jTextArea.append(resultSet.getString(i) + "  ");

			}
			Layout.jTextArea.append("\n");
		}
		Layout.jTextArea.append("\n\n");
		callableStatement.close();
	
	
		// TODO Auto-generated catch block
	
}

}
