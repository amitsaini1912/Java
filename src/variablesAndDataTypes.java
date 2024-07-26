import java.sql.SQLOutput;
import java.util.Scanner;

public class variablesAndDataTypes {

    //Average of 3 numbers
    public static void main(String[] args) {
        System.out.println("Enter Numbers:");
        Scanner sc = new Scanner(System.in);

//        int $ = 24;
//        System.out.println("$ is:"+ $);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int average = (A+B+C)/3;

        System.out.println("Average is :" + average);

    }

    //Area of Square
    /*public static void main(String[] args){
        System.out.println("Enter the side of square");
        Scanner sc = new Scanner(System.in);
        float side = sc.nextFloat();

        float AreaOfSquare = side*side ;
        System.out.println("Area of square : " + AreaOfSquare);
    }*/

    //Creating a basic bill
    /*public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter price of Pen:");
        float pen = sc.nextFloat();
        System.out.print("Enter price of Pencil:");
        float pencil = sc.nextFloat();
        System.out.print("Enter price of Eraser:");
        float eraser = sc.nextFloat();

        float totalPrice = (pen+pencil+eraser);
        float gst = (totalPrice*18)/100;
        float grandTotalPrice = totalPrice+gst;

        System.out.println("Your bill is :-");
        System.out.println("Total price:" + totalPrice);
        System.out.println("18% GST :" + gst);
        System.out.println("You will pay :" + grandTotalPrice);
    }*/


}