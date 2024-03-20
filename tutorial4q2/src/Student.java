public class Student extends Person {
    private int IDNumber;
    private double fee;
    private int grade;

    public Student( int ID, String name, int Age,  String Gender){
        super(name,  Age, Gender);
        this.IDNumber = ID;
    }

    public double getFee() {
        return fee;
    }

    public int getGrade() {
        return grade;
    }

    public int getIDNumber() {
        return IDNumber;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setIDNumber(int IDNumber) {
        this.IDNumber = IDNumber;
    }
    public String toString() {
        return super.toString() + ", ID: " + IDNumber + ", Fee: " + fee + ", Grade: " + grade;
    }
}
