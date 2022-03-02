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
public class Statistics2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table_1;
	
	/**
	 * Main function for Statistics2 page
	 * @param args
	 */
	public static void main(String[] args) {
		new Statistics2().setVisible(true);
	}

	/**
	 * Show returned books
	 */
	public void returnBook() {
		try {
			conn con = new conn();
			String sql = "select * from returnBook";
			PreparedStatement st = con.c.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			table_1.setModel(DbUtils.resultSetToTableModel(rs));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	/**
	 * Statistics for returned books
	 */
	public Statistics2() {
		setBounds(400, 200, 810, 594);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

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

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(40, 51, 708, 217);
		contentPane.add(scrollPane_1);

		table_1 = new JTable();
		table_1.setBackground(new Color(204, 255, 255));
		table_1.setForeground(Color.BLACK);
		table_1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		scrollPane_1.setViewportView(table_1);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(55, 145, 225), 2, true), "Return-Book-Details",
				TitledBorder.RIGHT, TitledBorder.TOP, null, new Color(55, 145, 225)));
		panel_1.setBounds(26, 36, 737, 240);
		panel_1.setBackground(Color.WHITE);
		contentPane.add(panel_1);

		returnBook();
	}
}
