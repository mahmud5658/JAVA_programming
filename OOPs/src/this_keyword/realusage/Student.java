package this_keyword.realusage;

public class Student {
    String name,course;
    int roll;
    float fees;
    Student(String name,int roll,String course){
        this.name = name;
        this.roll = roll;
        this.course = course;
    }
    Student(String name,int roll,String course,float fees){
        this(name,roll,course); // call to this must be the first statement in constructor
        this.fees = fees;

    }
    void display(){
        System.out.println("Name : "+name+"\n"+"Roll : "+roll+"\n"+"Course : "+course+"\n"+"Fees : "+fees+"\n");
    }
}
