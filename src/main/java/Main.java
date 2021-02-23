import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Welcome To the Calculator:");
    System.out.println("add [int] [int]");
    System.out.println("subtract [int] [int]");
    System.out.println("multiply [int] [int]");
    System.out.println("divide [int] [int]");
    System.out.println("binary [int]");
    System.out.println("fibonacci [int]");
    System.out.println("exit");

    String type = scanner.next();
    Calculator calc = new Calculator();

    while (!type.equals("exit")) {
      int left = Integer.parseInt(scanner.next());
      if(type.equals("add")) {
        int right = Integer.parseInt(scanner.next());
        int result = calc.add(left, right);
        System.out.println(result);
      } else if (type.equals("subtract")) {
        int right = Integer.parseInt(scanner.next());
        int result = calc.subtract(left, right);
        System.out.println(result);
      } else if (type.equals("binary")) {
        String result = calc.intToBinaryNumber(left);
        System.out.println(result);
      } else if (type.equals("multiply")) {
        int right = Integer.parseInt(scanner.next());
        int result = calc.multiply(left, right);
        System.out.println(result);
      } else if (type.equals("divide")) {
        int right = Integer.parseInt(scanner.next());
        int result = calc.divide(left, right);
        System.out.println(result);
      } else if (type.equals("fibonacci")) {
        int result = calc.fibonacciNumberFinder(left);
        System.out.println(result);
      }

      type = scanner.next();
    }

  }
}
