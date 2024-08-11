import java.util.Scanner;

public class Functions {
    //Swaping two numbers
    public static void printSwapingOfTwoNo(int num1, int num2){//num1 and num2 are parameters or formal parameters
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("Numbers After Swapping :");
        System.out.println("No. A = "+num1);
        System.out.println("No. B = "+num2);
    }
    //print hello world 5 times
    public static int printHelloWorld(){
        System.out.println("Hello Wold");
        System.out.println("Hello Wold");
        System.out.println("Hello Wold");
        System.out.println("Hello Wold");
        System.out.println("Hello Wold");
        return 5;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two No. A : ");
        int A = sc.nextInt();
        System.out.println("Enter Two No. B : ");
        int B = sc.nextInt();

        //printHelloWorld();
        printSwapingOfTwoNo(A,B); // A,B are called arguments or actual parameters
    }
}
