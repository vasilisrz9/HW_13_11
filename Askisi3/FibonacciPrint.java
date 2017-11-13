package fibonacciprint;

import java.util.Scanner;


public class FibonacciPrint {

        
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
         System.out.println(fibonacci(number));
    }
    
    public static int fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
    
}