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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

import com.test.insert.DormitoryInsert;
import com.test.insert.LateInsert;
import com.test.insert.LeaveInsert;
import com.test.insert.PossessionInsert;
import com.test.insert.RepairInsert;
import com.test.insert.StudentInsert;
import com.test.select.DormitorySelect;
import com.test.select.LateSelect;
import com.test.select.LeaveSelect;
import com.test.select.LnoSelect;
import com.test.select.PossessionSelect;
import com.test.select.RepairSelect;
import com.test.select.SnoSelect;
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
public class SelectLayout extends JFrame {
	Container cp;
	ButtonGroup buttonGroup;
	Button jRadioButton, jRadioButton2, jRadioButton3, jRadioButton4, jRadioButton5, jRadioButton6;
	Button button ,button2;
	JLabel jLabel;
	Panel panel;

	public SelectLayout() {

		cp = this.getContentPane();

		jLabel = new JLabel("ѡ����ı��ѯ��ɾ��");
		panel = new Panel();

		jRadioButton = new Button("ѧ����");
		jRadioButton2 = new Button("ҹ���");
		jRadioButton3 = new Button("��У��");
		jRadioButton4 = new Button("��������");
		jRadioButton5 = new Button("����ά�ޱ�");
		jRadioButton6 = new Button("����Ʋ���");
		button = new Button("��ѯָ��ѧ����ҹ�����У���");
		button2 = new Button("��ѯָ������ĲƲ���ά�����");
		
		cp.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(9, 5));

		panel.add(jLabel);
		panel.add(jRadioButton);
		panel.add(jRadioButton2);
		panel.add(jRadioButton3);
		panel.add(jRadioButton4);
		panel.add(jRadioButton5);
		panel.add(jRadioButton6);
		panel.add(button);
		panel.add(button2);
		
		setBounds(240, 240, 240, 360);
		setVisible(true);
		setResizable(false);

		jRadioButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				StudentSelect studentSelect = new StudentSelect();
			}
		});

		jRadioButton2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				LateSelect lateSelect = new LateSelect();
			}
		});

		jRadioButton3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				LeaveSelect leaveSelect = new LeaveSelect();
			}
		});

		jRadioButton4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				DormitorySelect dormitorySelect = new DormitorySelect();
			}
		});

		jRadioButton5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// @SuppressWarnings("unused")
				RepairSelect repairSelect = new RepairSelect();
			}
		});

		jRadioButton6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				PossessionSelect possessionSelect = new PossessionSelect();
			}
		});
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SnoSelect snoSelect = new SnoSelect();
						
			}
		});
		
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LnoSelect lnoSelect = new LnoSelect();
			}
		});
		
		
		
	}

}