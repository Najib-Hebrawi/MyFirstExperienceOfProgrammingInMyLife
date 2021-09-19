package switch_traning;

import java.util.Scanner;

public class b_ {
    public static void main(String[] args) {


        System.out.println("Enter the day : ");
        Scanner input= new Scanner(System.in);
        String day= input.next();
        String out;

        switch (day){
            case "mandag":
            case "tirsdag":
            case "onsdag":
                out="de er arbejdes dag";
                break;
            default:out="dadad";


        }
        System.out.println(out);
    }
}
