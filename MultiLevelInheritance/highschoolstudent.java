public class highschoolstudent extends student{
    private double physmarks;
    private double mathmarks;
    private double chemmarks;
    highschoolstudent(){}
    highschoolstudent(double physmarks, double mathmarks, double chemmarks){
        this.chemmarks = chemmarks;
        this.mathmarks = mathmarks;
        this.physmarks = physmarks;
    }
    public double getphysmarks(){
        return physmarks;
    }
    public double getmathmarks(){
        return mathmarks;
    }
    public double getchemmarks(){
        return chemmarks;
    }
    public void setphysmarks(double physmarks){
        this.physmarks = physmarks;
    }
    public void setchemmarks(double chemmarks){
        this.chemmarks = chemmarks;
    }
    public void setmathmarks(double mathmarks){
        this.mathmarks = mathmarks;
    }
    void disp(){
        super.disp();
        System.out.println("Physics Marks: " + physmarks);
        System.out.println("Chemistry Marks: " + chemmarks);
        System.out.println("Mathematics Marks: " + mathmarks);
    }
}
