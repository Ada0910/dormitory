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

/**
 * @author 谢伟宁
 *
 */
public class RepairUpdate extends JFrame {

	Container cp;
	Panel panel;
	Button button;
	JLabel jLabel;
	JLabel jLabel2;
	JLabel jLabel3;
	JLabel jLabel4;
	JLabel jLabel5;

	JTextField jTextField;
	JTextField jTextField2;
	JTextField jTextField3;
	JTextField jTextField4;
	JTextField jTextField5;

	public RepairUpdate() {
		super("宿舍维修表的更新");
		cp = this.getContentPane();
		panel = new Panel();
		jLabel = new JLabel("宿舍号：");
		jLabel2 = new JLabel("物品号：");
		jLabel3 = new JLabel("报修时间：");
		jLabel4 = new JLabel("维修时间：");
		jLabel5 = new JLabel("报修原因：");

		jTextField = new JTextField(10);
		jTextField2 = new JTextField(10);
		jTextField3 = new JTextField(10);
		jTextField4 = new JTextField(10);
		jTextField5 = new JTextField(10);

		button = new Button("更新");
		panel.setLayout(new GridLayout(11, 16));
		cp.add(panel, BorderLayout.CENTER);
		jLabel.setFont(new Font("kaiti", 1, 24));
		jLabel2.setFont(new Font("kaiti", 1, 24));
		jLabel3.setFont(new Font("kaiti", 1, 24));
		
		
		panel.add(jLabel);
		panel.add(jTextField);
		panel.add(jLabel2);
		panel.add(jTextField2);
		panel.add(jLabel3);
		panel.add(jTextField3);
		panel.add(jLabel4);
		panel.add(jTextField4);
		panel.add(jLabel5);
		panel.add(jTextField5);
		panel.add(button);

		button.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String sql = "update repair set Ctime='" + jTextField4.getText() +"',Rreason=N'" + jTextField5.getText() 
				  + "'where Lno='" + jTextField.getText() + "'and Pno='"+jTextField2.getText()+"'and Rtime='"+jTextField3.getText()+"'";
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
		setBounds(360, 300, 360, 400);
		setVisible(true);
		setResizable(false);

	}

}
