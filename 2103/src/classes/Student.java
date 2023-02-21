package src.classes;

public class Student {
    public int studID;
    public String studName;
    public String program;
    public int yearLevel;

    public Student() {
        this(1000, "Default Name");
    }

    public Student(int studID, String studName) {
        this.studID = studID;
        this.studName = studName;
    }

    public void setSTudID(int studID) {
        this.studID = studID;
    }

    public int getStudID() {
        return studID;
    }

    // public Student(String studName, int studID){
    // this.studID = studID;
    // this.studName = studName;
    // }

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