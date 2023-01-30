package abstraction.method;

public abstract class Bank {
    abstract int getRateOfInterest();
}
class SBI extends Bank{
    int getRateOfInterest(){
        return 8;
    }
}
class PNB extends Bank{
    int getRateOfInterest(){
        return 9;
    }
}
class TestBank{
    public static void main(String[] args) {

        Bank b;

        b = new SBI();
        System.out.println("Rate of interest :"+b.getRateOfInterest()+"%");

        b = new PNB();
        System.out.println("Rate of interest :"+b.getRateOfInterest()+"%");

    }

}
