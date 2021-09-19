package ligemed_ligemed_ikke;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {


        String text= " jeg kommer Fra syrien";
        System.out.println(text.indexOf("syrien"));





        boolean isOver18;


      System.out.println("skrive dit aldre");


        Scanner input=new Scanner(System.in);

        int x=input.nextInt();


//        if (x >= 18){
//            isOver18 = true;
//        } else {
//            isOver18 = false;
//        }
//
//        if (!isOver18){
//            System.out.println("Du er ikke myntige");
//        }    else {
//            System.out.println("Du er myntige");
//        }


        //ELLER



        if (x != 18){
            System.out.println("du er ikk 18 år");
        }    else {
            System.out.println("du er 18 år ");
        }

}
}
