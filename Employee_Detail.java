import java.util.*;
public class Employee_Detail {
    int employeeID;
    String name;
    String designation;
    double salary;

    // Constructor
    public Employee_Detail(int employeeID, String name, String designation, double salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    // Getter and Setter methods
    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to print employee details
    public void printDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read employee details from the user
        System.out.print("Enter Employee ID: ");
        int employeeID = sc.nextInt();
        sc.nextLine(); // Consume newline left-over

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Designation: ");
        String designation = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        // Create an Employee_Detail object
        Employee_Detail employee = new Employee_Detail(employeeID, name, designation, salary);

        // Print employee details
        System.out.println("\nEmployee Details:");
        employee.printDetails();
    }
}
