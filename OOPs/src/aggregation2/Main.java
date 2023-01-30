package aggregation2;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("Mymensingh","Bangladesh",23);
        Employee employee = new Employee(5658,"Abdullah Al Mahmud",address);

        employee.display();
    }
}
