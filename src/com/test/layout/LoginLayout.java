/**
 *@author{ΰ��} 
 *@ע�ͣ�
 */
package com.test.layout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class LoginLayout extends JFrame {
	
	JLabel jLabel,jLabel2,jLabel3;
	JTextField jTextField,jTextField2;
	Button button;
	Container cp;
	Panel  panel;
    /**
	 * 
	 */
	public LoginLayout() {
		// TODO Auto-generated constructor stub
		panel = new Panel();
		jLabel=new JLabel("��ӭʹ���������ϵͳ",JLabel.CENTER);
		jLabel2 = new JLabel("����Ա���֣�");
		jLabel3 = new JLabel("���룺");
		jTextField = new JTextField(10);
		jTextField2 = new JTextField(10);
		button = new Button("��¼");
		jLabel.setFont(new Font("kaiti", 1, 24));
		
		cp=getContentPane();
		cp.add(panel,BorderLayout.CENTER);
		cp.add(jLabel,BorderLayout.NORTH);
		cp.add(button ,BorderLayout.SOUTH);
		panel.add(jLabel2);
		panel.add(jTextField);
		panel.add(jLabel3);
		panel.add(jTextField2);
		panel.setLayout(new GridLayout(4, 20));
		
		setBounds(360,360,360,240);
		setVisible(true);
		setResizable(false);
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String userName="111";
				String passWord="111";
				
				if((jTextField.getText().equals(userName))&&(jTextField2.getText().equals(passWord))){
					Layout layout = new Layout();
					setVisible(false);
				}
				else 
				{
					JOptionPane.showMessageDialog(null, "����Ա�����ֻ���������󣡣���");
					jTextField.setText("");
					jTextField2.setText("");
				}
				
			} 
		});
		
	}

}
