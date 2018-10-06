import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Choice;
import java.awt.List;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Button;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.util.ArrayList;
import javax.swing.LayoutStyle.ComponentPlacement;

public class PromoteEmployee extends JFrame {

	private JPanel contentPane;
	private JComboBox EmployeeDropdown;
	private JComboBox TitleDropdown;

	/**
	 * Create the frame.
	 */
	public PromoteEmployee() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		EmployeeDropdown = new JComboBox();	
		for(int i = 0; i < Employee.employeeList.size(); ++i)
			{
			   EmployeeDropdown.addItem(Employee.employeeList.get(i));
			}
	   
		TitleDropdown = new JComboBox();
		TitleDropdown.addItem("Manager");
		TitleDropdown.addItem("deputyManager");
		TitleDropdown.addItem("Staffassociation");
		TitleDropdown.addItem("OfficeStaff");
		TitleDropdown.addItem("InventoryManager");
		TitleDropdown.addItem("Salesman");
		TitleDropdown.addItem("ExternalSalesman");
	    Object cmboitem = TitleDropdown.getSelectedItem();


		JLabel lblEmployee = new JLabel("Employee");
		
		JLabel lblTitle = new JLabel("Title");
		
		JButton btnPromote = new JButton("Promote!");
		btnPromote.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Menu f = new Menu();
				dispose();
				f.setVisible(true);

			}
		});
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(131)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblEmployee)
						.addComponent(lblTitle))
					.addGap(27)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(TitleDropdown, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(EmployeeDropdown, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE))
					.addGap(105))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(171, Short.MAX_VALUE)
					.addComponent(btnPromote, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
					.addGap(167))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnBack)
					.addContainerGap(325, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(71)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE, false)
						.addComponent(EmployeeDropdown, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEmployee))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblTitle)
						.addComponent(TitleDropdown, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(btnPromote, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
					.addComponent(btnBack)
					.addGap(26))
		);
		
		
		contentPane.setLayout(gl_contentPane);
	}

}
