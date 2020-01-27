import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int result = 0;
        int flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("a= ");
        int a = sc.nextInt();
        System.out.print("b= ");
        int b = sc.nextInt();
        System.out.print("operations ( + , - , * , / , % ): ");
        char op = sc.next().charAt(0);
        switch (op) {
            case '+':
                result = a + b;
                flag = 1;
                break;

            case '-':
                result = a - b;
                flag = 1;
                break;

            case '*':
                result = a * b;
                flag = 1;
                break;

            case '/':
                result = a / b;
                flag = 1;
                break;

            case '%':
                result = a % b;
                flag = 1;
                break;
        }
        if (flag == 0) {
            System.out.println("Wrong operator!");
        } else {
            System.out.println(String.valueOf(a) + String.valueOf(op) + String.valueOf(b) + "= "+ result);
        }
    }
}
