/**
 *@author{ΰ��} 
 *@ע�ͣ�
 */
package com.test.insert;

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
 * @author лΰ��
 *
 */
public class StudentInsert extends JFrame {
	Container cp;
	Panel panel;
	Button button;
	JLabel jLabel;
	JLabel jLabel2;
	JLabel jLabel3;
	JLabel jLabel4;
	JLabel jLabel5;
	JLabel jLabel6;
	JTextField jTextField;
	JTextField jTextField2;
	JTextField jTextField3;
	JTextField jTextField4;
	JTextField jTextField5;
	JTextField jTextField6;

	public StudentInsert() {
		super("ѧ����Ĳ���");
		cp = this.getContentPane();
		panel = new Panel();
		jLabel = new JLabel("ѧ�ţ�");
		jLabel2 = new JLabel("������");
		jLabel3 = new JLabel("�Ա�");
		jLabel4 = new JLabel("��סʱ�䣺");
		jLabel5 = new JLabel("���ᶰ����");
		jLabel6 = new JLabel("����ţ�");
		jTextField = new JTextField(10);
		jTextField2 = new JTextField(10);
		jTextField3 = new JTextField(10);
		jTextField4 = new JTextField(10);
		jTextField5 = new JTextField(10);
		jTextField6 = new JTextField(10);
		button = new Button("����");
		panel.setLayout(new GridLayout(13, 16));
		cp.add(panel, BorderLayout.CENTER);
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
		panel.add(jLabel6);
		panel.add(jTextField6);
		panel.add(button);

		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String sql = "insert into  student(Sno,Sname,Sex,Checkin,Dno,Lno) values('" + jTextField.getText()
						+ "',N'" + jTextField2.getText() + "',N'" + jTextField3.getText() + "','"
						+ jTextField4.getText() + "','" + jTextField5.getText() + "','" + jTextField6.getText() + "')";
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
				JOptionPane.showMessageDialog(null, "����ɹ�");
				dispose();
			}
		});

		setBounds(360, 300, 360, 480);
		setVisible(true);
		setResizable(false);
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
