interface Bicycle{
    void applyBrack(int decrement);
    void speedUp(int increment);
}

interface HornBicycle{
    void blowHornk3g();
    void blowHornmhn();
}
 
class AvonCycle implements Bicycle{
    int a = 45;
    void blowHorn() {
        System.out.println("Pee Pee Poo Poo");
    }
    public void applyBrack(int decrement) {
        System.out.println("Applying Break");
    }

    public void speedUp(int increment) {
        System.out.println("Applying SpeedUp");
    }

    public void blowHornk3g() {
        System.out.println("Kabhi Khishi Kabhi hum pee pee pee pee");
    }

    public void blowHornmhn(){
        System.out.println("Main hoon naa po po po po");
    }
}

public class Interface_ {
    public static void main(String[] args) {
        AvonCycle cycleAbhi = new AvonCycle();
        cycleAbhi.applyBrack(1);
        // You can create Properties in Interfaces
        System.out.println(cycleAbhi.a);
        // You cannot modify the properties in Interfaces as they are final
        //cycleAbhi.a = 454;
        // System.out.println(cycleAbhi.a);

        cycleAbhi.blowHornk3g();
        cycleAbhi.blowHornmhn();

    }
}
