public class DivisionByZeroException extends Exception
{
 public DivisionByZeroException()
 {
  super("Division by zero!");
 }
 
 public DivisionByZeroException(String msg)
 {
  super(msg);
 }
}