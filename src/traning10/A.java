package traning10;

import java.util.Random;

public class A {
    public static void main(String[] args) {



        int x=140;
        System.out.println(Math.sqrt(x));


        Random random=new Random();

        int y;
        y=random.nextInt();

        System.out.println(y);






        Random random1 =new Random();
        double z;
        z=1+random1.nextInt(6);
        System.out.println(z);







        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);
        System.out.println(isFishTasty);






        int x1=10;
        int x2=20;
        if (x1==x2){
            System.out.println("yes");


        }
         else System.out.println("nej");







        int time = 20;
            String result =(time<18)? "godmorgen": "godaften";
        System.out.println(result);


        for (int w = 1; w < 10; w++) {
            if (w==4)
                break;
            ;
            System.out.println(w);

        }









    }
}
