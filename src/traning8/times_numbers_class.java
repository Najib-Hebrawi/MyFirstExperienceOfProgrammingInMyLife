package traning8;

import java.util.Scanner;

public class times_numbers_class {

    public static long times (int x, int y){

        return x*y;
    }




    public static void main(String[] args) {

        System.out.println("Enter to number to times: ");
        Scanner scan = new Scanner(System.in);

        int x =scan.nextInt();

        int y = scan.nextInt();

        System.out.println();System.out.println();        System.out.println(times(x,y));






    }
}
