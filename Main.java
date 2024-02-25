
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserInput input = new UserInput();
        int num1 = input.promptInt("Enter an integer.");
        System.out.println("Twice your integer is " + num1 *2);

        double num2 = input.promptDouble("Enter a double.");
        System.out.println("Twice your integer is " + num2 *2);

        String string1 = input.promptString("Enter a string.");
        System.out.println("User string is" + string1);
    }
}

class UserInput {
    Scanner scanner = new Scanner(System.in);
    public int promptInt(String mesage) {
        System.out.println(mesage);
        String userInput = scanner.nextLine();
        int userInt = 0;
        boolean isInt = false;
        while (!isInt) {
            try {
                userInt = Integer.parseInt(userInput);
                isInt = true;
            } catch (NumberFormatException e) {
                System.out.println(userInput + "Not a valid integer. " + mesage);
                userInput = scanner.nextLine();
            } finally {
                System.out.println("Line is always executed.");
            }
        }

        return userInt;
    }

    public double promptDouble(String message) {
        System.out.println(message);
        String userInput = scanner.nextLine();

        double userDouble = 0;
        boolean isDouble = false;
        while (!isDouble) {
            try {
                userDouble = Double.parseDouble(userInput);
                isDouble = true;
            } catch (NumberFormatException e) {
                System.out.println(userInput + "Is not a valid integer. " + message);
                userInput = scanner.nextLine();
            } finally {
                System.out.println("Line is always executed.");
            }
        }
        return userDouble;
    }

    public String promptString(String message){

        return message;
    }
}