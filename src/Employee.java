abstract class Employee {
    protected int id;
    protected String name;
    protected double basicSalary;

    public Employee(int id, String name, double basicSalary){
        if(id < 0) {
            throw new IllegalArgumentException("Id cannot be negative");
        }
        this.id = id;

        this.name = name;

        if(basicSalary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }

        this.basicSalary = basicSalary;
    }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("EmployeeID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
    }

    public abstract String getEmployeeType();
}
