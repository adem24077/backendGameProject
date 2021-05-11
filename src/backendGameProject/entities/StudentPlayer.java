package backendGameProject.entities;

public class StudentPlayer extends Player {
	 private String schoolName;
	 private String studentNumber;
	 
	 public StudentPlayer() {}

	public StudentPlayer(String schoolName, String studentNumber) {
		this.schoolName = schoolName;
		this.studentNumber = studentNumber;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	 
	 
	 
}
