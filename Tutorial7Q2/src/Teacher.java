public class Teacher extends Person {
    private double salary;

    public Teacher() {
        super();
        salary = 0.0;
    }

    public Teacher(String name, Date dob, double salary) {
        super(name, dob);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}


