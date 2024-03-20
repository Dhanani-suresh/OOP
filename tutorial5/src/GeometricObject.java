public abstract class GeometricObject{
    protected  boolean filled;
    protected String color;
    public GeometricObject(){
        filled = true;
        color = "red";
    }
    public GeometricObject(String colour, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public void setColour(String colour){
        this.color = color;
    }

    public String getColour(){
        return color;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public boolean getFilled(){
        return filled;
    }


    public abstract double getArea();

    public abstract double getPerimeter();
    public abstract String getShape();
    public String toString(){
        return "If the shape filled:"+ filled + "Color of the shape" + color;
    }
}