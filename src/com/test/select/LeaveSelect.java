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

/**
 * @author 谢伟宁
 *
 */
public class LeaveSelect extends JFrame {

	Container cp;
	Panel panel;
	Button button, button2;
	JLabel jLabel;
	JLabel jLabel2;
	JTextField jTextField;
	JTextField jTextField2;

	public LeaveSelect() {
		super("离校表的查询和删除");
		cp = this.getContentPane();
		panel = new Panel();
		jLabel = new JLabel("学号：");
		jLabel2 = new JLabel("离校时间：");

		jTextField = new JTextField(10);
		jTextField2 = new JTextField(10);

		button = new Button("查询");
		button2 = new Button("删除");
		panel.setLayout(new GridLayout(6, 16));
		cp.add(panel, BorderLayout.CENTER);
		panel.add(jLabel);
		panel.add(jTextField);
		panel.add(jLabel2);
		panel.add(jTextField2);
		panel.add(button);
		panel.add(button2);

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Layout.jTextArea.setText("学号        离校时间    返校时间   原因");
				String sql = "select * from leave where Sno='" + jTextField.getText() + "'and Gtime='"
						+ jTextField2.getText() + "'";
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

				String sql = "delete from leave where Sno='" + jTextField.getText() + "'and Gtime='"
						+ jTextField2.getText() + "'";
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

				}
				JOptionPane.showMessageDialog(null, "删除成功");
				dispose();
			}
		});

		setBounds(360, 300, 360, 280);
		setVisible(true);
		setResizable(false);

	}

}
