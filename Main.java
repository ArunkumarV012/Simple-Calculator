import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple calculator");
        System.out.println("Choose your Operator");

        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");

        System.out.println("Enter your First number");
        float firstnumber = scanner.nextFloat();

        System.out.println("Enter your Second number");
        float secondnumber = scanner.nextFloat();

        System.out.println("Enter your operator (1 - 4)");
        int operator = scanner.nextInt();

        switch(operator) {
            case 1:
                System.out.println("1.Addition: " + (firstnumber + secondnumber));
                break;
            case 2:
                System.out.println("2.Subtraction: " + (firstnumber - secondnumber));
                break;
            case 3:
                System.out.println("3.Multiplication: " + (firstnumber * secondnumber));
                break;
            case 4:
                System.out.println("4. Division: " + (firstnumber / secondnumber));
                break;
        }

        scanner.close();

    }
}

















