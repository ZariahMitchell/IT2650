public class InterestCal
{
 private static final double COST_OF_STEREO = 1000.00;
 private static final double INTEREST_PER_YEAR = 0.18;
 private static final double MONTH_PAYMENT = 50.00;

 public static void main(String[] args)
 {
  double debt = COST_OF_STEREO;
  double interestRatePerMonth = INTEREST_PER_YEAR / 12;
  double interest = 0;
  double totalInterest = 0;
  double principal = 0;
  int numberOfMonths = 0;

  while (debt > 0)
  {
   interest = debt * interestRatePerMonth;

   if (debt >= MONTH_PAYMENT)
    principal = MONTH_PAYMENT - interest;
   else
    principal = debt;

   debt = debt - principal;

   numberOfMonths++;
   totalInterest += interest;
  }

  System.out.printf("Amount of loan: $%.2f\n",COST_OF_STEREO);
  System.out.printf("Interest rate per year: %.2f%%\n", 
                                    (INTEREST_PER_YEAR * 100));
  System.out.printf("Monthly payment: $%.2f\n", MONTH_PAYMENT);
  System.out.println("Number of months needed to pay off the loan: " + numberOfMonths);
  System.out.printf("Total amount of interest paid over the life of the loan: $%.2f\n",
                                                        totalInterest);
 }
}
