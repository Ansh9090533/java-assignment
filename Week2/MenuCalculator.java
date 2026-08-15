import java.util.Scanner;

public class Calculator {
    static void printMenu() {
        System.out.println("\n===== CALCULATOR =====");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }
    static double add(double a, double b) {
        return a + b;
    }

    static double subtract(double a, double b) {
        return a - b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    static double divide(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            printMenu();
            choice = sc.nextInt();

            if (choice < 0 || choice > 4) {
                System.out.println("Invalid menu choice!");
                continue;
            }
            if (choice == 0) {
                System.out.println("Calculator closed.");
                break;
            }
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();
            double result = 0;

            switch (choice) {

                case 1:
                    result = add(num1, num2);
                    break;

                case 2:
                    result = subtract(num1, num2);
                    break;

                case 3:
                    result = multiply(num1, num2);
                    break;

                case 4:
                    if (num2 == 0) {
                        System.out.println("Error: Cannot divide by zero.");
                        continue;
                    }
                    result = divide(num1, num2);
                    break;
            }
            System.out.println("Result = " + result);
        } while (choice != 0);
        sc.close();
    }
}
