package this_keyword1;

public class Student {
    String name;
    int rollNo;
    float fees;
    Student(String name,int rollNo,float fees){
        this.name = name;
        this.rollNo = rollNo;
        this.fees = fees;
    }
    void display(){
        System.out.println(name+" "+rollNo+" "+fees);
    }
}
