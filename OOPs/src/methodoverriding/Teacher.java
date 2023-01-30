package methodoverriding;

public class Teacher extends Person {
    String qualification;

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Qualification: "+qualification);
        System.out.println("\n");
    }
}
