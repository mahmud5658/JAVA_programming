package this_keyword1.constructor;

public class A {
    A(){
        System.out.println("I am Abdullah Al Mahmud");
    }
    A(int x){
        this();
        System.out.println(x);
       // this();
    }
}
