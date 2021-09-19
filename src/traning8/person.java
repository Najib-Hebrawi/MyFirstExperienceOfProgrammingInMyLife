package traning8;

public class person {

    String firstname = "Najib";
    String lastname = "Hebrawi";
    int age = 29;


    public static void main(String[] args) {

        person print=new person();
        System.out.println(print.firstname+"\t"+ print.lastname);
        System.out.print(print.age +"\t"+"your age");

    }
}