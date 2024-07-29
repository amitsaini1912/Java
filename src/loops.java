import java.awt.*;
import java.util.Scanner;

public class loops {

    //Check whether a number prime or not
    /*public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a No. : ");
        int n = sc.nextInt();

        boolean isPrime = true;
        for(int i=2; i<=Math.sqrt(n); i++){ //for(int i=2; i<n; i++)
           if(n%i == 0 ){
               isPrime = false;
           }
        }

        if(isPrime == true){
            System.out.println("No. is prime");
        }
        else {
            System.out.println("No. is not prime");
        }
    }*/

    //Find factorial of a user given no.
    /*public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        int fact = 1;
        System.out.println("Enter No.");
        num = sc.nextInt();
        for(int i=1; i<=(num); i++){
            fact *= i; // 5! = 5*4*3*2*1
        }
        System.out.println("n! is : " + fact);
    }*/

    //wap that reads a set of integers and then print the sum of the even and odd integers
    public  static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        int choice;
        int evenSum = 0;
        int oddSum = 0;

        do{
            System.out.println("Enter the numbers ");
            num = sc.nextInt();

            if( num % 2 == 0){
                evenSum += num;
            }
            else {
               oddSum += num;
            }

            System.out.println("Do you want to conti. ? enter 1 for yes and 0 for no : ");
            choice = sc.nextInt();
        }while (choice==1);

        System.out.println("Sum og enen Numbers : " + evenSum);
        System.out.println("Sum og odd Numbers : " + oddSum);
    }


    //Find reverse of a number (While Loop)
    /*public static void main(String[] args ){
        int n = 10899;
        int rev = 0;
        while (n>0){
            int lastdigit = n%10;
            rev = (rev*10)+lastdigit;
            n = n/10;
        }
        System.out.println("Reverse No. is : " + rev);
    }*/
    /* Reverse a user given no. using do while loop
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No. that you want to reverse : ");
        int n = sc.nextInt();
        int rev = 0;
        do{
            int lastdigit = n%10;
            rev = (rev*10)+lastdigit;
            n = n/10;
        } while (n>0);
        System.out.println("Reversed No. : " +rev);
    }*/


    //take no. from user and print them except 10 (do while loop)
    /*public static void main(String[] args){
       Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Enter a Number :");
           int num = sc.nextInt();
           if(num %10 == 0){
               continue;
            }
          System.out.println("You Entered :" + num);
        }while (true);
     }*/

    //Print a square pattern
    /*public static void main(String[] args){

        for(int i=1; i<=5; i++){
                System.out.println("*****");
        }
        int line = 1;
        while (line <= 4){
            System.out.println("****");
            line++;
        }
     }*/



}
