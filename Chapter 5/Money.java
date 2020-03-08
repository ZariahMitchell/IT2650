public class Money
{
 private int dollars;
 private int cents;

 public Money() 
 {
  dollars = 0;
  cents = 0;
 }

 public Money(int dollars) 
 {
  this.dollars = dollars;
  cents = 0;
 }

 public Money(int dollars, int cents)
 {
  this.dollars = dollars;
  this.cents = cents;
  if (cents > 99) {
   int totalDollars = cents / 100;
   cents -= totalDollars * 100;
   dollars += totalDollars;
  }
 }

 public void setDollars(int newDollars) 
 {
  dollars = newDollars;
 }

 public void setCents(int newCents) 
 {
  cents = newCents;
  if (cents > 99)
  {

   int totalDollars = cents / 100;
   cents -= totalDollars * 100;
   dollars += totalDollars;
  }
 }

 public int getDollars() 
 {
  return dollars;
 }

 public int getCents()
 {
  return cents;
 }

 public static Money add(Money initial, Money toAdd) 
 {
  initial.dollars += toAdd.dollars;
  initial.cents += toAdd.cents;
  if (initial.cents > 99)
  {
   int totalDollars = initial.cents / 100;
   initial.cents -= totalDollars * 100;
   initial.dollars += totalDollars;
  }

  return initial;
 }

 public static Money subtract(Money initial, Money toSubtract)
 {
  if (initial.dollars < toSubtract.dollars
    || (initial.dollars == toSubtract.dollars && initial.cents < toSubtract.cents))
  {
   initial.dollars = 0;
   initial.cents = 0;
   return initial;
  }
  initial.dollars -= toSubtract.dollars;
  initial.cents -= toSubtract.cents;
  if (initial.cents < 0) 
  {
   initial.cents += 100;
   initial.dollars--;
  }

  return initial;
 }

 public Money add(Money addAmount) 
 {
  dollars += addAmount.dollars;
  cents += addAmount.cents;
  if (cents > 99) {
   int totalDollars = cents / 100;
   cents -= totalDollars * 100;
   dollars += totalDollars;
  }

  return this;
 }

 public Money subtract(Money subAmount) 
 {
  if (dollars < subAmount.dollars || (dollars == subAmount.dollars && cents < subAmount.cents)) {
   dollars = 0;
   cents = 0;
   return this;
  }
  dollars -= subAmount.dollars;
  cents -= subAmount.cents;
  if (cents < 0) {
   cents += 100;
   dollars--;
  }

  return this;
 }

 public boolean equals(Money other) 
 {
  return (dollars == other.dollars) && (cents == other.cents);
 }

 public String toString() 
 {
  return "$" + dollars + "." + cents;
 }
}
 