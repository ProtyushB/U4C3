public class PermanentEmployee extends Employee{

    private double basicPay;

    public PermanentEmployee(int employeeId, String employeeName, double basicPay) {
        super(employeeId, employeeName);
        this.basicPay=basicPay;
        calculateSalary();
    }

    @Override
    void calculateSalary() {
        salary=basicPay-(basicPay*0.12);
    }
}
