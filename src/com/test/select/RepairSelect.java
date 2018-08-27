/**
 *@author{ΰ��} 
 *@ע�ͣ�
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
 * @author лΰ��
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
		super("����ά�ޱ�");
		cp = this.getContentPane();
		panel = new Panel();
		jLabel = new JLabel("����ţ�");
		jLabel2 = new JLabel("��Ʒ�ţ�");
		jLabel3 = new JLabel("����ʱ�䣺");
		jTextField = new JTextField(10);
		jTextField2 = new JTextField(10);
		jTextField3 = new JTextField(10);
		button = new Button("��ѯ");
		button2 = new Button("ɾ��");
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
				Layout.jTextArea.setText("�����      ��Ʒ��      ����ʱ��    ά��ʱ��    ����ԭ��");
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
				JOptionPane.showMessageDialog(null, "ɾ���ɹ�");
				dispose();

			}
		});

		setBounds(360, 300, 360, 400);
		setVisible(true);
		setResizable(false);

	}

}
