import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class AdminLogin extends JFrame {
	static AdminLogin frame;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new AdminLogin();
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
	public AdminLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 556, 336);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(102, 51, 255));
		contentPane.setBackground(new Color(51, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblAdminLoginForm = new JLabel("Library Management System");
		lblAdminLoginForm.setBounds(129, 5, 286, 22);
		lblAdminLoginForm.setForeground(Color.BLACK);
		lblAdminLoginForm.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblEnterName = new JLabel("Enter Name:");
		lblEnterName.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblEnterName.setBounds(71, 56, 105, 28);
		
		JLabel lblEnterPassword = new JLabel("Enter Password:");
		lblEnterPassword.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblEnterPassword.setBounds(71, 95, 105, 28);
		
		textField = new JTextField();
		textField.setBounds(243, 53, 172, 20);
		textField.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnLogin.setForeground(new Color(153, 51, 102));
		btnLogin.setBackground(new Color(102, 153, 153));
		btnLogin.setBounds(224, 170, 86, 37);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String name=textField.getText();
			String password=String.valueOf(passwordField.getPassword());
			if(name.equals("admin")&&password.equals("admin")){
				AdminSuccess.main(new String[]{});
				frame.dispose();
			}else{
				JOptionPane.showMessageDialog(AdminLogin.this, "Sorry, Username or Password Error","Login Error!", JOptionPane.ERROR_MESSAGE);
				textField.setText("");
				passwordField.setText("");
			}
			}
		});
		
		passwordField = new JPasswordField();
		passwordField.setBounds(243, 101, 172, 20);
		contentPane.setLayout(null);
		contentPane.add(lblAdminLoginForm);
		contentPane.add(lblEnterName);
		contentPane.add(lblEnterPassword);
		contentPane.add(passwordField);
		contentPane.add(textField);
		contentPane.add(btnLogin);
	}
}
