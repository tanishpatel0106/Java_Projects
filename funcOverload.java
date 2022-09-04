class funcOverload {
    static void Area(int a){
        System.out.println(a*a);
    }
    static void Area(int a,int b){
        System.out.println(a*b);
    }
    static void Area(int a,int b,int c){
        int s = (a+b+c)/2;
        System.out.println((int)Math.sqrt((s*(s-a)*(s-b)*(s-c))));
    }
    public static void main(String[] args) {
        System.out.print("Area of Square of side 5 is :");
        Area(5);
        System.out.print("Area of rectange of side 5 and 7 is :");
        Area(5, 7);
        System.out.print("Area of triangle of sides 3 , 4 and 5 is :");
        Area(3, 4, 5);
    }
}
    