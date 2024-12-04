public class SalaryEmp extends Employee {
     private final int AMOUNT_OF_BI_MONTHLY_PAYMENTS_ANNUALLY = 24;
//    constructor Parameterized
    public SalaryEmp(String firstName, String lastName, String title, double payRate) {
//    invoke the parent class constructor to initialize parameters
        super(firstName, lastName, title, payRate);
    }


    public double calculateSalary() {
        return payRate / AMOUNT_OF_BI_MONTHLY_PAYMENTS_ANNUALLY;
    }
    public void display(){

        System.out.println("Employee Name: " + getFirstName() + " " + getLastName() + " " + getTitle() + " " + calculateSalary());
    }
}
