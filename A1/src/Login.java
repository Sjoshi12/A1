import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;

public class Login {

	private JFrame frmLogin;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setTitle("Login");
		frmLogin.getContentPane().setBackground(Color.GRAY);
		frmLogin.setBounds(100, 100, 318, 232);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(29, 47, 88, 26);
		frmLogin.getContentPane().add(lblUsername);
		
		JLabel lblNewLabel = new JLabel("Password");
		lblNewLabel.setBounds(29, 87, 88, 26);
		frmLogin.getContentPane().add(lblNewLabel);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//add the code to access the db
				
				
				frmLogin.dispose();
				HomePage obj = new HomePage();
				obj.setVisible(true);
				
			}
		});
		btnLogin.setBounds(111, 124, 89, 23);
		frmLogin.getContentPane().add(btnLogin);
		
		textField = new JTextField();
		textField.setBounds(111, 50, 86, 20);
		frmLogin.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(111, 84, 86, 20);
		frmLogin.getContentPane().add(textField_1);
		textField_1.setColumns(10);
	}
}
