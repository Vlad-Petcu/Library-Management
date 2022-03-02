package lms;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.*;
import net.proteanit.sql.DbUtils;

public class StudentDetails extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField search;
	private JButton b1, b2;

	public static void main(String[] args) {
		new StudentDetails().setVisible(true);
	}

	public void student() {
		try {
			conn con = new conn();
			String sql = "select * from student";
			PreparedStatement st = con.c.prepareStatement(sql);
			ResultSet rs = st.executeQuery();

			table.setModel(DbUtils.resultSetToTableModel(rs));
			rs.close();
			st.close();
			con.c.close();
		} catch (Exception e) {

		}
	}

	public StudentDetails() {
		setBounds(350, 200, 890, 475);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(55, 145, 225));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setBackground(Color.WHITE);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(79, 133, 771, 288);
		contentPane.add(scrollPane);

		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int row = table.getSelectedRow();
				search.setText(table.getModel().getValueAt(row, 1).toString());
			}
		});
		table.setBackground(new Color(240, 248, 255));
		table.setForeground(Color.DARK_GRAY);
		table.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		scrollPane.setViewportView(table);

		JButton b1 = new JButton("Search");
		b1.addActionListener(this);
		b1.setBorder(new LineBorder(new Color(55, 145, 225), 2, true));
		b1.setForeground(new Color(55, 145, 225));
		b1.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		b1.setBounds(564, 89, 138, 33);
		contentPane.add(b1);

		JButton b2 = new JButton("Delete");
		b2.addActionListener(this);
		b2.setForeground(new Color(55, 145, 225));
		b2.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		b2.setBorder(new LineBorder(new Color(55, 145, 225), 2, true));
		b2.setBounds(712, 89, 138, 33);
		contentPane.add(b2);

		JLabel l1 = new JLabel("Student Details");
		l1.setForeground(new Color(55, 145, 225));
		l1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 26));
		l1.setBounds(250, 20, 400, 47);
		contentPane.add(l1);

		search = new JTextField();
		search.setBackground(Color.WHITE);
		search.setBorder(new LineBorder(new Color(55, 145, 225), 2, true));
		search.setForeground(Color.BLACK);
		search.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 17));
		search.setBounds(189, 89, 357, 33);
		contentPane.add(search);
		search.setColumns(10);

		JLabel l2 = new JLabel("Back");
		l2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				Home home = new Home();
				home.setVisible(true);
			}
		});
		l2.setForeground(new Color(55, 145, 225));
		l2.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		l2.setBounds(97, 89, 72, 33);
		contentPane.add(l2);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(55, 145, 225), 3, true), "Student-Deatails",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(55, 145, 225)));
		panel.setBounds(68, 59, 790, 370);
		panel.setBackground(Color.WHITE);
		contentPane.add(panel);

		student();
	}

	public void actionPerformed(ActionEvent ae) {
		try {

			conn con = new conn();
			if (ae.getSource() == b1) {
				String sql = "select * from student where concat(name, student_id) like ?";
				PreparedStatement st = con.c.prepareStatement(sql);
				st.setString(1, "%" + search.getText() + "%");
				ResultSet rs = st.executeQuery();

				table.setModel(DbUtils.resultSetToTableModel(rs));
				rs.close();
				st.close();
			}

			if (ae.getSource() == b2) {
				String sql = "delete from student where name = '" + search.getText() + "'";
				PreparedStatement st = con.c.prepareStatement(sql);

				JDialog.setDefaultLookAndFeelDecorated(true);
				int response = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Confirm",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (response == JOptionPane.NO_OPTION) {

				} else if (response == JOptionPane.YES_OPTION) {
//					int rs = st.executeUpdate();
					JOptionPane.showMessageDialog(null, "Deleted !!");
				} else if (response == JOptionPane.CLOSED_OPTION) {

				}
				st.close();

			}
			con.c.close();
		} catch (Exception e) {

		}
	}
}
