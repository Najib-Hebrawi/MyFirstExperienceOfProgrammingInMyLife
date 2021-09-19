package BenytStrenge;

import java.util.Scanner;

public class HowOldYouAre {
    public static void main(String[] args) {


        System.out.println("Enter your age");
        Scanner scanner= new Scanner(System.in);

        int age;
        age=scanner.nextInt();

        int result = 2021-age;

        System.out.println(result);



    }
}
