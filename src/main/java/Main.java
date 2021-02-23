
public class Main {

  public static void main(String[] args) {
    String type = args[0];
    Calculator calc = new Calculator();

    if(type.equals("add")) {
      int left = Integer.parseInt(args[1]);
      int right = Integer.parseInt(args[2]);
      int result = calc.add(left, right);
      System.out.println(result);
    } else if (type.equals("subtract")) {
      int left = Integer.parseInt(args[1]);
      int right = Integer.parseInt(args[2]);
      int result = calc.subtract(left, right);
      System.out.println(result);
    } else if (type.equals("binary")) {
      int left = Integer.parseInt(args[1]);
      String result = calc.intToBinaryNumber(left);
      System.out.println(result);
    } else if (type.equals("multiply")) {
      int left = Integer.parseInt(args[1]);
      int right = Integer.parseInt(args[2]);
      int result = calc.multiply(left, right);
      System.out.println(result);
    } else if (type.equals("divide")) {
      int left = Integer.parseInt(args[1]);
      int right = Integer.parseInt(args[2]);
      int result = calc.divide(left, right);
      System.out.println(result);
    } else if (type.equals("fibonacci")) {
      int left = Integer.parseInt(args[1]);
      int result = calc.fibonacciNumberFinder(left);
      System.out.println(result);
    }

  }
}
