/*There are two type of access modifies in Java:  Access modifiers and Non-access modifiers.

  The Access Modifiers in Java specifies thw accessibility or scope of field, method, constructor or class.
  There are four types of Java access modifiers : 

  Private: The access level of a private modifier is only within the class. It cannot be accessed from outside the class.

  Default: The access level of a default modifier is only within the package. It cannot be accessed from outside the package. 
  If you do not specify any access level, it will be the default.

  Protected: The access level of a protected modifier is within the package and outside the package through child class. 
  If you do not make the child class, it cannot be accessed from outside the package.

  Public: The access level of a public modifier is everywhere. It can be accessed from within the class,
  outside the class, within the package and outside the package.

 */

class C1{
    public int x = 5;
    protected int y =45;
    int z = 6;
    private int a = 78;
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}
public class accessModifiers2 {
    public static void main(String[] args) {
        C1 c = new C1();
        // c.meth1();
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
        // System.out.println(c.a);
    }
}

