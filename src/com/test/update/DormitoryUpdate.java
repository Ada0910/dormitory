/**
 *@author{伟宁} 
 *@注释：
 */
package com.test.update;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
import java.awt.Font;
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

import com.test.operation.InsertOperation;

public class DormitoryUpdate extends JFrame {

	Container cp = null;
	Panel panel;
	Button button;
	JLabel jLabel;
	JLabel jLabel2;
	JTextField jTextField;
	JTextField jTextField2;

	public DormitoryUpdate() {
		// TODO Auto-generated constructor stub
		super("宿舍表的更新");
		cp = this.getContentPane();
		panel = new Panel();
		jLabel = new JLabel("宿舍 号：");
		jLabel2 = new JLabel("宿舍号码：");
		jTextField = new JTextField(10);
		jTextField2 = new JTextField(10);
		button = new Button("更新");
		jLabel.setFont(new Font("kaiti", 1, 24));
		panel.setLayout(new GridLayout(5, 16));
		cp.add(panel, BorderLayout.CENTER);
		panel.add(jLabel);
		panel.add(jTextField);
		panel.add(jLabel2);
		panel.add(jTextField2);
		panel.add(button);
		
		button.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String sql = "update dormitory set Ltelephone='"+jTextField2.getText()+"'where Lno='"+jTextField.getText()+"'";
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

		setBounds(360, 300, 360, 200);
		setVisible(true);
		setResizable(false);

	}

}
