import java.util.Scanner;

class Lesson_10_Activity
{

 public static void main(String[] args) 
 {
  double distance, mpg, gasPrice;
  Scanner scan = new Scanner(System.in);
  System.out.print("Enter the distance in miles:");
  distance = scan.nextDouble();
  System.out.print("Enter fuel consumption (mpg):");
  mpg = scan.nextDouble();
  System.out.print("Enter the cost of one gallon:");
  gasPrice = scan.nextDouble();
  System.out.println("Cost of the commute: " + (distance / mpg * gasPrice));
 }
}