package traning3_;

import java.util.Scanner;

public class Student {

    private String Name, Coloer ;
    private int High ;



    public void setName(String name ){
        this.Name=name;
    }
    public void setColoer( String color){
        this.Coloer=color;
    }
    public void setHigh(int high){
        this.High=high;
    }


    public String getName(){
        return Name;
    }
    public String getColoer(){
        return Coloer;
    }
    public int getHigh(){
        return High;
    }





    public static void main(String[] args) {


        Scanner input =new Scanner(System.in);

        Student std1=new Student();

        System.out.print( " enter your name ");
        std1.setName(input.nextLine());

        System.out.print( " enter your color ");
        std1.setColoer(input.nextLine());

        System.out.print( " enter your high");
        std1.setHigh(input.nextInt());

        System.out.print( " your name is : "+std1.getName()+"\n"+ "your color is "+std1.getColoer()+"\n"+"your high is "+std1.getHigh());









    }
}