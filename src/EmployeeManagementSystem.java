public class EmployeeManagementSystem {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();

        // Adding employees
        FullTimeEmployee fullTimeEmp = new FullTimeEmployee("Alice", 101, 5000);
        PartTimeEmployee partTimeEmp = new PartTimeEmployee("Bob", 102, 20, 120);
        ContractEmployee contractEmp = new ContractEmployee("Charlie", 103, 6, 15000);

        manager.addEmployee(fullTimeEmp);
        manager.addEmployee(partTimeEmp);
        manager.addEmployee(contractEmp);

        // Display all employees
        manager.displayAllEmployees();

        // Calculate total salary
        System.out.println("\nTotal Salary of All Employees: $" + manager.calculateTotalSalary());

        // Remove an employee
        manager.removeEmployee(102);

        // Display employees after removal
        manager.displayAllEmployees();
    }
}

