package classtraning;

public class student {




    int    højede,age;

    String name,color;


    @Override
    public String toString() {
        return "student{" +
                "højede=" + højede +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }




    public static void main(String[ ] args) {

        student x=new student( );

        x.name="Najib";
        x.age=29;
        x.color="sort";
        x.højede=178;
        System.out.println(x);
        System.out.println("slut");

    }
}

