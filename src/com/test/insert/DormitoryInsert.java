/**
 *@author{Œ∞ƒ˛} 
 *@◊¢ Õ£∫
 */
package com.test.insert;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
import java.awt.GridBagLayout;
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

public class DormitoryInsert extends JFrame {

	Container cp = null;
	Panel panel;
	Button button;
	JLabel jLabel;
	JLabel jLabel2;
	JTextField jTextField;
	JTextField jTextField2;

	public DormitoryInsert() {
		// TODO Auto-generated constructor stub
		super("Àﬁ…·±Ìµƒ≤Â»Î");
		cp = this.getContentPane();
		panel = new Panel();
		jLabel = new JLabel("Àﬁ…· ∫≈£∫");
		jLabel2 = new JLabel("Àﬁ…·∫≈¬Î£∫");
		jTextField = new JTextField(10);
		jTextField2 = new JTextField(10);
		button = new Button("≤Â»Î");

		panel.setLayout(new GridLayout(5, 16));
		cp.add(panel, BorderLayout.CENTER);
		panel.add(jLabel);
		panel.add(jTextField);
		panel.add(jLabel2);
		panel.add(jTextField2);
		panel.add(button);

		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String sql = "insert into  dormitory(Lno,Ltelephone) values('" + jTextField.getText() + "','"
						+ jTextField2.getText() + "')";
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
				JOptionPane.showMessageDialog(null, "≤Â»Î≥…π¶");
				dispose();
			}
		});

		setBounds(360, 300, 360, 200);
		setVisible(true);
		setResizable(false);

	}

}
