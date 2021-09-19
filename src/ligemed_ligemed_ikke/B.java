package ligemed_ligemed_ikke;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {

        boolean isover18;


        Scanner input=new Scanner(System.in);
        System.out.println("skrive din ældre ");
        int ældre=input.nextInt();



        if (ældre >= 18 ){

            isover18= true;
        }else isover18=false;

        if (! isover18){
            System.out.println("du er  ikke voksen");
        }else System.out.println("du er  voksen");



    }
}
