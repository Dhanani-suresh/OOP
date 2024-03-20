public class Cylinder extends Circle{
    private double hieght;
    public Cylinder(){
        super();
        hieght = 1.0;
    }
    public Cylinder(double hieght){
        super();
        this.hieght = hieght;
    }
    public Cylinder (int radius, double hieght ){
        super(radius);
        this.hieght = hieght;
    }

    public double getHieght() {
        return hieght;
    }
    public double getVolume(){
        double volume = super.getArea()*hieght;
        return volume;
    }

    @Override
    public double getArea(){
        return 2* Math.PI * getRadius() * hieght +( 2* super.getArea());

    }

}
