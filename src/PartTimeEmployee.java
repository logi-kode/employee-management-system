class PartTimeEmployee extends Employee{
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int id, String name, double basicSalary, int hoursWorked, double hourlyRate) {
        super(id, name, basicSalary);
        if(hoursWorked < 0){
            throw new IllegalArgumentException("Hours worked cannot be negative");
        }
        if (hourlyRate < 0) {
            throw new IllegalArgumentException("Hourly rate cannot be negative.");
        }
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Type: " + getEmployeeType());
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Total Salary: " + calculateSalary());
    }

    @Override
    public String getEmployeeType() {
        return "PartTimeEmployee";
    }
}
