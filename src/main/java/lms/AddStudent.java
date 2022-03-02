package lms;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

//import library.management.system.Home;
//import library.management.system.conn;

import java.awt.event.*;
import java.sql.PreparedStatement;
import java.util.*;

/**
 * Add student page
 * 
 * @author Andi
 * @author Vlad
 */
public class AddStudent extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
    private JTextField t1, t2, t3, t4, t5, t6;
    JButton b1, b2;

    /**
     * Main function for add student page
     * @param args
     */
    public static void main(String[] args) {
        new AddStudent().setVisible(true);
    }

    /**
     * Generate random id's for students
     */
    public void random() {
        Random rd = new Random();
        t1.setText("" + rd.nextInt(10000 + 1));
    }
    
    /**
     * Add student page configuration
     */
    public AddStudent() {
        super("Add Student");
		setBounds(700, 200, 550, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		JLabel l1 = new JLabel("Student_id");
		l1.setForeground(new Color(47, 79, 79));
		l1.setFont(new Font("Tahoma", Font.BOLD, 14));
		l1.setBounds(64, 63, 102, 22);
		contentPane.add(l1);
	
		JLabel l2 = new JLabel("Name");
		l2.setForeground(new Color(47, 79, 79));
		l2.setFont(new Font("Tahoma", Font.BOLD, 14));
		l2.setBounds(64, 97, 102, 22);
		contentPane.add(l2);
	
		JLabel l3 = new JLabel("Father's Name");
		l3.setForeground(new Color(47, 79, 79));
		l3.setFont(new Font("Tahoma", Font.BOLD, 14));
		l3.setBounds(64, 130, 102, 22);
		contentPane.add(l3);
		
		JLabel l4 = new JLabel("College");
		l4.setForeground(new Color(47, 79, 79));
		l4.setFont(new Font("Tahoma", Font.BOLD, 14));
		l4.setBounds(64, 173, 102, 22);
		contentPane.add(l4);
	
		JLabel l5 = new JLabel("University");
		l5.setForeground(new Color(47, 79, 79));
		l5.setFont(new Font("Tahoma", Font.BOLD, 14));
		l5.setBounds(64, 209, 102, 22);
		contentPane.add(l5);
	
	    JLabel l6 = new JLabel("Year");
		l6.setForeground(new Color(47, 79, 79));
		l6.setFont(new Font("Tahoma", Font.BOLD, 14));
		l6.setBounds(64, 242, 102, 22);
		contentPane.add(l6);
	
		t1 = new JTextField();
		t1.setEditable(false);
		t1.setForeground(new Color(47, 79, 79));
		t1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t1.setBounds(174, 66, 156, 20);
		contentPane.add(t1);
		t1.setColumns(10);
	
		t2 = new JTextField();
		t2.setForeground(new Color(47, 79, 79));
		t2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t2.setColumns(10);
		t2.setBounds(174, 100, 156, 20);
		contentPane.add(t2);
	
		t3 = new JTextField();
		t3.setForeground(new Color(47, 79, 79));
		t3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t3.setColumns(10);
		t3.setBounds(174, 133, 156, 20);
		contentPane.add(t3);
	
		t4 = new JTextField();
		t4.setForeground(new Color(47, 79, 79));
		t4.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t4.setColumns(10);
		t4.setBounds(174, 174, 156, 20);
		contentPane.add(t4);
		
		t5 = new JTextField();
		t5.setForeground(new Color(47, 79, 79));
		t5.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t5.setColumns(10);
		t5.setBounds(174, 214, 156, 20);
		contentPane.add(t5);
		
		t6 = new JTextField();
		t6.setForeground(new Color(47, 79, 79));
		t6.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t6.setColumns(10);
		t6.setBounds(174, 246, 156, 20);
		contentPane.add(t6);
	
		b1 = new JButton("ADD");
	    b1.setOpaque(true);
	    b1.setBorderPainted(false);
		b1.addActionListener(this);
		b1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		b1.setBounds(64, 321, 111, 33);
	    b1.setBackground(new Color(55, 145, 225));
	    b1.setForeground(Color.WHITE);
		contentPane.add(b1);
	
		b2 = new JButton("Back");
	    b2.setOpaque(true);
	    b2.setBorderPainted(false);
		b2.addActionListener(this);
		b2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		b2.setBounds(198, 321, 111, 33);
	    b2.setBackground(new Color(55, 145, 225));
	    b2.setForeground(Color.WHITE);
		contentPane.add(b2);
	
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(67, 229, 247), 2, true), "",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(30, 144, 255)));
		panel.setBackground(new Color(211, 211, 211));
		panel.setBounds(10, 38, 358, 348);
	    contentPane.setBackground(Color.WHITE);
	    panel.setBackground(Color.WHITE);
		contentPane.add(panel);
		random();
    }
    
    /**
	 * Function used to check if user hasn't left any fields empty
	 * 
	 * @param student
	 * @return 1 if a field is empty
	 * @return 0 if student data is correct
	 */
    public static int checkStudentDataIntegrity(Student student) {
    	if (student.studentID.equals("")) {
    		JOptionPane.showMessageDialog(null, "Student ID is NULL!");
			return 1;
		} else if (student.name.equals("")) {
			JOptionPane.showMessageDialog(null, "Student Name is NULL!");
			return 1;
		} else if (student.fatherName.equals("")) {
			JOptionPane.showMessageDialog(null, "Student Father Name is NULL!");
			return 1;
		} else if (student.college.equals("")) {
			JOptionPane.showMessageDialog(null, "Student College is NULL!");
			return 1;
		} else if (student.university.equals("")) {
			JOptionPane.showMessageDialog(null, "Student University is NULL!");
			return 1;
		} else if (student.year.equals("")) {
			JOptionPane.showMessageDialog(null, "Student Year is NULL!");
			return 1;
		}
    	
    	return 0;
    }
    
    /**
     * Perform add student action
     */
    public void actionPerformed(ActionEvent ae) {
    	try {
    		conn con = new conn();
	        if(ae.getSource() == b1) {
	        	Student student1 = new Student(t1.getText(),t2.getText(),t3.getText(),t4.getText(),t5.getText(),t6.getText());
	        	
	        	if (checkStudentDataIntegrity(student1) == 0) {
	        		String sql = "insert into student(student_id, name, father, college, university, year) values(?, ?, ?, ?, ?, ?)";
					PreparedStatement st = con.c.prepareStatement(sql);
					st.setString(1, t1.getText());
					st.setString(2, t2.getText());
					st.setString(3, t3.getText());
					st.setString(4, t4.getText());
					st.setString(5, t5.getText());
					st.setString(6, t6.getText());

					int i = st.executeUpdate();
					if (i > 0) {
						JOptionPane.showMessageDialog(null, "Successfully Added");
						this.setVisible(false);
						new Home().setVisible(true);
					} else
						JOptionPane.showMessageDialog(null, "error");
		        	t1.setText("");
		            t2.setText("");
		            t3.setText("");
		            t4.setText("");
		            t5.setText("");
		            t6.setText("");
	        	} else {
	        		/*
	        		 * Do nothing as the function 
	        		 * already prints the error that has occurred.
	        		 */
	        	}
	        }    
	        if(ae.getSource() == b2) {
	        	this.setVisible(false);
	            new Home().setVisible(true);		
	        }
    	}catch (Exception e) {

		}
            
    }
}

