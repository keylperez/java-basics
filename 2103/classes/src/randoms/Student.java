package randoms;

public class Student {
	public int studID;
	public String studName;
	public String program;
	public int yearLevel;

	public Student() {
		this(1000, "Default Name", "Default Program", 0);
	}

	public Student(int studID, String studName, String program, int yearLevel) {
		this.studID = studID;
		this.studName = studName;
		this.program = program;
		this.yearLevel = yearLevel;
	}
	
	public void setStudID(int studID) {
		this.studID = studID;
	}

	public int getStudID() {
		return studID;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public int getYearLevel() {
		return yearLevel;
	}

	public void setYearLevel(int yearLevel) {
		this.yearLevel = yearLevel;
	}

	public void shiftToOtherProgram(String program) {
		this.program = program;
	}

	public void displayStud() {
		System.out.println("Student ID: " + studID);
		System.out.println("Student Name: " + studName);
		System.out.println("Program: " + program);
		System.out.println("Year Level: " + yearLevel);
	}
}