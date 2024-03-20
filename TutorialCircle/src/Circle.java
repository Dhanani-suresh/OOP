import static java.awt.Color.red;

public class Circle {
    private double radius;
    private String color;

    public Circle (){
        radius = 1;
        color = "Blue";
    }
    public Circle(int R){
        radius = R;
        color = "Blue";
    }
    public Circle(int R, String C){
        radius = R;
        color = C;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle radius = " + radius +
                ", color = " + color;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }

}