/**
 *@author{伟宁} 
 *@注释：
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
 * @author 谢伟宁
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

		jLabel = new JLabel("选中下面的表进行插入");
		panel = new Panel();

		jRadioButton = new Button("学生表");
		jRadioButton2 = new Button("夜归表");
		jRadioButton3 = new Button("离校表");
		jRadioButton4 = new Button("宿舍号码表");
		jRadioButton5 = new Button("宿舍维修表");
		jRadioButton6 = new Button("宿舍财产表");

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