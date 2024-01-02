public class VarArgs {
    /*static int sum(int a, int b) {
        return a+b;
    }
    static int sum(int a, int b, int c) {
        return a+b+c;
    }
    static int sum(int a, int b, int c, int d) {
        return a+b+c+d;
    }*/
    // Variable arguments (VarArgs) in JAVA.
    static int sum(int ...arr) {
       // Available as int[] arr;
       int result = 0;
       for(int a: arr) {
           result += a;
       }
       return result;
    }
    public static void main(String[] args) {
        System.out.println("The Sum of 4 and 5 is: "+sum(4, 5));
        System.out.println("The Sum of 4, 3 and 5 is: "+sum(4, 3, 5));
        System.out.println("The Sum of 4, 3, 2 and 5 is: "+sum(4, 3, 2, 5));
        System.out.println("The Sum of 4, 5, 3, 2 and 1 is: "+sum(4, 5, 3 ,2, 6));
        System.out.println("The Sum of Nothing is: "+sum());
    }
}
