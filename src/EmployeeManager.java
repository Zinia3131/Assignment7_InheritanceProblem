import java.util.ArrayList;

class EmployeeManager {
    private ArrayList<Employee> employees;

    public EmployeeManager() {
        employees = new ArrayList<>();
    }

    // Add an employee
    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Added " + employee.getName() + " to the company.");
    }

    // Remove an employee
    public void removeEmployee(int employeeID) {
        Employee toRemove = null;
        for (Employee employee : employees) {
            if (employee.getEmployeeID() == employeeID) {
                toRemove = employee;
                break;
            }
        }

        if (toRemove != null) {
            employees.remove(toRemove);
            System.out.println("Removed Employee ID " + employeeID + " from the company.");
        } else {
            System.out.println("Employee ID " + employeeID + " not found.");
        }
    }

    // Display all employees
    public void displayAllEmployees() {
        System.out.println("\nCompany Employees:");
        for (Employee employee : employees) {
            employee.displayDetails();
        }
    }

    // Calculate total salary of all employees
    public double calculateTotalSalary() {
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.calculateSalary();
        }
        return totalSalary;
    }
}

