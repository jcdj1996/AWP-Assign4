package general;
import java.util.*;
import java.util.regex.Pattern;

public class Error 
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        boolean keepGoing = false;
        int firstNum =0, secondNum=0;
        String tempNum;
        
        do 
        {
            try
            {
                
                /*do
                {
                    System.out.println("please enter your first number");
                    tempNum = read.nextLine(); 
                }while(!Pattern.matches("[\\p{Digit}*]", tempNum));
*/
                System.out.println("please enter your second number");
                secondNum = Integer.parseInt(read.nextLine());
                //result = firstNum / secondNum;
                System.out.println(firstNum + " / " + secondNum + " = " 
                        + (firstNum / secondNum));
                keepGoing = true;
            }
            catch(NumberFormatException | InputMismatchException error)
            {
                System.out.println("Error:" + error.toString());
                
                //getMessage
                System.err.println("Message: " + error.getMessage());
                
                //print stack trace
                error.printStackTrace();
                
                StackTraceElement[] traceElements = error.getStackTrace();
                
                for(StackTraceElement element: traceElements)
                {
                    System.err.printf("%s\t", element.getClassName());
                    System.err.printf("%s\t", element.getFileName());
                    System.err.printf("%s\t", element.getLineNumber());
                    System.err.printf("%s%n", element.getMethodName());
                    
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
    public static int getNumber() throws NumberFormatException,
            InputMismatchException, ArithmeticException
    {
        Scanner read = new Scanner(System.in);
        int tempNum = Integer.parseInt(read.nextLine());      
        return tempNum;
    }
}