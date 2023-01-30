package methodoverriding;

public class Test {
    public static void main(String[] args) {

        Teacher t1 = new Teacher();

        t1.name ="Abdullah Al Mahmud";
        t1.age = 22;
        t1.qualification ="B.sc in CSE";

        t1.display();

        Person p = new Person();

        p.name = "Akash";
        p.age = 23;
        p.display();

    }
}
