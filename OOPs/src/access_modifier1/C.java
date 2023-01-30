package access_modifier1;

import access_modifier.A;
public class C extends A {

    protected void msg(){
        System.out.println("I am Abdullah Al Mahmud");
    }

    public static void main(String[] args) {
        C ob = new C();
        ob.display();
        ob.msg();

    }
}
