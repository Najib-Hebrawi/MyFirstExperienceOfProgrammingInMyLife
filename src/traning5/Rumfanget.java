package traning5;


import java.util.Scanner;

public class Rumfanget {


    private static final double pi = 3.14;
    private double højde, radius;


    public void sethøjde(double h) {
        this.højde = h;
    }

    public double gethøjde() {
        return højde;
    }

    public void setRadius(double r) {
        this.radius = r;
    }


    public double getRadius() {
        return radius;
    }

    public void rumfanget() {
    System.out.println("Rumfanget er " + (pi * (radius * radius) * højde));
    }


    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        double hø,ra;

        System.out.println("Enter the højde : ");
        hø=input.nextDouble();

        System.out.println("Enter the radius : ");
        ra=input.nextDouble();

        Rumfanget V = new Rumfanget();
        V.sethøjde(hø);
        V.setRadius(ra);
        V.rumfanget();
        System.out.println("Slut pryt");





    }
}


//V = Pi * r^2 * h


