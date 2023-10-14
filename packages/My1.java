import Calc.*;
import java.util.Scanner;

public class My1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter the First number : ");
        int x = scanner.nextInt();

        System.out.printf("Enter the Second number : ");
        int y = scanner.nextInt();

        System.out.printf("Enter What to do (+,-,*,/) : ");
        char op = scanner.next().charAt(0);

        int r = 0;

        switch (op) {
            case '+':
                r = Calculator.add(x, y);
                break;

            case '-':
                r = Calculator.sub(x, y);
                break;

            case '*':
                r = Calculator.mul(x, y);
                break;

            case '/':
                r = Calculator.div(x, y);
                break;

            default:
                break;
        }

        System.out.println("Result integer  : " + r);
    }
}
