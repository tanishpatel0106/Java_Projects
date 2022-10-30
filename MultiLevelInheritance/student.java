public class student {
    private int age;
    private String name;
    public student(){}
    public student(int age, String name){
        this.age = age;
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    void disp(){
        System.out.println("Name of Student: " + name);
        System.out.println("Age of Student: " + age);
    }
}