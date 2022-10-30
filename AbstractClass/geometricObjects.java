abstract class geometricObjects {
    private String color;
    private boolean filled;
    protected geometricObjects() {
    }
    protected geometricObjects(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    protected geometricObjects(boolean filled) {
        this.filled = filled;
    }
    protected geometricObjects(String color) {
        this.color = color;
    }
    abstract double getArea();
    abstract double getPerimeter();
    protected String getColor() {
        return color;
    }
    protected void setColor(String color) {
        this.color = color;
    }
    protected boolean isFilled() {
        return filled;
    }
    protected void setFilled(boolean filled) {
        this.filled = filled;
    }
    protected void disp(){
        System.out.println("Color: "+color);
        System.out.println("Filled: "+filled);
    }
}