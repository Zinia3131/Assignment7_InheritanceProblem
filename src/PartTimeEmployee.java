
class PartTimeEmployee extends Employee {
    private double hourlyWage;
    private int hoursWorked;

    public PartTimeEmployee(String name, int employeeID, double hourlyWage, int hoursWorked) {
        super(name, employeeID);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyWage * hoursWorked;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Type: Part-Time, Hourly Wage: $" + hourlyWage + ", Hours Worked: " + hoursWorked + ", Total Salary: $" + calculateSalary());
    }
}

