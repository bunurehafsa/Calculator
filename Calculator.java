import java.util.*;

 public class Calculator {
	static void mul(double x,double y) 
  {
    double answer = x*y; 
    System.out.println("Multiplied " +answer);

  }

 static void div(double x,double y)
  {
   double answer = x/y;
   System.out.println("Divided " +answer);

  }

 static void add(double x,double y) 
  {
   double answer = x+y;
   System.out.println("Addition " +answer);

  }
 static void sub(double x,double y) 
  {
   double answer = x-y;
   System.out.println("Subtraction " +answer);

  }

public static void main(String[] args) 
  {

    int choice;
    double x;
    double y;

    Scanner scan = new Scanner(System.in);
	//Scanner in = new Scanner(new FileReader("Shefa. txt"));

    System.out.println("Enter 1 for Multiply");
    System.out.println("Enter 2 for Divide");
    System.out.println("Enter 3 for Addition");
    System.out.println("Enter 4 for Subtraction");
	System.out.println("Enter the choice:");
    choice = scan.nextInt();

    System.out.println("Enter the first number ");
    x = scan.nextInt();
    System.out.println("Enter the second number ");
    y = scan.nextInt();

    switch (choice)
	{

      case 1:
      mul(x,y);break;
      case 2:
      div(x,y);break;
      case 3:
      add(x,y);break;
      case 4:
      sub(x,y);break;
    }

  }

}
//https://mkyong.com/junit5/junit-5-maven-examples/
