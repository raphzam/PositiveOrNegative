import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args){

        //new Scanner named input
        Scanner input = new Scanner(System.in);

        //Variables
        int num;

        System.out.println("Test Data");

        //Prompt user for input
        System.out.print("Enter a number: ");
        num = input.nextInt();

        //Evaluate whether input is positive or negative and print result

        if (num == 0){
            System.out.println(num + " is neither positive or negative.");
        }
        else if (num < 0){
            System.out.println(num + " is negative.");
        } else {
            System.out.println(num + " is positive.");

        }

    }

}
