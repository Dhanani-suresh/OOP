public class Teacher extends Person {
    private double salary;
    private String subject;
    public Teacher(String name, int Age, double salary, String subject, String Gender){
        super(name, Age, Gender);
        this.subject = subject;
        this.salary  = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String toString(){
        return super.toString() + ", subject: " + subject +", salary: " + salary;
    }
}
