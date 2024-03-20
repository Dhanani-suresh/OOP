public class Person{
    protected String myName;
    protected  int myAge;
    protected String myGender;
    public Person(){
        myName = "Louisa";
        myAge = 26;
        myGender = "F";
    }
    public Person ( String name, int Age, String Gender){
        this.myName =  name;
        this.myAge = Age;
        this.myGender = Gender;
    }

    public String getMyName() {
        return myName;
    }

    public int getMyAge() {
        return myAge;
    }

    public String getMyGender() {
        return myGender;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public void setMyAge(int myAge) {
        this.myAge = myAge;
    }

    public void setMyGender(String myGender) {
        this.myGender = myGender;
    }

    @ Override
    public String toString(){return "Name: " +myName+ ", Age: " +myAge+ ", Gender: " + myGender;}

}