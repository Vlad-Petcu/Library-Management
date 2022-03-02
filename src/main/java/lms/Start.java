package lms;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


/**
 * Start page
 * @author Andi
 * @author Vlad
 * The first page that the user sees.
 */
public class Start extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	JLabel l1;
	JButton b1;
	
	/**
	 * Configure start page
	 */
	public Start() {

		setSize(1200, 390);
		setLayout(null);
		setLocation(300, 300); 

		l1 = new JLabel("Library Management System");
		b1 = new JButton("Next");

		b1.setBackground(Color.WHITE);
		b1.setForeground(Color.BLACK);

		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("lms/icons/start1.jpg"));
		Image i3 = i1.getImage().getScaledInstance(1200, 390, Image.SCALE_DEFAULT);
		ImageIcon i2 = new ImageIcon(i3);
		l1 = new JLabel(i2);

		b1.setBounds(950, 250, 200, 60);
		l1.setBounds(0, 0, 1200, 390);

		l1.add(b1);
		add(l1);

		b1.addActionListener(this);
	}

	/**
	 * Access login page
	 */
	public void actionPerformed(ActionEvent ae) {
		new Login_user().setVisible(true);
		this.setVisible(false);

	}
	
	/**
	 * Main function for start page
	 * @param args
	 */
	public static void main(String[] args) {
		Start window = new Start();
		window.setVisible(true);
	}
}
