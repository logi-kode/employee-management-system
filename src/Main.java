import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new FullTimeEmployee(1, "Alice", 50000, 10000));
        employees.add(new PartTimeEmployee(2, "Bob", 0, 40, 500));
        employees.add(new FullTimeEmployee(3, "Charlie", 70000, 15000));
        employees.add(new PartTimeEmployee(4, "Diana", 0, 2, 300));

        for(Employee employee : employees) {
            employee.displayDetails();
            System.out.println();
        }
    }
}
