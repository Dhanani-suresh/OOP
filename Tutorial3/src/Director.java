public class Director {
    private String name;
    private String surname;
    private int numberOfMovies;
    private Date DoB;
    public Director(String name,String surname){
        this.name=name;
        this.surname = surname;
    }

    public Date getDoB() {
        return DoB;
    }

    public int getNumberOfMovies() {
        return numberOfMovies;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setDoB(Date date){
        DoB = date;
    }

    public void setNumberOfMovies(int numberOfMovies) {
        this.numberOfMovies = numberOfMovies;
    }
    public String toString(){
        return "Director [ name = " +name +", surname = "+surname+", dob = "+DoB+",movies directed = "+numberOfMovies+"]";
    }
}

