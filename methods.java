public class methods {
    static int sum(int x, int y) {
        int z;
        if(x > y) {
            z = x + y;
        }
        else {
            z = x * y;
        }
        return z;
    }

    public static void main(String[] args) {
        int a = 5; 
        int b = 8; 
        int c;
        c = sum(a, b);
        int a1 = 8; 
        int b1 = 6;
        int c1 = sum(a1, b1);
        
        System.out.println(c);
        System.out.println(c1);
    }
}
