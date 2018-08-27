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
public class RepairSelect extends JFrame {
	Container cp;
	Panel panel;
	Button button, button2;
	JLabel jLabel;
	JLabel jLabel2;
	JLabel jLabel3;

	JTextField jTextField;
	JTextField jTextField2;
	JTextField jTextField3;

	public RepairSelect() {
		super("宿舍维修表");
		cp = this.getContentPane();
		panel = new Panel();
		jLabel = new JLabel("宿舍号：");
		jLabel2 = new JLabel("物品号：");
		jLabel3 = new JLabel("报修时间：");
		jTextField = new JTextField(10);
		jTextField2 = new JTextField(10);
		jTextField3 = new JTextField(10);
		button = new Button("查询");
		button2 = new Button("删除");
		cp.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(8, 16));

		panel.add(jLabel);
		panel.add(jTextField);
		panel.add(jLabel2);
		panel.add(jTextField2);
		panel.add(jLabel3);
		panel.add(jTextField3);
		panel.add(button);
		panel.add(button2);

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Layout.jTextArea.setText("宿舍号      物品号      报修时间    维修时间    报修原因");
				String sql = "select * from repair where Lno='" + jTextField.getText() + "'and Pno='"
						+ jTextField2.getText() + "'and Rtime='" + jTextField3.getText() + "'";
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
				String sql = "delete from repair where Lno='" + jTextField.getText() + "'and Pno='"
						+ jTextField2.getText() + "'and Rtime='" + jTextField3.getText() + "'";
				SelectOperation selectOperation = new SelectOperation();
				try {

					selectOperation.result(sql);
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
//					JOptionPane.showMessageDialog(null, e);
//					dispose();

				}
				JOptionPane.showMessageDialog(null, "删除成功");
				dispose();

			}
		});

		setBounds(360, 300, 360, 400);
		setVisible(true);
		setResizable(false);

	}

}
