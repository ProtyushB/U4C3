public abstract class Employee {
    protected int employeeId;
    protected String employeeName;
    protected double salary;
    public Employee(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    abstract void calculateSalary();
}
