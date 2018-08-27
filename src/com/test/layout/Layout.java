/**
 *@author{ΰ��} 
 *@ע�ͣ�
 */
package com.test.layout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.SQLException;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.test.insert.DormitoryInsert;
import com.test.insert.LateInsert;
import com.test.insert.LeaveInsert;
import com.test.insert.PossessionInsert;
import com.test.insert.RepairInsert;
import com.test.insert.StudentInsert;

public class Layout extends JFrame {

	// ���峣��
	Container cp = null;
	Panel panel2;
	Button button, button2, button3,button4  ;
	public static JTextArea jTextArea;
	JScrollPane panel;

	@SuppressWarnings("unchecked")
	public Layout() {

		super.setTitle("�������ϵͳ����");
		cp = this.getContentPane();

		panel2 = new Panel();
		jTextArea = new JTextArea(1224, 1024);
		panel = new JScrollPane(jTextArea);

		button = new Button("����");
		button2 = new Button("����");
		button3 = new Button("��ϸ��ѯ��ɾ��");
		button4 = new Button ("�򵥲�ѯ");
		
		

		cp.add(panel, BorderLayout.CENTER);
		cp.add(panel2, BorderLayout.WEST);
		panel2.add(button4);
		panel2.add(button3);
		panel2.add(button);
		panel2.add(button2);
		
		
		panel2.setLayout(new GridLayout(12, 10));

		jTextArea.setLineWrap(true);

		/*
		 * �йش��������
		 */
		setBounds(80, 80, 860, 640);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/*
		 * �����������Ӽ�����
		 */

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InsertLayout insertLayout = new InsertLayout();
			}
		});

		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UpdateLayout updateLayout = new UpdateLayout();
			}
		});

		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SelectLayout selectLayout = new SelectLayout();
			}
		});
		
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SelectAllLayout selectAllLayout = new SelectAllLayout();
			}
		});
		
		

	}

	public static void main(String a[]) {
	//Layout layout = new Layout();
		LoginLayout loginLayout = new LoginLayout();

	}

}