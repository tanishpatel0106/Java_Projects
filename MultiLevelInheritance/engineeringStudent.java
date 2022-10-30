public class engineeringStudent extends student{
    private String rollnumber;
    private double cgpa;
    public engineeringStudent(){}
    public engineeringStudent(String rollnumber, double cgpa){
        this.rollnumber = rollnumber;
        this.cgpa = cgpa;
    }
    public String getrollNumber(){
        return rollnumber;
    }
    public double getCGPA(){
        return cgpa;
    }
    public void setCGPA(double cgpa){
        this.cgpa = cgpa;
    }
    public void setRollNumber(String rollnumber){
        this.rollnumber = rollnumber;
    }
    void disp(){
        super.disp();
        System.out.println("Roll Number: " + rollnumber);
        System.out.println("CGPA: " + cgpa);
    }
}