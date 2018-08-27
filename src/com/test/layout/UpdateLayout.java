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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

import com.test.insert.DormitoryInsert;
import com.test.insert.LateInsert;
import com.test.insert.LeaveInsert;
import com.test.insert.PossessionInsert;
import com.test.insert.RepairInsert;
import com.test.insert.StudentInsert;
import com.test.update.DormitoryUpdate;
import com.test.update.LateUpdate;
import com.test.update.LeaveUpdate;
import com.test.update.PossessionUpdate;
import com.test.update.RepairUpdate;
import com.test.update.StudentUpdate;

/**
 * @author 谢伟宁
 *
 */
public class UpdateLayout extends JFrame {
	Container cp;
	ButtonGroup buttonGroup;
	Button jRadioButton, jRadioButton2, jRadioButton3, jRadioButton4, jRadioButton5, jRadioButton6;
	JLabel jLabel;
	Panel panel;

	public UpdateLayout() {

		cp = this.getContentPane();

		jLabel = new JLabel("选中下面的表进行更新");
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

		setBounds(240, 240, 240, 360);
		setVisible(true);
		setResizable(false);

		jRadioButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				StudentUpdate studentUpdate = new StudentUpdate();
			}
		});

		jRadioButton2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				LateUpdate lateUpdate = new LateUpdate();
			}
		});

		jRadioButton3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				LeaveUpdate leaveUpdate = new LeaveUpdate();
			}
		});

		jRadioButton4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				DormitoryUpdate dormitoryUpdate = new DormitoryUpdate();
			}
		});

		jRadioButton5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				RepairUpdate repairUpdate = new RepairUpdate();
			}
		});

		jRadioButton6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				PossessionUpdate possessionUpdate = new PossessionUpdate();
			}
		});
	}

}