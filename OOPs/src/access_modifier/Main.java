/*
 * private member cannot access from the another class including another packages
 * public member can access from the another class and another package.
 * protected member can access from current package of all classes. If you want to access protected member from another
 * package then you need to inherit by extends keyword.
 * default member can access from the another class with in same package.
 * If you make any class constructor is private, you cannot create the instance of that class from outside the class.
 * A class cannot be private or protected except nested class.
 */
package access_modifier;
public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.display();
    }
}
