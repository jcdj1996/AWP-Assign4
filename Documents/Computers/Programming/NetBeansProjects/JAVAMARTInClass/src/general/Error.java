package general;
import java.util.*;
import java.util.regex.Pattern;
/**
 *
 * @author The Raven
 */

public class Error 
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        
        boolean keepGoing = true;
        int firstNum = 0, secondNum, result;
        String tempNum;
        
        do
        {
            try
            {
                /*
                do
                {
                    System.out.println("please enter your first number");
                    tempNum = read.nextLine();
                    
                }while(!Pattern.matches("[\\p{Digit}*", tempNum));
                */
                
            System.out.println("please enter your first number");
            tempNum = read.nextLine();
                if(Pattern.matches("[\\p{Digit}*", tempNum))
                {
                    firstNum = Integer.parseInt(tempNum);
                }
                else
                {
                    throw new NumberFormatException();
                }
                
                System.out.println("please enter your second number");
                
                    secondNum = Integer.parseInt(read.nextLine());
                //result = firstNum/secondNum;

                System.out.println(firstNum + " / " + secondNum + " = "
                + (firstNum/secondNum));
                
                keepGoing = true;
            }//end of try block
            
            //don't forget, try catch blocks need the catch in sequence from each other
            //until the last error exception
            catch(NumberFormatException | InputMismatchException error)
            {
                
                System.out.println("Error: " + error.toString());
                
                //get messages
                System.err.println("Message: " + error.getMessage());
                
                //print stack trace
                error.printStackTrace();
                
                StackTraceElement[] traceElements = error.getStackTrace();
                
                for(StackTraceElement element: traceElements)
                {
                    System.err.printf("%s\t", element.getClassName());
                    System.err.printf("%s\t", element.getFileName());
                    System.err.printf("%s\t", element.getLineNumber());
                    System.err.printf("%s\t", element.getMethodName());
                }
                
                keepGoing = false;
            }
            catch(Exception error)
            {
                
            }
            finally
            {
                
            }
        }while(!keepGoing);
    }
}//end of Error class
