import java.util.Scanner;

public class ComputeSum_4_3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int input = 0, sum = 0, stopNumber = 0;

        System.out.println("Enter 10 numbers");
       for (int i = 10; i > 0; i--) {
           input = in.nextInt();
           if (input == stopNumber) {
               break;
           } else {
               sum = sum + input;
           }
       }
        System.out.println("The sum is: " + sum);

    }
}
