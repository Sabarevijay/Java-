// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the number of rows to be print=");
        int n= sc.nextInt();
       for (int i=0;i<=n-1;i++){
           for (int j=0;j<=i;j++){
                System.out.print("*");
           }
           System.out.println();
       }
    }
}
