// Subclass: ContractEmployee
class ContractEmployee extends Employee {
    private int projectDuration; // in months
    private double projectFee;

    public ContractEmployee(String name, int employeeID, int projectDuration, double projectFee) {
        super(name, employeeID);
        this.projectDuration = projectDuration;
        this.projectFee = projectFee;
    }

    public int getProjectDuration() {
        return projectDuration;
    }

    public double getProjectFee() {
        return projectFee;
    }

    @Override
    public double calculateSalary() {
        return projectFee;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Type: Contract, Project Duration: " + projectDuration + " months, Project Fee: $" + projectFee);
    }
}

