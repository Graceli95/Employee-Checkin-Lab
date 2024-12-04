import java.util.Objects;
import java.util.Scanner;

public class Employee {
//    fields
    protected String firstName;
    protected String lastName;
    protected String title;
    protected double payRate;


//    constructors
    public Employee() {};

    public Employee(String firstName, String lastName, String title, double payRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.payRate = payRate;
    }
 public double calculateSalary() {
      return 0.0;
 }

 public void inputEmployee(){
        Scanner input = new Scanner(System.in);
     System.out.println("Enter employee type (salaried/hourly/Commission): ");
    String employeeType = input.nextLine();
        System.out.print("Enter first name: ");
        firstName = input.nextLine();
        System.out.print("Enter last name: ");
        lastName = input.nextLine();
        System.out.print("Enter title: ");
        title = input.nextLine();
        switch(employeeType) {
            case "salaried":{
                System.out.println("Enter annual salary: ");
                payRate = input.nextDouble();
                SalaryEmp salaryEmp = new SalaryEmp(firstName, lastName, title, payRate);
                System.out.println();
                salaryEmp.display();
                break;
            }
            case "hourly":{
                System.out.println("Enter hourly salary: ");
                payRate = input.nextDouble();
                System.out.println("Enter amount of hours: ");
                double hours = input.nextDouble();
               HourlyEmp hourlyEmp = new HourlyEmp(firstName, lastName, title, payRate, hours);
               hourlyEmp.display();
               break;

            }
            case "commission":{
                System.out.println("Enter hourly salary: ");
                payRate = input.nextDouble();
                System.out.println("Enter amount of hours: ");
                double hoursWorked = input.nextDouble();
                System.out.println("Enter amount of sales: ");
                double totalSales = input.nextDouble();
                CommEmp commEmp = new CommEmp(firstName, lastName, title, payRate, hoursWorked, totalSales);
                commEmp.display();
                break;


            }


        }
 }

// getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", title='" + title + '\'' +
                ", payRate=" + payRate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(payRate, employee.payRate) == 0 && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(title, employee.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, title, payRate);
    }
}
