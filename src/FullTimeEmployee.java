// Subclass: FullTimeEmployee
class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, int employeeID, double monthlySalary) {
        super(name, employeeID);
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary * 12; // Annual salary
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Type: Full-Time, Monthly Salary: $" + monthlySalary + ", Annual Salary: $" + calculateSalary());
    }
}
