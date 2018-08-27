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

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

import com.test.insert.DormitoryInsert;
import com.test.insert.LateInsert;
import com.test.insert.LeaveInsert;
import com.test.insert.PossessionInsert;
import com.test.insert.RepairInsert;
import com.test.insert.StudentInsert;

/**
 * @author лΰ��
 *
 */
public class InsertLayout extends JFrame {
	Container cp;
	ButtonGroup buttonGroup;
	Button jRadioButton, jRadioButton2, jRadioButton3, jRadioButton4, jRadioButton5, jRadioButton6;
	JLabel jLabel;
	Panel panel;

	public InsertLayout() {

		cp = this.getContentPane();

		jLabel = new JLabel("ѡ������ı���в���");
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

		jRadioButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				StudentInsert studentInsert = new StudentInsert();
			}
		});

		jRadioButton2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				LateInsert lateInsert = new LateInsert();
			}
		});

		jRadioButton3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				LeaveInsert leaveInsert = new LeaveInsert();
			}
		});

		jRadioButton4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				DormitoryInsert dormitoryInsert = new DormitoryInsert();
			}
		});

		jRadioButton5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				RepairInsert repairInsert = new RepairInsert();
			}
		});

		jRadioButton6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				PossessionInsert possessionInsert = new PossessionInsert();
			}
		});

		setBounds(240, 240, 240, 360);
		setVisible(true);
		setResizable(false);
	}

}