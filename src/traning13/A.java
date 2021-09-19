package traning13;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {


        Scanner input =new Scanner(System.in);

        car c =new  car();

        System.out.println("enter the age ");
        c.setAge(input.nextInt());
        System.out.println("enter the model");
        c.setModel(input.next());

        System.out.println(c.getAge());
        System.out.println(c.getModel());














    }
}
