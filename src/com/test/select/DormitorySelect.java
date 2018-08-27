/**
 *@author{Î°Äþ} 
 *@×¢ÊÍ£º
 */
package com.test.select;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
import java.awt.GridBagLayout;
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

public class DormitorySelect extends JFrame {

	Container cp = null;
	Panel panel;
	Button button, button2;
	JLabel jLabel;
	JLabel jLabel2;
	JTextField jTextField;
	JTextField jTextField2;

	public DormitorySelect() {
		// TODO Auto-generated constructor stub
		super("ËÞÉáºÅÂë±í");
		cp = this.getContentPane();
		panel = new Panel();
		jLabel = new JLabel("ËÞ ºÅ£º");
		jTextField = new JTextField(10);

		button = new Button("²éÑ¯");
		button2 = new Button("É¾³ý");

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
				Layout.jTextArea.setText("ËÞÉáºÅ    ËÞÉáºÅÂë");
				String sql = "select * from dormitory where Lno='" + jTextField.getText() + "'";
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

				DeleteOperation deleteOperation = new DeleteOperation();
				String sql = "delete from dormitory where Lno='" + jTextField.getText() + "'";
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

				JOptionPane.showMessageDialog(null, "É¾³ý³É¹¦");
				dispose();
			}
		});

		setBounds(360, 300, 360, 200);
		setVisible(true);
		setResizable(false);

	}

}
