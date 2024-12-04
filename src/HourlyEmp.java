public class HourlyEmp extends Employee {
    private double hoursWorked;

// Constructor: Parameterized
// Invoke the parent class constructor to initialize parameters
    public HourlyEmp(String firstName, String lastName, String title, double payRate, double hours) {
        super(firstName, lastName, title, payRate);
        this.hoursWorked = hours;
    }

    public double calculateHourlySalary() {
        return hoursWorked * getPayRate();
    }
    public void display() {
        System.out.println("Employee name " + getFirstName() + " " + getLastName() + " " + getTitle() + " " + calculateHourlySalary());
    }
}
