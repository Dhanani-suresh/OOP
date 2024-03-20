
public class Person {
    private String name;
    private Date DoB;

    public Person (){
        name = "Tom";
        Date date = new Date (21,7,1997);
        DoB = date;
    }
    public Person (String x, Date DoB){
        this.name = x;
        this.DoB = DoB;

    }
    public void DisplayName(){
        System.out.println(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String s){
        name = s;
    }
    public Date getDoB(){
        return DoB;
    }

    public void setDoB(Date doB) {
        DoB = doB;
    }

}