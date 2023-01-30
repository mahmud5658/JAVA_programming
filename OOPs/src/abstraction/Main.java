package abstraction;

public class Main {
    public static void main(String[] args) {

        // MobileUser mu = new MobileUser();
        MobileUser mu;

        mu = new Rahim();
        mu.call();
        mu.sendMessage();

        mu = new Karim();
        mu.call();
        mu.sendMessage();

    }
}
