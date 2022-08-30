import java.util.Scanner;

public class Divisors_4_3 {

    public static void main(String args[]) {

         Scanner console = new Scanner(System.in);
         
        System.out.print("Enter the number :  ");
        int num = console.nextInt(); //this is the number inputted by the user
         
        System.out.print("Divisors of " + num + " " + "=" + " " ); //printed to make the beginning of the loop

        for (int i = 1; i < num; i++) { //works until i reaches the inputted number
            if (num % i != 0) { //checks if a number is a divisor of the inputted number
                continue; //if it isn't, it moves on
            }
            System.out.print(i + " , "); //if it is, it adds it to this printed list
        }
    }
}
