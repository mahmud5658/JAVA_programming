package final_keyword;

public class University {
    final String NAME ="DIU";
    static final int fees; // static blank final variable
    static{
        fees = 35000;
    }
    void display(){
        //name = "JU";
        System.out.println(NAME);
        System.out.println(fees);
    }
}
