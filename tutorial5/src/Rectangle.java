public class Rectangle extends GeometricObject {
    protected double length;
    protected double width;
    public Rectangle(){
        this.length = 1.0;
        this.width = 1.0;
    }
    public Rectangle (double length, double width) {
        this.length = length;
        this.width = width;
    }
    public Rectangle(double length, double width, String colour, boolean filled){
        super(colour, filled);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return  length * width;
    }

    @Override
    public double getPerimeter() {
        return  2 * length + 2 * width;
    }

    @Override
    public String getShape() {
        return "Rectangle";
    }


}
