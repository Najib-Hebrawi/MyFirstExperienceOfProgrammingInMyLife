package traning8;

public class person1 {

    int ældre;
    String navn;

    public person1(int age , String name){
        ældre=age;
        navn=name;
    }


    public static void main(String[] args) {
        person1 a=new person1(29,"najib");
        System.out.println(a.ældre+a.navn);

    }
}


