package practice;

public class Calculation {
    void fact(int n){
        int fact = 1;
        for(int i=1; i<=n;i++){
            fact = fact*i;
        }
        System.out.println("Factorial is : "+fact);

    }

    public static void main(String[] args) {
        new Calculation().fact(6); // creating object with anonymous object
    }
}
