import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int[] arr = new int[sc.nextInt()];

        try{
            System.out.println("Enter the elements in the array");
            for (int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }

            System.out.print("Enter the index of the array element you want to access: ");
            int index= sc.nextInt();

            System.out.println("The array element at index "+index+" = "+arr[index]);
            System.out.println("The array element successfully accessed");
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println(arrayIndexOutOfBoundsException);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
