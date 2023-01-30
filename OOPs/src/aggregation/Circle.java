package aggregation;
public class Circle {
        Operation op = new Operation(); // aggregation
        double PI = 3.1416;
        public double area(int radius){
            //op = new Operation();
            int rsquare = op.square(radius);
            return PI*rsquare;
        }

}
