public class MultiInheritance {
    public static void main(String [] args) {
        //High School Student
        highschoolstudent s1 = new highschoolstudent();
        s1.setAge(18);
        s1.setName("ABC");
        s1.setchemmarks(69);
        s1.setmathmarks(89);
        s1.setphysmarks(78);
        s1.disp();
        //CSE Student
        cseStudent s2 = new cseStudent();
        s2.setAge(19);
        s2.setName("XYZ");
        s2.setCGPA(9.89);
        s2.setRollNumber("21BCP050");
        s2.setlanguage("Java");
        s2.setproject("Project 1");
        s2.disp();
    }
}
