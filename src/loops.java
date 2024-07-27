import java.awt.*;
import java.util.Scanner;

public class loops {

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

    //Check whether a number prime or not
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         do{
             System.out.print("Enter a number: ");
             int num = sc.nextInt();
             if ((num % 2) != 0){
                 System.out.println("no. is not prime");
                 continue;
             }
             System.out.println("No. is Prime.");
         }while (true);
    }

}
