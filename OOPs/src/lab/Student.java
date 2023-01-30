package lab;

public class Student {
    String name;
    int age;
    String id;
    float cgpa;

    void display(){
        System.out.println("Name: "+name);
        System.out.println("ID :"+id);
        System.out.println("Age: "+age);
        System.out.println("CGPA: "+cgpa);
    }

}
class Main{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Abdullah Al Mahmud";
        s1.id = "221-15-5658";
        s1.age = 22;
        s1.cgpa = 3.52f;
        s1.display();
    }
}
