package Encapsulation.setterAndgetter;

public class Person {
    private String name;
     int age;
     public void setName(String name){
         this.name = name;
     }
     public String getName(){
         return name;
     }
    void display(){
        System.out.println("Name: "+name+"\n"+"Age: "+age);
    }
}
