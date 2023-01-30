package inheritance;

public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.name = "Abdullah Al Mahmud";
        t1.age = 22;
        t1.qualification = "B.Sc in CSE";
        t1.display2();
        Person p1 = new Person();
        p1.name = "Akash";
        p1.age = 23;
        p1.display1();
    }
}
