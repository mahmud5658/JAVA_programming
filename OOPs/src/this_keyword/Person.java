package this_keyword;

public class Person {
    String name;
    int age;
    String hearColor;
    Person(String name,int age) {
        this.name = name;
        this.age = age;
    }
    Person(String name,int age,String hearColor){
        this(name,age);
        this.hearColor = hearColor;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Hear Color: "+hearColor);
        System.out.println("\n");
    }
}
