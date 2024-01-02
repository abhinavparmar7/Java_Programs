class Phone {
    public void great() {
        System.out.println("Good Morning");
    }
    public void name() {
        System.out.println("My Name is JAVA");
    }
}

class SmartPhone extends Phone{
    public void swagat() {
        System.out.println("Aapka Swagat Hai");
    }
    public void name() {
        System.out.println("My Name is JAVA in class Two");
    }
}

public class dynamic_method_dispatch {
    public static void main(String[] args) {
        //Phone obj = new Phone();   //Allowed
        //SmartPhone smobj = new SmartPhone();   //Allowed
        //obj.name();

        Phone obj = new SmartPhone();     //Allowed
       // SmartPhone obj2 = new Phone();   //Not Allowed

       obj.great();
       obj.name();
    }
}
