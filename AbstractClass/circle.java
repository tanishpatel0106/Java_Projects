public class circle extends geometricObjects{
    private double radius;
    public circle() {
    }
    public circle(double radius) {
        this.radius = radius;
    }
    public circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    //Defining the abstract methods
    public double getArea() {
        return radius*radius*Math.PI;
    }
    public double getPerimeter() {
        return 2*radius*Math.PI;
    }
    public void disp(){
        super.disp();
        System.out.println("Radius: "+radius);
        System.out.println("Area: "+getArea());
        System.out.println("Perimeter: "+getPerimeter());
    }
}