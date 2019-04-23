public class arithmatic
{
   public static void main(String[] args)
   {
      int myID = 20172590;
      int numLet = 5;
      
      System.out.println("My first name is Brent");
      System.out.println("My Student ID is 20172590");
      System.out.println("The number of characters "
            + "in my first name is 5");
      System.out.println("Expression 1 --> " + (myID % 17));
      System.out.println("Expression 2 --> " + ((numLet + 17)
            % 11));
      System.out.println("Expression 3 --> " + (myID / 
            (numLet + 800.)));
      System.out.println("Expression 4 --> " + (1 + 2 + 3 + 4 + 5));
      System.out.println("Expression 5 --> " + (15000. / (80. + 
            ((myID - 123456.) / ((numLet + 20)^2)))));
   }

}

/* ------------------Pasted Output----------------------
 * 
 * My first name is Brent
 * My Student ID is 20172590
 * The number of characters in my first name is 5
 * Expression 1 --> 16
 * Expression 2 --> 0
 * Expression 3 --> 25059.11801242236
 * Expression 4 --> 15
 * Expression 5 --> 0.020198197682403937
 * 
 * -----------------------------------------------------                
 */