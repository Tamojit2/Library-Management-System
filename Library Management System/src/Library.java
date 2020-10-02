import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Library extends JFrame {
	static Library frame;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame= new Library();
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
	public Library() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 535, 330);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblLibraryManagement = new JLabel("\t\tLibrary Management System");
		lblLibraryManagement.setBackground(new Color(255, 102, 102));
		lblLibraryManagement.setBounds(139, 25, 334, 53);
		lblLibraryManagement.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblLibraryManagement.setForeground(new Color(0, 51, 0));
		
		JButton btnAdminLogin = new JButton("Admin Login");
		btnAdminLogin.setForeground(new Color(51, 0, 102));
		btnAdminLogin.setBounds(193, 97, 158, 52);
		btnAdminLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			AdminLogin.main(new String[]{});
			frame.dispose();
			}
		});
		btnAdminLogin.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JButton btnLibrarianLogin = new JButton("Librarian Login");
		btnLibrarianLogin.setForeground(new Color(0, 102, 0));
		btnLibrarianLogin.setBounds(193, 181, 158, 53);
		btnLibrarianLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LibrarianLogin.main(new String[]{});
			}
		});
		btnLibrarianLogin.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.setLayout(null);
		contentPane.add(lblLibraryManagement);
		contentPane.add(btnLibrarianLogin);
		contentPane.add(btnAdminLogin);
	}
}
