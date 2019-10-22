import java.util.Scanner;

public class AddNumbers {
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int num1 = keyboard.nextInt();
        int num2 = keyboard.nextInt();
        int num3 = keyboard.nextInt();

        int sum = num1 + num2 + num3;
        System.out.print("The sum of the three numbers are: " + sum);
    }
}
