public class rectangle extends geometricObjects{
    private double width;
    private double height;
    public rectangle() {
    }
    public rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    //Defining the abstract methods
    public double getArea() {
        return width*height;
    }
    public double getPerimeter() {
        return 2*(width+height);
    }
    public void disp(){
        super.disp();
        System.out.println("Width: "+width);
        System.out.println("Height: "+height);
        System.out.println("Area: "+getArea());
        System.out.println("Perimeter: "+getPerimeter());
    }
}