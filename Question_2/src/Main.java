public class Main {
    public static void main(String[] args) {
        Loan loan = new Loan();
        PermanentEmployee permanentEmployee = new PermanentEmployee(1,"Emp1",50000);
        TemporaryEmployee temporaryEmployee = new TemporaryEmployee(2,"Emp2",1000,30);

        System.out.println("Approval Loan Amount for Permanent Employee: "+loan.calculateLoanAmount(permanentEmployee));
        System.out.println("Approval Loan Amount for Temporary Employee: "+loan.calculateLoanAmount(temporaryEmployee));
        System.out.println("Approval of Loan by Suppling a null value : "+loan.calculateLoanAmount(null));
    }
}
