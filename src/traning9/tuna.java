package traning9;

import java.util.Scanner;

public class tuna {

    private int age ;
    private String name ;

    public void setName( String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }

    public int getAge(){
        return age;
    }

    public void printAge (){
        System.out.println("your age is  " + getAge() + " hey here  " + getName());
    }

    public static void main(String[] args) {

        tuna t = new tuna();


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age ");
        int age = scan.nextInt();
        t.setAge(age);

        Scanner input= new Scanner(System.in);
        System.out.println("Enter your name");
        String name = input.nextLine();
        t.setName(name);


        t.printAge();
    }
}
