package switch_traning;

import java.util.Scanner;

public class a_ {
    public static void main(String[] args) {


        System.out.println("Enter your grad : ");
        Scanner input = new Scanner(System.in);

        int grad=input.nextInt();

        String out;

        switch (grad){
            case 12:
                out="nice";
                break;

            case 10:
                out="ok";
                break;
            case 7:
                out="hahaha";
                break;
            default:
                out="what??";
        }
        System.out.println(out);

        input.close();


    }
}
