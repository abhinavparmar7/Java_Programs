import javax.sound.sampled.SourceDataLine;

abstract class Parent2{
    public Parent2(){
         System.out.println("Mai Parent2 ka constructor hoon");
    }
    public void sayHello() {
        System.out.println("Hello");
    }
    abstract public void great();
    abstract public void great2();
}

class Child2 extends Parent2{
    @Override
    public void great() {
        System.out.println("Good Morining");
    }
    @Override
    public void great2() {
        System.out.println("Good Afternoon");
    }
}

abstract class Child3 extends Parent2{
    public void th() {
        System.out.println("I am Good");
    }
}
public class abstract1 {
    public static void main(String[] args) {
        //Parent2 p = new Parent2();     --error
        Child2 c = new Child2();       
        //Child3 c3 = new Child3();      --error
        c.great2();
    }
}
