/**
 *@author{伟宁} 
 *@注释：
 */
package com.test.select;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.test.layout.Layout;
import com.test.operation.DeleteOperation;
import com.test.operation.SelectOperation;

public class StudentSelect extends JFrame {
	Container cp;
	Panel panel;
	Button button;
	Button button2;
	JLabel jLabel;
	JTextField jTextField;

	public StudentSelect() {
		super("学生表的查询和删除");
		cp = this.getContentPane();
		panel = new Panel();
		jLabel = new JLabel("学号：");
		jTextField = new JTextField(10);
		button = new Button("查询");
		button2 = new Button("删除");
		panel.setLayout(new GridLayout(4, 16));
		cp.add(panel, BorderLayout.CENTER);
		panel.add(jLabel);
		panel.add(jTextField);
		panel.add(button);
		panel.add(button2);

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Layout.jTextArea.setText("学号        姓名     性别  入住时间   栋数 宿舍号");
				String sql = "select * from student where Sno='" + jTextField.getText() + "'";
				SelectOperation selectOperation = new SelectOperation();
				try {
					try {
						selectOperation.result(sql);
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, e);
					dispose();

				}

			}
		});

		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String sql = "delete from student where Sno='" + jTextField.getText() + "'";
				DeleteOperation deleteOperation = new DeleteOperation();
				try {
					try {
						deleteOperation.result(sql);
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					//JOptionPane.showMessageDialog(null, e);
					//dispose();

				}
				JOptionPane.showMessageDialog(null, "删除成功");
				dispose();

			}
		});

		setBounds(360, 300, 360, 200);
		setVisible(true);
		setResizable(false);

	}

}
