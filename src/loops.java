import java.awt.*;
import java.util.Scanner;

public class loops {

    //Check whether a number prime or not
    public static void main(String[] args){
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
