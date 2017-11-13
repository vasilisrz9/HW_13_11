package factorialprint;
import java.util.Scanner;



public class FactorialPrint {

     
    public static void main(String[] args) {
        
         int number;
         System.out.println("Dwse enan arithmo ");
         Scanner scan = new Scanner(System.in);
         do
         { 
           try {
             String k = scan.next();
             number = Integer.parseInt(k);
               break;
           }
           catch (Exception e)
           {
               System.out.println("Dwse arithmo ");
           } 
         }    
         while (true);
         System.out.println(factorial(number));
    }
    
    public static long factorial(int n){
        if(n==1)
            return 1;
        return n * factorial(n-1);
    }
    
}