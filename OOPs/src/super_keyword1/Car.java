package super_keyword1;

public class Car extends Vehicle {
    // color weight and attribute method
    int gear;
    Car(String c,double w,int g){
        super(c,w);
        gear = g;
    }
    void attribute(){
        super.attribute();
        System.out.println("Gear: "+gear);
    }
}
