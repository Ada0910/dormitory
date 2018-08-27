/**
 *@author{ΰ��} 
 *@ע�ͣ�
 */
package com.test.layout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.SQLException;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

import com.test.insert.DormitoryInsert;
import com.test.insert.LateInsert;
import com.test.insert.LeaveInsert;
import com.test.insert.PossessionInsert;
import com.test.insert.RepairInsert;
import com.test.insert.StudentInsert;
import com.test.operation.DeleteOperation;
import com.test.operation.SelectOperation;
import com.test.select.DormitorySelect;
import com.test.select.LateSelect;
import com.test.select.LeaveSelect;
import com.test.select.PossessionSelect;
import com.test.select.RepairSelect;
import com.test.select.StudentSelect;
import com.test.update.DormitoryUpdate;
import com.test.update.LateUpdate;
import com.test.update.LeaveUpdate;
import com.test.update.PossessionUpdate;
import com.test.update.RepairUpdate;
import com.test.update.StudentUpdate;

/**
 * @author лΰ��
 *
 */
public class SelectAllLayout extends JFrame {
	Container cp;
	ButtonGroup buttonGroup;
	Button jRadioButton, jRadioButton2, jRadioButton3, jRadioButton4, jRadioButton5, jRadioButton6;
	
	JLabel jLabel;
	Panel panel;

	public SelectAllLayout() {

		cp = this.getContentPane();

		jLabel = new JLabel("ѡ����ı��ѯ��ɾ��");
		panel = new Panel();

		jRadioButton = new Button("ѧ����");
		jRadioButton2 = new Button("ҹ���");
		jRadioButton3 = new Button("��У��");
		jRadioButton4 = new Button("��������");
		jRadioButton5 = new Button("����ά�ޱ�");
		jRadioButton6 = new Button("����Ʋ���");
		

		cp.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(7, 5));

		panel.add(jLabel);
		panel.add(jRadioButton);
		panel.add(jRadioButton2);
		panel.add(jRadioButton3);
		panel.add(jRadioButton4);
		panel.add(jRadioButton5);
		panel.add(jRadioButton6);
		

		setBounds(240, 240, 240, 360);
		setVisible(true);
		setResizable(false);

		jRadioButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Layout.jTextArea.setText("ѧ��        ����     �Ա�  ��סʱ��   ���� �����");
				String sql = "select * from student " ;
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

		jRadioButton2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Layout.jTextArea.setText("ѧ��        ҹ��ʱ��    ԭ��");
				String sql = "select * from late" ;
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
			}
			}
		});

		jRadioButton3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Layout.jTextArea.setText("ѧ��        ��Уʱ��    ��Уʱ��   ԭ��");
				String sql = "select * from leave ";
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

		jRadioButton4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Layout.jTextArea.setText("�����    �������");
				String sql = "select * from dormitory ";
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

		jRadioButton5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// @SuppressWarnings("unused")
				Layout.jTextArea.setText("�����      ��Ʒ��      ����ʱ��    ά��ʱ��    ����ԭ��");
				String sql = "select * from repair ";
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

		jRadioButton6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Layout.jTextArea.setText("�����      ��Ʒ��    ��Ʒ��");
				String sql = "select * from possession ";
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
	}

}