public class Patterns {
    //print characters half pyramid
    public static void main(String[] args){
        char ch = 'A';

        for(int line =1; line<=5; line ++){
            for(int chars =1; chars<=line; chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }

    //print half pyramid
    /*public static void main(String[] args){
        for(int line = 1; line<=4; line++){
            for(int star=1; star<=line; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }*/
    /*public static void main(String[] args){
        for(int line =1; line<=4; line ++){
            for(int num =1; num<=line; num++){
                System.out.print(num);
            }
            System.out.println();
        }
    }*/

    //print inverted half pyramid
    /*public static void main(String[] args){
        for(int line =5; line>=1; line--){
            for(int star =line; star>=1; star--){
                System.out.print("*");
            }
            System.out.println();
        }
    }*/
}
