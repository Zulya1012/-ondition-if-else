import java.util.Scanner;

public class elseif {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.println("Enter first number: ");
    int a = in.nextInt();

    System.out.println("Enter second number: ");
    int b = in.nextInt();

    if (a > b) {
      System.out.println("First number is greater than the second");
    } else if (a < b) {
      System.out.println("First number is less than the second");
    } else {
      System.out.println("Both numbers are equal");
    }
  }
}
