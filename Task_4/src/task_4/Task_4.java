package task_4;
import java.util.Scanner;
public class Task_4 {
    public static void main(String[] args) {
    char op;
    Double n1, n2, result;
    
    Scanner input = new Scanner(System.in);
    System.out.println("Choose an operator: +, -, *, or /");
    op = input.next().charAt(0);
    System.out.println("Enter first number");
    n1 = input.nextDouble();

    System.out.println("Enter second number");
    n2 = input.nextDouble();

    switch (op) {

      case '+':
        result = n1 + n2;
        System.out.println(n1 + " + " + n2 + " = " + result);
        break;

      case '-':
        result = n1 - n2;
        System.out.println(n1 + " - " + n2 + " = " + result);
        break;

      case '*':
        result = n1 * n2;
        System.out.println(n1 + " * " + n2 + " = " + result);
        break;
        
      case '/':
        result = n1 / n2;
        System.out.println(n1 + " / " + n2 + " = " + result);
        break;

      default:
        System.out.println("Invalid operator!");
        break;
    }

    input.close();
  }
}
  
    }
    
}
