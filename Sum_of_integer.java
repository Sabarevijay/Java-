// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter the integer=");
         int n =sc.nextInt();
         sumOfFinalSingleDigit(n);
        
    }
    public static void sumOfFinalSingleDigit(int n){
          while(n>=10){
              n=sumOfFinal(n);
          }
          System.out.println("The sum of the overall integer value is="+n);
    }
    public static int sumOfFinal(int n){
        int rev =0;
        while(n>0){
            rev =rev+n%10;
            n=n/10;
        }
        return rev;
        
       
    }
}