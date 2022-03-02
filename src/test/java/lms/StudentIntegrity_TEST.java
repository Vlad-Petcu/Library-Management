package lms;

import static org.junit.Assert.*;

import org.junit.Test;

public class StudentIntegrity_TEST {
	Student student = new Student (	"1", 				// Student ID
									"Name1", 			// Student Name
									"FatherName1",		// Father Name
									"CollegeName1", 	// College
									"UniversityName1",	// University
									"1" 				// Year
								  );
		
	public boolean resultToBool(Student s) {
		if (AddStudent.checkStudentDataIntegrity(s) == 1) {
			/*
			 * checkStudentDataIntegrity FAILED!
			 */
			return false;	
		} else {
			/*
			 * checkStudentDataIntegrity PASSED!
			 */
			return true;
		}
	}
	
	@Test
	public void test1() {
		student.setStudentID("");
		
		boolean checkStudent_Result = resultToBool(student);
		
		assertFalse(checkStudent_Result);
	}
	
	@Test
	public void test2() {
		student.setName("");
		
		boolean checkStudent_Result = resultToBool(student);
		
		assertFalse(checkStudent_Result);
	}
	
	@Test
	public void test3() {
		student.setFatherName("");
		
		boolean checkStudent_Result = resultToBool(student);
		
		assertFalse(checkStudent_Result);
	}
	
	@Test
	public void test4() {
		student.setCollege("");
		
		boolean checkStudent_Result = resultToBool(student);
		
		assertFalse(checkStudent_Result);
	}
	
	@Test
	public void test5() {
		student.setUniversity("");
		
		boolean checkStudent_Result = resultToBool(student);
		
		assertFalse(checkStudent_Result);
	}
	
	@Test
	public void test6() {
		student.setYear("");
		
		boolean checkStudent_Result = resultToBool(student);
		
		assertFalse(checkStudent_Result);
	}
	
	@Test
	public void test8() {	
		boolean checkStudent_Result = resultToBool(student); 
		
		assertFalse(checkStudent_Result);
	}
}
