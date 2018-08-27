/**
 *@author{伟宁} 
 *@注释：
 */
package com.test.select;
/**
 *@author{伟宁} 
 *@注释：
 */


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

public class LnoSelect extends JFrame {
	Container cp;
	Panel panel;
	Button button;
	Button button2;
	JLabel jLabel;
	JTextField jTextField;

	public LnoSelect() {
		super("宿舍财产和维修情况");
		cp = this.getContentPane();
		panel = new Panel();
		jLabel = new JLabel("宿舍号：");
		jTextField = new JTextField(10);
		button = new Button("查询宿舍财产情况");
		button2 = new Button("查询宿舍维修情况");
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
				Layout.jTextArea.setText("宿舍号      物品号    物品名");

				SelectOperation selectOperation = new SelectOperation();
				try {
					selectOperation.possessionInformation( jTextField.getText());
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				

				}

			}
		});

		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Layout.jTextArea.setText("宿舍号      物品号      报修时间    维修时间    报修原因");

				SelectOperation selectOperation = new SelectOperation();
				try {
					selectOperation.repairInformation(jTextField.getText());
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				}

			
		});

		setBounds(360, 300, 360, 200);
		setVisible(true);
		setResizable(false);

	}

}
