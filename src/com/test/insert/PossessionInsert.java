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

public class PossessionInsert extends JFrame {

	Container cp = null;
	Panel panel;
	Button button;
	JLabel jLabel;
	JLabel jLabel2;
	JLabel jLabel3;
	JTextField jTextField;
	JTextField jTextField2;
	JTextField jTextField3;

	public PossessionInsert() {
		// TODO Auto-generated constructor stub
		super("宿舍财产表的插入");
		cp = this.getContentPane();
		panel = new Panel();
		jLabel = new JLabel("宿舍号：");
		jLabel2 = new JLabel("物品号：");
		jLabel3 = new JLabel("物品的名字：");
		jTextField = new JTextField(10);
		jTextField2 = new JTextField(10);
		jTextField3 = new JTextField(10);
		button = new Button("插入");

		panel.setLayout(new GridLayout(7, 16));
		cp.add(panel, BorderLayout.CENTER);
		panel.add(jLabel);
		panel.add(jTextField);
		panel.add(jLabel2);
		panel.add(jTextField2);
		panel.add(jLabel3);
		panel.add(jTextField3);
		panel.add(button);

		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String sql = "insert into  possession(Lno,Pno,Pname) values('" + jTextField.getText() + "','"
						+ jTextField2.getText() + "',N'" + jTextField3.getText() + "')";
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

		setBounds(360, 300, 360, 280);
		setVisible(true);
		setResizable(false);

	}

}
