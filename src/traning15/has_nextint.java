package traning15;

import java.util.Scanner;

public class has_nextint {

    public static void main(String[] args) {


        Scanner input = new Scanner (System.in);

        System.out.print("Input your age ");

        while (!input.hasNext()){
            input.next();
        }

        int age = input.nextInt();

        System.out.println("you are "+age);
    }


}

