package traning14;

import java.util.Scanner;

public class switch_ {
    public static void main(String[] args) {

        int vægler , num1 , num2 ;

        System.out.println("vægler handling");

        System.out.println(" tryk 1 for at summe to numer "+"\n"+" tryk 2 for at minuser to numer");


        Scanner input= new Scanner(System.in);

        vægler=input.nextInt();

        switch (vægler){

            case 1 :
                System.out.println("enter to number to sum");

                num1=input.nextInt();
                num2=input.nextInt();
                System.out.println(num1+num2);
                break;

            case 2 :
                System.out.println("enter to number to minuser hinanden");
                num1=input.nextInt();
                num2=input.nextInt();
                System.out.println(num1-num2);
                break;
            default:
                System.out.println("din tryk findes ikke");



        }








    }
}
