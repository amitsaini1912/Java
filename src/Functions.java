import java.util.Scanner;

public class Functions {
    //Find Factorial of a number
    public static int factorial(int n){
        int factorial = 1;
        for(int i=1; i<=n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    //Find boinomial coeficients
    public static int nCr(int n, int r){
        int factN = factorial(n);
        int factR = factorial(r);
        int factNminusR = factorial(n-r);

        int nCr = factN/(factR*factNminusR);
        return nCr;
    }

    //Swaping two numbers
    public static void printSwapingOfTwoNo(int num1, int num2){//num1 and num2 are parameters or formal parameters
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("Numbers After Swapping :");
        System.out.println("No. A = "+num1);
        System.out.println("No. B = "+num2);
    }

    //Product of two numbers
    public static int multiplication(int A, int B){
        int multiplication = A*B;
        System.out.println("Product = " + multiplication);
        return multiplication;
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
        //printSwapingOfTwoNo(A,B); // A,B are called arguments or actual parameters
        //multiplication(A,B);
        //System.out.println(factorial(A));
        System.out.println(nCr(A,B));
    }
}
