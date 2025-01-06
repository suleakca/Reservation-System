package com.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.structures.doublylinkedlist.DoublyLinkedList;
import com.structures.reservation.Customer;
import com.structures.tree.Tree;
import com.structures.tree.TreeNode;

import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class ReservationFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JList<String> list;
	private DefaultListModel<String> model;
	private DoublyLinkedList customerList = new DoublyLinkedList();
	private JTextField txtFullname;
	private JTextField txtIDNumber;
	private JTextField txtEMail;
	private JTextField txtPhoneNumber;
	private JTextField txtPeriodOfStay;
	private JTextField txtCreditCardInfo;
	private JButton btnAdd = new JButton("Register");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReservationFrame frame = new ReservationFrame();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ReservationFrame() {
		initialiseComponents();
		
		// JList
		model = new DefaultListModel<String>();
		list = new JList<String>(model);
		list.setBounds(12, 228, 263, 162);
		contentPane.add(list);
		
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ArrayList<String> services = new ArrayList<>();
				for (int i = 0; i < list.getSelectedValuesList().size(); i++){
					services.add((String)list.getSelectedValuesList().get(i));
				}
				
				String exp = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
						+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
				
				Customer c = new Customer(txtFullname.getText(),
						Integer.parseInt(txtIDNumber.getText()),
						txtEMail.getText(),
						Integer.parseInt(txtPhoneNumber.getText()),
						services,
						Integer.parseInt(txtPeriodOfStay.getText()),
						Integer.parseInt(txtCreditCardInfo.getText()));
				
				customerList.insertAtFront(c);
				
			}
		});
		btnAdd.setBounds(159, 190, 116, 25);
		contentPane.add(btnAdd);
		
		Tree tree = new Tree();
		TreeNode node = new TreeNode();
		node.setData("suite");
		model.addElement(node.getData());
		tree.setRoot(node);
		tree.getRoot().getChildren().add(new TreeNode("Spa"));
		tree.getRoot().getChildren().add(new TreeNode("Double beds"));
		tree.getRoot().getChildren().add(new TreeNode("Internet"));
		tree.getRoot().getChildren().get(0).getChildren().add(new TreeNode("Fridge"));
		
		loadToJList(tree.getRoot());
		
		
	}
	
	public void loadToJList(TreeNode root){
		
		if (root == null){
			return;
		} else {
			for (TreeNode node : root.getChildren()){
				model.addElement(node.getData());
				if (node.getChildren() != null){
					loadToJList(node);
				}
			}
		}
	}
	
	
	public void initialiseComponents(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 301, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNameAndSurname = new JLabel("Name and Surname: ");
		lblNameAndSurname.setBounds(12, 13, 135, 16);
		contentPane.add(lblNameAndSurname);
		
		JLabel lblIdNumber = new JLabel("ID Number: ");
		lblIdNumber.setBounds(12, 42, 116, 16);
		contentPane.add(lblIdNumber);
		
		JLabel lblEmail = new JLabel("E-Mail: ");
		lblEmail.setBounds(12, 71, 116, 16);
		contentPane.add(lblEmail);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number: ");
		lblPhoneNumber.setBounds(12, 100, 116, 16);
		contentPane.add(lblPhoneNumber);
		
		JLabel lblPeriodOfStay = new JLabel("Period of Stay");
		lblPeriodOfStay.setBounds(12, 129, 116, 16);
		contentPane.add(lblPeriodOfStay);
		
		JLabel lblCreditCardInfo = new JLabel("Credit card Info: ");
		lblCreditCardInfo.setBounds(12, 158, 116, 16);
		contentPane.add(lblCreditCardInfo);
		
		txtFullname = new JTextField();
		txtFullname.setBounds(159, 10, 116, 22);
		contentPane.add(txtFullname);
		txtFullname.setColumns(10);
		
		txtIDNumber = new JTextField();
		txtIDNumber.setColumns(10);
		txtIDNumber.setBounds(159, 39, 116, 22);
		contentPane.add(txtIDNumber);
		
		txtEMail = new JTextField();
		txtEMail.setColumns(10);
		txtEMail.setBounds(159, 68, 116, 22);
		contentPane.add(txtEMail);
		
		txtPhoneNumber = new JTextField();
		txtPhoneNumber.setColumns(10);
		txtPhoneNumber.setBounds(159, 97, 116, 22);
		contentPane.add(txtPhoneNumber);
		
		txtPeriodOfStay = new JTextField();
		txtPeriodOfStay.setColumns(10);
		txtPeriodOfStay.setBounds(159, 126, 116, 22);
		contentPane.add(txtPeriodOfStay);
		
		txtCreditCardInfo = new JTextField();
		txtCreditCardInfo.setColumns(10);
		txtCreditCardInfo.setBounds(159, 155, 116, 22);
		contentPane.add(txtCreditCardInfo);
		
		JLabel lblService = new JLabel("Service");
		lblService.setBounds(12, 199, 68, 16);
		contentPane.add(lblService);
	}
}
