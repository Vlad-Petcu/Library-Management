package lms;

/**
 * Class that implements students
 * 
 * @author Andi
 * @author Vlad
 */
public class Student {
	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID; 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
	
	String studentID;
	String name;
	String fatherName;
	String college;
	String university;
	String year;
	
	/**
	 * @param studentID
	 * @param name
	 * @param fatherName
	 * @param college
	 * @param university
	 * @param year
	 */
	public Student(String studentID, String name, String fatherName, String college, String university, String year) {
		super();
		this.studentID = studentID;
		this.name = name;
		this.fatherName = fatherName;
		this.college = college;
		this.university = university;
		this.year = year;
	}
	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", name=" + name + ", fatherName=" + fatherName + ", college="
				+ college + ", university=" + university + ", year=" + year + "]";
	}
	
}
