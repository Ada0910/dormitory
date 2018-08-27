/**
 *@author{伟宁} 
 *@注释：
 */
package com.test.insert;

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

import com.test.operation.InsertOperation;

/**
 * @author 谢伟宁
 *
 */
public class LeaveInsert extends JFrame {

	Container cp;
	Panel panel;
	Button button;
	JLabel jLabel;
	JLabel jLabel2;
	JLabel jLabel3;
	JLabel jLabel4;

	JTextField jTextField;
	JTextField jTextField2;
	JTextField jTextField3;
	JTextField jTextField4;

	public LeaveInsert() {
		super("离校表的插入");
		cp = this.getContentPane();
		panel = new Panel();
		jLabel = new JLabel("学号：");
		jLabel2 = new JLabel("离校时间：");
		jLabel3 = new JLabel("回校时间：");
		jLabel4 = new JLabel("离校原因：");

		jTextField = new JTextField(10);
		jTextField2 = new JTextField(10);
		jTextField3 = new JTextField(10);
		jTextField4 = new JTextField(10);

		button = new Button("插入");
		panel.setLayout(new GridLayout(9, 16));
		cp.add(panel, BorderLayout.CENTER);
		panel.add(jLabel);
		panel.add(jTextField);
		panel.add(jLabel2);
		panel.add(jTextField2);
		panel.add(jLabel3);
		panel.add(jTextField3);
		panel.add(jLabel4);
		panel.add(jTextField4);
		panel.add(button);

		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String sql = "insert into  leave(Sno,Gtime,Btime,Greason) values('" + jTextField.getText() + "','"
						+ jTextField2.getText() + "','" + jTextField3.getText() + "',N'" + jTextField4.getText() + "')";
				InsertOperation insertOperation = new InsertOperation();
				try {
					insertOperation.InsertOp(sql);
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();

				}
				JOptionPane.showMessageDialog(null, "插入成功");
				dispose();
			}
		});

		setBounds(360, 300, 360, 400);
		setVisible(true);
		setResizable(false);

	}

}
