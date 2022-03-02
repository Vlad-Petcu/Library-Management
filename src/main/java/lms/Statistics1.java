package lms;

import java.awt.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.*;
import net.proteanit.sql.DbUtils;
import java.awt.event.*;

/**
 * Statistics 1 page
 * Here the user can see statistics about issued books.
 * 
 * @author Andi
 * @author Vlad
 */
public class Statistics1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	
	/**
	 * Main function for Statistics1 page
	 * @param args
	 */
	public static void main(String[] args) {
		new Statistics1().setVisible(true);
	}
	
	/**
	 * Return issued books
	 */
	public void issueBook() {
		try {
			conn con = new conn();
			String sql = "select * from issueBook";
			PreparedStatement st = con.c.prepareStatement(sql);
			ResultSet rs = st.executeQuery();

			table.setModel(DbUtils.resultSetToTableModel(rs));

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	/**
	 * Statistics for issued books
	 */
	public Statistics1() {
		setBounds(400, 200, 810, 594);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(40, 51, 708, 217);
		contentPane.add(scrollPane);

		table = new JTable();
		table.setBackground(new Color(224, 255, 255));
		table.setForeground(Color.BLACK);
		table.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		scrollPane.setViewportView(table);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(55, 145, 225), 2, true), "Issue-Book-Details",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(55, 145, 225)));
		panel.setForeground(new Color(0, 128, 128));
		panel.setBounds(26, 36, 737, 240);
		panel.setBackground(Color.WHITE);
		contentPane.add(panel);

		JLabel l1 = new JLabel("Back");
		l1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				setVisible(false);
				Home home = new Home();
				home.setVisible(true);
			}
		});
		l1.setForeground(Color.BLACK);
		l1.setFont(new Font("Tahoma", Font.BOLD, 18));
		l1.setBounds(690, 13, 96, 27);
		contentPane.add(l1);

		issueBook();
	}
}
