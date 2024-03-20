public class Student extends Person {
    private int studentID;
    private String course;

    public Student() {
        super();
        studentID = 0;
        course = "Undecided";
    }

    public Student(String name, Date DoB, int studentID, String course) {
        super(name, DoB);
        this.studentID = studentID;
        this.course = course;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

}
