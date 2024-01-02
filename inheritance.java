class Base {
    int x;

    public int getX() {
        return x;
    } 

    public void setX(int x) {
        System.out.println("I am setting x now");
        this.x = x;
    }

    public void printMe() {
        System.out.println("I am a constructor");
    }
}

class Derived extends Base {
    int Y;
    public int getY() {
        return Y;
    }  
    public void setY(int Y) {
        this.Y = Y;
    }

}

public class inheritance {
    public static void main(String[] args) {
        // Creating an Object of base class.       
        Base b = new Base();
        b.setX(4);
        
        System.out.println(b.getX());
        // Creating an object of derived class.
        Derived d = new Derived();
        d.setX(3);
        System.out.println(d.getX());
    }
}
