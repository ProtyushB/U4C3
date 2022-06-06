import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String uname=sc.next();

        System.out.print("Enter Password: ");
        String pass=sc.next();

        System.out.print("Enter Mobile Number: ");
        String mob=sc.next();

        System.out.print("Enter Email: ");
        String email=sc.next();

        /*String uname="Protyush";
        String pass="abc54287";
        String mob="8123789456";
        String email="protyush07@gmail.com";*/

        if(uname.matches("[A-Za-z]{3,8}") && pass.matches("[A-Za-z0-9]{3,8}") &&
                mob.matches("[6789][0-9]{9}") && email.matches("[a-z0-9@._]{1,50}")){
            Customer customer = new Customer(uname,pass,mob,email);

            System.out.println("***** User Created *****");
            System.out.println("Username: "+customer.getUsername());
            System.out.println("Password: "+customer.getPassword());
            System.out.println("Mobile: "+customer.getMobileNumber());
            System.out.println("Email: "+customer.getEmail());
        }
        else{
            System.out.println("Provide Appropriate User Details");
        }






    }
}
