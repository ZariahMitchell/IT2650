import java.util.Scanner;

class Lesson_10_Activity
{

 public static void main(String[] args)
 {
   
 Scanner scan_candy = new Scanner(System.in);  
 
  int candybar = 10;
  int gumball = 3;
  
  System.out.println("Enter the number of coupons win");
  
  int numberCouponsWin = scan_candy.nextInt(); // looking for how many cuppons you won

  int numberCandybars = numberCouponsWin / candybar; // number of candtbars yoou can get

  int remainingCoupons = numberCouponsWin % candybar; // 
  
  int numberGumballs = remainingCoupons / gumball; // number of gumballs you can get

  remainingCoupons = remainingCoupons % gumball;

  System.out.println("Number of coupons: " + numberCouponsWin);
  System.out.println("Number of candy bars you can get: " + numberCandybars);
  System.out.println("Number of gumballs you can get: " + numberGumballs);
  System.out.println("Number of coupons remaining: " + remainingCoupons);
 }
}