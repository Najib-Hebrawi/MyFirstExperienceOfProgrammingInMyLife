package traning2;

import java.util.Scanner;

public class regnmaskin {public static void main(String[] args) {

    int num1;
    int num2;
    char operator;
    double answer=0.0;

    Scanner input =new Scanner(System.in);

    System.out.println("Enter the first number :");
    num1=input.nextInt();
    System.out.println("Enter the secund number :");
    num2=input.nextInt();
    System.out.println("what operation?.");
    System.out.println("chose (+   -   /   *   @ ) ");

    operator=input.next().charAt(0);


    switch (operator) {
        case '+' -> answer = num1 + num2;
        case '-' -> answer = num1 - num2;
        case '/' -> answer = num1 / num2;
        case '*' -> answer = num1 * num2;
        case '@' -> answer = num1 * num2 + num1 + num2;
    }
    System.out.println(num1+" "+operator+" "+num2+" ="+answer );

}
}

