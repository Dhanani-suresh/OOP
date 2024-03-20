public class TutorialCircle {
    public static void main(String[] args) {

    //  Tutorial 2
        Circle circle1 = new Circle();
        System.out.println("The circle has radius of " + circle1.getRadius() + " and area of " + circle1.getArea());
        Circle circle2 = new Circle(8);
        System.out.println("The circle has radius of " + circle2.getRadius() + " and area of " + circle2.getArea());
        Circle circle3 = new Circle(10, "Purple");
        System.out.println("The circle has radius of " + circle3.getRadius() + " and area of " + circle3.getArea());

        System.out.println("Colour of first circle : "+ circle1.getColor());
        System.out.println("Colour of second circle : "+ circle2.getColor());
        System.out.println("Colour of third circle : "+ circle3.getColor());

        circle2.setColor("Red");
        circle2.setRadius(9);
        System.out.println(circle2.getColor());
        System.out.println(circle2.getRadius());
        System.out.println(circle1);


    // Tutorial 4 part 1
        Cylinder cylinder1 = new Cylinder();
        System.out.println("Cylinder: " + "radius:" + cylinder1.getRadius() + "hieght :" + cylinder1.getHieght() + "Area: " +  cylinder1.getArea() + "volume: " + cylinder1.getVolume());
        Cylinder cylinder2 = new Cylinder( 5.0);
        System.out.println("Cylinder: " + "radius:" + cylinder2.getRadius() + "hieght :" + cylinder2.getHieght() + "Area: " +  cylinder2.getArea() + "volume: " + cylinder2.getVolume());
        Cylinder cylinder3 = new Cylinder (5,10.0);
        System.out.println("Cylinder: " + "radius:" + cylinder3.getRadius() + "hieght :" + cylinder3.getHieght() + "Area: " +  cylinder3.getArea() + "volume: " + cylinder3.getVolume());
        System.out.println("Area of cylinder: " + cylinder2.getArea());
        System.out.println ("Volume of the cylinder: " + cylinder2.getVolume());


    }

}
