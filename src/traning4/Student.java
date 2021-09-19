package traning4;
import java.util.Scanner;
        public class Student {


        private   String name, color;
        private int high;

        public Student(String na,String co, int h) {
            this.name = na;
            this.color = co;
            this.high = h;
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
            Student software = new Student("najib","sort",180);
            Student itØ = new Student("sula","sort",180);

            System.out.println(software.getName()+" " +software.getColor()+" "+software.getHigh());
        }

    }

