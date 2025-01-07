import java.util.*;

class Calculator{
 public static void main(String[]args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Basic Calculator");
  System.out.println("Choose the operation");
  System.out.println("1. Addition");
  System.out.println("2. Subtraction");
  System.out.println("3. Multiplication");
  System.out.println("4. Division");

  int choice = sc.nextInt();
  if(choice == 1){
  System.out.println("Enter First number");
  double a = sc.nextDouble();
  System.out.println("Enter Second number");
  double b = sc.nextDouble();
  System.out.println("Sum is " + (a + b));
}
  
}
}