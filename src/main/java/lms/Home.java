package lms;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Home page
 * @author Andi
 * @author Vlad
 * This is the page where the user can choose to perform this operations:
 * 
 * - Add book
 * - Book details
 * - Add student
 * - Student details
 * - Issue book
 * - Statistics 1 => issued books
 * - Statistics 2 => returned books
 *
 */
public class Home extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JButton b1, b2, b3, b4, b5, b6, b7, b8;

	/**
	 * Main function for home
	 * @param args
	 */
	public static void main(String[] args) {
		new Home().setVisible(true);
	}

	/**
	 * Configure home page
	 */
	public Home() {

		setBounds(400, 150, 1000, 800);
		contentPane = new JPanel();
		contentPane.setOpaque(false);
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setOpaque(false);
		menuBar.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(67, 229, 247), new Color(128, 128, 128)));
		menuBar.setBackground(Color.RED);
		menuBar.setBounds(0, 10, 1000, 35);
		contentPane.add(menuBar);

		JMenu mnExit = new JMenu("Exit");
		mnExit.setFont(new Font("Trebuchet MS", Font.BOLD, 17));

		JMenuItem mntmLogout = new JMenuItem("Logout");
		mntmLogout.setBackground(new Color(211, 211, 211));
		mntmLogout.setForeground(Color.DARK_GRAY);
		mntmLogout.addActionListener(this);
		mnExit.add(mntmLogout);

		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.setBackground(new Color(211, 211, 211));
		mntmExit.setForeground(Color.DARK_GRAY);
		mntmExit.addActionListener(this);
		mnExit.add(mntmExit);

		menuBar.add(mnExit);

		JLabel lt = new JLabel("Library Management System");
		lt.setForeground(new Color(55, 145, 225));
		lt.setFont(new Font("Segoe UI Semilight", Font.BOLD, 30));
		lt.setBounds(268, 30, 700, 80);
		contentPane.add(lt);

		JLabel l1 = new JLabel("");
		l1.setVerticalAlignment(SwingConstants.TOP);
		ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("lms/icons/1.png"));
		Image i12 = i11.getImage().getScaledInstance(128, 128, Image.SCALE_DEFAULT);
		ImageIcon i13 = new ImageIcon(i12);
		l1 = new JLabel(i13);
		l1.setBounds(60, 140, 159, 152);
		contentPane.add(l1);

		b1 = new JButton("Add Book");
		b1.setOpaque(true);
		b1.setBorderPainted(false);
		b1.addActionListener(this);
		b1.setBackground(new Color(55, 145, 225));
		b1.setForeground(Color.WHITE);
		b1.setBounds(60, 320, 160, 45);
		contentPane.add(b1);

		JLabel l2 = new JLabel("");
		ImageIcon i21 = new ImageIcon(ClassLoader.getSystemResource("lms/icons/2.png"));
		Image i22 = i21.getImage().getScaledInstance(128, 128, Image.SCALE_DEFAULT);
		ImageIcon i23 = new ImageIcon(i22);
		l2 = new JLabel(i23);
		l2.setBounds(270, 160, 134, 128);
		contentPane.add(l2);

		b2 = new JButton("Book Details");
		b2.setOpaque(true);
		b2.setBorderPainted(false);
		b2.addActionListener(this);
		b2.setBackground(new Color(55, 145, 225));
		b2.setForeground(Color.WHITE);
		b2.setBounds(260, 320, 160, 45);
		contentPane.add(b2);

		JLabel l3 = new JLabel("");
		ImageIcon i31 = new ImageIcon(ClassLoader.getSystemResource("lms/icons/3.png"));
		Image i32 = i31.getImage().getScaledInstance(128, 128, Image.SCALE_DEFAULT);
		ImageIcon i33 = new ImageIcon(i32);
		l3 = new JLabel(i33);
		l3.setBounds(420, 140, 225, 152);
		contentPane.add(l3);

		b3 = new JButton("Add Student");
		b3.setOpaque(true);
		b3.setBorderPainted(false);
		b3.addActionListener(this);
		b3.setBackground(new Color(55, 145, 225));
		b3.setForeground(Color.WHITE);
		b3.setBounds(460, 320, 160, 45);
		contentPane.add(b3);

		JLabel l4 = new JLabel("");
		ImageIcon i41 = new ImageIcon(ClassLoader.getSystemResource("lms/icons/4.png"));
		Image i42 = i41.getImage().getScaledInstance(128, 128, Image.SCALE_DEFAULT);
		ImageIcon i43 = new ImageIcon(i42);
		l4 = new JLabel(i43);
		l4.setBounds(620, 140, 225, 152);
		contentPane.add(l4);

		b4 = new JButton("Student Details");
		b4.setOpaque(true);
		b4.setBorderPainted(false);
		b4.addActionListener(this);
		b4.setBackground(new Color(55, 145, 225));
		b4.setForeground(Color.WHITE);
		b4.setBounds(660, 320, 160, 45);
		contentPane.add(b4);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(67, 229, 247), 2), "", TitledBorder.LEADING,
				TitledBorder.TOP, null, new Color(55, 145, 225)));
		panel.setBounds(20, 120, 850, 260);
		panel.setBackground(Color.WHITE);
		contentPane.add(panel);

		JLabel l5 = new JLabel("");
		ImageIcon i51 = new ImageIcon(ClassLoader.getSystemResource("lms/icons/5.png"));
		Image i52 = i51.getImage().getScaledInstance(128, 128, Image.SCALE_DEFAULT);
		ImageIcon i53 = new ImageIcon(i52);
		l5 = new JLabel(i53);
		l5.setBounds(60, 440, 159, 163);
		contentPane.add(l5);

		b5 = new JButton("Issue Book");
		b5.setOpaque(true);
		b5.setBorderPainted(false);
		b5.addActionListener(this);
		b5.setBackground(new Color(55, 145, 225));
		b5.setForeground(Color.WHITE);
		b5.setBounds(60, 620, 160, 45);
		contentPane.add(b5);

		JLabel l6 = new JLabel("");
		ImageIcon i61 = new ImageIcon(ClassLoader.getSystemResource("lms/icons/6.png"));
		Image i62 = i61.getImage().getScaledInstance(128, 128, Image.SCALE_DEFAULT);
		ImageIcon i63 = new ImageIcon(i62);
		l6 = new JLabel(i63);
		l6.setBounds(270, 440, 139, 152);
		contentPane.add(l6);

		b6 = new JButton("Statistics 1");
		b6.setOpaque(true);
		b6.setBorderPainted(false);
		b6.addActionListener(this);
		b6.setBackground(new Color(55, 145, 225));
		b6.setForeground(Color.WHITE);
		b6.setBounds(260, 620, 160, 45);
		contentPane.add(b6);

		JLabel l7 = new JLabel("");
		ImageIcon i71 = new ImageIcon(ClassLoader.getSystemResource("lms/icons/7.png"));
		Image i72 = i71.getImage().getScaledInstance(128, 128, Image.SCALE_DEFAULT);
		ImageIcon i73 = new ImageIcon(i72);
		l7 = new JLabel(i73);
		l7.setBounds(465, 440, 157, 152);
		contentPane.add(l7);

		b7 = new JButton("Statistics 2");
		b7.setOpaque(true);
		b7.setBorderPainted(false);
		b7.addActionListener(this);
		b7.setBackground(new Color(55, 145, 225));
		b7.setForeground(Color.WHITE);
		b7.setBounds(460, 620, 160, 45);
		contentPane.add(b7);

		JLabel l8 = new JLabel("");
		ImageIcon i81 = new ImageIcon(ClassLoader.getSystemResource("lms/icons/8.png"));
		Image i82 = i81.getImage().getScaledInstance(128, 128, Image.SCALE_DEFAULT);
		ImageIcon i83 = new ImageIcon(i82);
		l8 = new JLabel(i83);
		l8.setBounds(655, 440, 157, 152);
		contentPane.add(l8);

		b8 = new JButton("Return Book");
		b8.setOpaque(true);
		b8.setBorderPainted(false);
		b8.addActionListener(this);
		b8.setBackground(new Color(55, 145, 225));
		b8.setForeground(Color.WHITE);
		b8.setBounds(660, 620, 160, 45);
		contentPane.add(b8);

		JPanel panel2 = new JPanel();
		panel2.setBorder(new TitledBorder(new LineBorder(new Color(67, 229, 247), 2), "", TitledBorder.LEADING,
				TitledBorder.TOP, null, new Color(55, 145, 225)));
		panel2.setBounds(20, 420, 850, 270);
		panel2.setBackground(Color.WHITE);
		contentPane.add(panel2);

		getContentPane().setBackground(Color.WHITE);
		contentPane.setBackground(Color.WHITE);
	}

	/**
	 * Perform selected action
	 */
	public void actionPerformed(ActionEvent ae) {
		String msg = ae.getActionCommand();
		if (msg.equals("Logout")) {
			setVisible(false);
                new Login_user().setVisible(true);
		} else if (msg.equals("Exit")) {
			System.exit(ABORT);
		}

		if (ae.getSource() == b1) {
			this.setVisible(false);
			new AddBook().setVisible(true);
		}
		if (ae.getSource() == b2) {
			this.setVisible(false);
            new BookDetails().setVisible(true);
		}
		if (ae.getSource() == b3) {
			this.setVisible(false);
			new AddStudent().setVisible(true);
		}
		if (ae.getSource() == b4) {
			this.setVisible(false);
            new StudentDetails().setVisible(true);
		}
		if (ae.getSource() == b5) {
			this.setVisible(false);
            new IssueBook().setVisible(true);
		}
		if (ae.getSource() == b6) {
			this.setVisible(false);
            new Statistics1().setVisible(true);
		}
		if (ae.getSource() == b7) {
			this.setVisible(false);
          	new Statistics2().setVisible(true);
		}
		if (ae.getSource() == b8) {
			this.setVisible(false);
      		new ReturnBook().setVisible(true);
		}

	}
}
