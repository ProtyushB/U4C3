import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Demo demo = new Demo();
        try{
            System.out.print("Enter name of Month: ");
            String month=sc.next();
            Month month1=Month.valueOf(month);
            demo.showDetails(month1);
        }
        catch (Exception e){
            System.out.println(e);
        }


    }


    public void showDetails(Month month){
        switch (month){
            case JAN -> System.out.println("This is the 1st Month of the Year January");

            case FEB -> System.out.println("This is the 2nd Month of the Year February");

            case MAR -> System.out.println("This is the 3rd Month of the Year March");

            case APR -> System.out.println("This is the 4th Month of the Year April");

            case MAY -> System.out.println("This is the 5th Month of the Year May");

            case JUN -> System.out.println("This is the 6th Month of the Year June");

            case JUL -> System.out.println("This is the 7th Month of the Year July");

            case AUG -> System.out.println("This is the 8th Month of the Year August");

            case SEP -> System.out.println("This is the 9th Month of the Year September");

            case OCT -> System.out.println("This is the 10th Month of the Year October");

            case NOV -> System.out.println("This is the 11th Month of the Year November");

            case DEC -> System.out.println("This is the 12th Month of the Year December");

            case default -> System.out.println("Invalid Month Name");
        }
    }
}
