package lms;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;


/**
 * Login page
 * @author Andi
 * @author Vlad
 * 
 */
public class Login_user extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton b1, b2, b3;

	/**
	 * Configure login page
	 */
	public Login_user() {

		setBackground(new Color(169, 169, 169));
		setBounds(600, 300, 600, 400);

		panel = new JPanel();
		panel.setBackground(new Color(176, 224, 230));
		setContentPane(panel);
		panel.setLayout(null);

		JLabel l1 = new JLabel("Username : ");
		l1.setBounds(124, 89, 95, 24);
		panel.add(l1);

		textField = new JTextField();
		textField.setBounds(210, 93, 157, 20);
		panel.add(textField);
		
		JLabel l2 = new JLabel("Password : ");
		l2.setBounds(124, 124, 95, 24);
		panel.add(l2);

		passwordField = new JPasswordField();
		passwordField.setBounds(210, 128, 157, 20);
		panel.add(passwordField);

//		JLabel l3 = new JLabel("");
//		l3.setBounds(377, 79, 46, 34);
//		panel.add(l3);
//
//		JLabel l4 = new JLabel("");
//		l4.setBounds(377, 124, 46, 34);
//		panel.add(l3);

		b1 = new JButton("Login");
		b1.addActionListener(this);
		b1.setForeground(Color.WHITE);
		b1.setBackground(new Color(55, 145, 225));
		b1.setBounds(149, 181, 113, 39);
		panel.add(b1);

		b2 = new JButton("SignUp");
		b2.addActionListener(this);
		b2.setForeground(Color.WHITE);
		b2.setBackground(new Color(55, 145, 225));
		b2.setBounds(289, 181, 113, 39);
		panel.add(b2);

		b3 = new JButton("Forgot Password");
		b3.addActionListener(this);
		b3.setForeground(Color.WHITE);
		b3.setBackground(new Color(55, 145, 225));
		b3.setBounds(199, 231, 179, 39);
		panel.add(b3);

//		JPanel panel2 = new JPanel();
//		panel2.setBackground(new Color(176, 224, 230));
//		panel2.setBounds(24, 40, 434, 263);
//		panel.add(panel2);
	}

	/**
	 *	Perform login action
	 */
	@SuppressWarnings("deprecation")
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == b1) {
//			Boolean status = false;
			try {
				conn con = new conn();
				String sql = "select * from account where username=? and password=?";
				PreparedStatement st = con.c.prepareStatement(sql);

				st.setString(1, textField.getText());
				st.setString(2, passwordField.getText());

				ResultSet rs = st.executeQuery();
				if (rs.next()) {
					this.setVisible(false);
					new Loading().setVisible(true);
				} else
					JOptionPane.showMessageDialog(null, "Invalid Login...!.");

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		if (ae.getSource() == b2) {
			setVisible(false);
			Signup su = new Signup();
			su.setVisible(true);
		}
		if (ae.getSource() == b3) {
			setVisible(false);
			Forgot forgot = new Forgot();
			forgot.setVisible(true);
		}
	}

	/**
	 * Main function for login page
	 * @param args
	 */
	public static void main(String[] args) {
		new Login_user().setVisible(true);
	}

}
