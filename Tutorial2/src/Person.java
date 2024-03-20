
public class Person {
    private String name;
    private String surname;
    private int age;

    public Person (String x,String y,int a){
        name = x;
        surname = y;
        age = a;
    }
    public void DisplayName(){
        System.out.println(name);
    }
    public void setSurname(String s){
        surname = s;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "name= " + name +
                ", surname = " + surname +
                ", age = " + age;
    }

    public String getSurname(){
        return surname;
    }
    public static void main(String[] args) {
        Person p = new Person("Ben", "Stokes", 45);
        Person q = new Person("Tom","Holland" , 19);
        Person r = new Person("Liz","Cooper", 25);
        Person [] nameList = {p,q,r};
        for (Person i:nameList) {
            System.out.println(i.toString());
        }
    }
}