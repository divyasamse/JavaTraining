import java.util.*;
public class Demo5
{
   static int div(int x,int y)
   {
      int z=0;
      try
      {
         z=x/y;
      }
      catch(ArithmeticException e)
      {
         throw e;
      }
      return z;
   }
   public static void main(String args[])
{
   int a;
   try
   {
      a=div(10,10);
      System.out.println("Division is: "+a);
   }
   catch(Exception e)
   {
      System.out.println("Recaught in main()");
   }
}
}