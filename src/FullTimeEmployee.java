class FullTimeEmployee extends Employee {
    private double bonus;

    public FullTimeEmployee(int id, String name, double basicSalary, double bonus) {
        super(id, name, basicSalary);
        if(bonus < 0) {
            throw new IllegalArgumentException("Bonus cannot be negative");
        }
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return basicSalary + bonus;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Type: " + getEmployeeType());
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + calculateSalary());
    }

    @Override
    public String getEmployeeType() {
        return "FullTimeEmployee";
    }
}
