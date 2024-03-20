import java.util.Scanner;

public class Date {
    private int month;
    private int day;
    private int year;
    public Date(int day, int month, int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }

    public void setDay(int day) {
        if (isValidDate(day, this.month, this.year)) {
            this.day = day;
        } else {
            System.out.println("Invalid day. No changes made.");
        }
    }

    public void setMonth(int month) {
        if (isValidDate(this.day, month, this.year)) {
            this.month = month;
        } else {
            System.out.println("Invalid month. No changes made.");
        }
    }

    public void setYear(int year) {
        if (isValidDate(this.day, this.month, year)) {
            this.year = year;
        } else {
            System.out.println("Invalid year. No changes made.");
        }
    }

    public String getDate (){
        return day + " / " + month + " / " + year;
    }
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
    private boolean isValidDate(int day, int month, int year) {
        return (day >= 1 && day <= 31) && (month >= 1 && month <= 12) && (year >= 1980 && year <= 2079);
    }

    public String toString(){
        return"Date[day =" + day +",month ="+ month +", year = " + year +"]";
    }
}

