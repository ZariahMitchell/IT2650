import java.util.Scanner;
import java.util.InputMismatchException;
public class ExceptionDemo 
{
 public static void main(String[] args) 
 {
  Scanner scan = new Scanner(System.in);
  int n1, n2;
  double r;
  boolean solved = false;
  
  while(!solved)
  {
   try
   {
    System.out.print("Please enter a value for number 1: ");
    n1 = scan.nextInt();
    
    System.out.print("Please enter a value for number 2: ");
    n2 = scan.nextInt();
    
    if(n2 == 0)
     throw new DivisionByZeroException();
    
    r = (double) n1 / n2;
    
    System.out.println("Result:  " 
        + n1 + "/" + n2 + " = " + r);
    
    solved = true;
   }  
   catch(InputMismatchException imme)
   {
    scan.nextLine();
    System.out.println("The user enters textual data  instead of integers. Try again! ");
   }
   catch(DivisionByZeroException dbze)
   {
    scan.nextLine();
    System.out.println("The user attempts to divide by zero. Try again!");
   }
   catch(Exception e)
   {
    scan.nextLine();
    System.out.println(e.getMessage());
   }
  }
 }
}