import java.util.Scanner;

public class SquareRootWhile_4_2 {
    public static void main(String args[])
    {
    System.out.print("Type a non-negative integer: ");
     Scanner console = new Scanner(System.in);
	int number = console.nextInt();

    while(number < 0) {
        System.out.println("Invalid number, try again: " + number);
        number = console.nextInt();
    }
    double sqrt = Math.sqrt(number);
        System.out.println(sqrt);
    }
    
}
