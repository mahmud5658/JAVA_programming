package aggregation2;

public class Employee {
    String name;
    int id ;
    Address address;
    Employee(int id,String name,Address address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display(){
        System.out.println("Name of student is :"+name);
        System.out.println("ID of student is: "+id);
        System.out.println("House number of student is :"+address.houseNo);
        System.out.println("City of student is :"+address.city);
        System.out.println("Country of student is : "+address.country);
    }
}
