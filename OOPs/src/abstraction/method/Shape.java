package abstraction.method;
public abstract class Shape {
    abstract void draw();
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("Drawing rectangle");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Drawing circle");
    }
}
 class Main{
     public static void main(String[] args) {
         Shape c = new Circle();
         Shape r = new Rectangle();

         c.draw();
         r.draw();
     }
}
