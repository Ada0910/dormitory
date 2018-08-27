/**
 *@author{伟宁} 
 *@注释：
 */
package com.test.update;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
import java.awt.Font;
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

public class PossessionUpdate extends JFrame {

	Container cp = null;
	Panel panel;
	Button button;
	JLabel jLabel;
	JLabel jLabel2;
	JLabel jLabel3;
	JTextField jTextField;
	JTextField jTextField2;
	JTextField jTextField3;

	public PossessionUpdate() {
		// TODO Auto-generated constructor stub
		super("宿舍财产表的更新");
		cp = this.getContentPane();
		panel = new Panel();
		jLabel = new JLabel("宿舍号：");
		jLabel2 = new JLabel("物品号：");
		jLabel3 = new JLabel("物品的名字：");
		jTextField = new JTextField(10);
		jTextField2 = new JTextField(10);
		jTextField3 = new JTextField(10);
		button = new Button("更新");

		panel.setLayout(new GridLayout(7, 16));
		cp.add(panel, BorderLayout.CENTER);
		jLabel.setFont(new Font("kaiti", 1, 24));
		jLabel2.setFont(new Font("kaiti", 1, 24));
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
				String sql = "update possession set Pname=N'"+jTextField3.getText()+"'where Lno='"+jTextField.getText()+"'and Pno='"+jTextField2.getText()+"'";
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
            JOptionPane.showMessageDialog(null, "更新成功");
			dispose();
			}
		});
		
		setBounds(360, 300, 360, 280);
		setVisible(true);
		setResizable(false);

	}

}
