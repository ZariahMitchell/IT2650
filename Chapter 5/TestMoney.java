public class TestMoney
 {
  public static void main(String[] args)
  {
   Money a1 = new Money();
   Money a2 = new Money(1000);
   Money a3 = new Money(100, 25);
   System.out.println("Start initial Amounts :");
   System.out.println(a1);
   System.out.println(a2);
   System.out.println(a3);
   System.out.println();
   a1.add(a1, a2);
   a3.subtract(a3, a1);
   a2.add(a1);
   a2.subtract(a3);
   System.out.println("After adding and subtracting:");
   System.out.println(a1);
   System.out.println(a2);
   System.out.println(a3);
   System.out.println("--------------");
   Money amount4 = new Money(1, 50);
   System.out.println("Fourth amount Status:");
   System.out.println("Dollars: " + amount4.getDollars());
   System.out.println("Cents: " + amount4.getCents());
   if (amount4.equals(a2))
    System.out.println("Fourth Amount  is equal to second amount.");
   else
 System.out.println("Fourth Amount  is not equal to second amount");
  }

 }

