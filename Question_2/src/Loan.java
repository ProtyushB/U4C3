public class Loan {
    public double calculateLoanAmount(Employee employeeObj){
        if(employeeObj instanceof PermanentEmployee){
            return employeeObj.salary*15/100;
        }
        if (employeeObj instanceof TemporaryEmployee){
            return employeeObj.salary*10/100;
        }
        return 0;
    }
}
