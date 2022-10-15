import java.util.Objects;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    Calculator calculator = new Calculator();

    System.out.println("Welcome to the calculator");
    String input = in.nextLine();
    while (!Objects.equals(input, "exit")) {
      input = in.nextLine();
      String[] commands = input.split(" ");
      if (Objects.equals(commands[0], "add")) {
        System.out.println(calculator.add(Integer.parseInt(commands[1]), Integer.parseInt(commands[2])));
      }
      else if (Objects.equals(commands[0], "subtract")) {
        System.out.println(calculator.subtract(Integer.parseInt(commands[1]), Integer.parseInt(commands[2])));
      }
      else if (Objects.equals(commands[0], "multiply")) {
        System.out.println(calculator.multiply(Integer.parseInt(commands[1]), Integer.parseInt(commands[2])));
      }
      else if (Objects.equals(commands[0], "fibonacci")) {
        System.out.println(calculator.fibonacciNumberFinder(Integer.parseInt(commands[1])));
      }
      else if (Objects.equals(commands[0], "binary")) {
        System.out.println(calculator.intToBinaryNumber(Integer.parseInt(commands[1])));
      }
      else {
        System.out.println("Unknown command. Enter 'exit' to exit");
      }
    }
  }
}
