import java.util.Scanner;

public class conditionalSatements {

    //check whether a number positive or negative
    /*public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        float num = sc.nextFloat();

        if(num<0)
            System.out.println("You entered a negative number ");
        if(num>0)
            System.out.println("You entered a positive number ");
        if(num==0)
            System.out.println("Enter a non zero number");
    }*/

    //fever program
    /*public static void main(String[] args){
        double temp = 103.5;
        if(temp>100)
            System.out.println("You have fever");
        else
            System.out.println("You don't have fever");
    }*/

    //printing week day by using switch case
    /*public static void main(String[] args){
        System.out.println("Enter a number between 1-7 :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        switch (num){
            case 1: System.out.println("Monday");
                break;
            case 2: System.out.println("Tuesday");
                break;
            case 3: System.out.println("Wednesday");
                break;
            case 4: System.out.println("Thursday");
                break;
            case 5: System.out.println("Friday");
                break;
            case 6: System.out.println("Saturday");
                break;
            case 7: System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter number between 1-7");
                break;
        }
    }*/

    //wap to check a year leap or not
    public static void main(String[] args){
        System.out.print("Enter a year in yyyy format : ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        boolean x = (year%4) == 0;
        boolean y = (year%100) != 0;
        boolean z = ((year%400) == 0) && ((year%100) == 0);

        if (x && (y || z)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}
