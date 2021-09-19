package traning5;

import java.util.Scanner;

public class Sten_at_fald {
    public static void main(String[] args) {
        double T,h;
        double g=9.80665;

        Scanner input=new Scanner(System.in);

        System.out.println("Enter the high : ");
        h=input.nextDouble();

        System.out.println("The time is :  "+( Math.sqrt((2*h)/g)));



    }
}

//  T=Math.sqrt((2*h/g);
//g=9,80665 m/s2
