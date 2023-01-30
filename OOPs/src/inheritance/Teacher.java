package inheritance;
public class Teacher extends Person{

        String qualification;
        void display2(){
            display1();
            System.out.println("Qualification: "+qualification);
            System.out.println("\n");
        }
    }

