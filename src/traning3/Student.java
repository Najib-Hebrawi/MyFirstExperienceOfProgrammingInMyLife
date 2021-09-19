package traning3;
import java.util.Scanner;





    public class Student {


        private String name, color;
        private int high;


        public void setName(String n){

            this.name=n;
        }
        public void setColor(String c){
            this.color=c;
        }
        public void setHigh(int h){
            this.high=h;
        }
        public String getName(){
            return name;
        }
        public String getColor(){
            return color;
        }
        public int getHigh(){
            return high;
        }


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            Student software = new Student();

            Student itØ = new Student();


            System.out.println("enter first name");
            software.setName(scanner.next());
            System.out.println("enter second name");
            itØ.setName(scanner.next());

            System.out.println(software.getName());
            System.out.println(itØ.getName());


            System.out.println("Enter the first color");
            software.setColor(scanner.next());
            System.out.println("Enter the second color ");
            itØ.setColor(scanner.next());

            System.out.println(software.getColor());
            System.out.println(itØ.getColor());


            System.out.println("Enter the first high");
            software.setHigh(scanner.nextInt());
            System.out.println("Enter the second high");
            itØ.setHigh(scanner.nextInt());

            System.out.println(software.getHigh());
            System.out.println(itØ.getHigh());


        }

    }

