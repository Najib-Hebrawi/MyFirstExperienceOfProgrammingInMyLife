package traning9;

public class A {

    public static void main(String[] args) {
        int[][] age1={{12,13,5,32},{12,3,5,677,8,}};
        int[][] age2={{55,66,77,3,},{12,},{23},{2323,32,323,2,1,1,34,4,3}};


        System.out.println("this is the first agelist");
        display(age1);

        System.out.println("this is the second agelist");

        display(age2);
    }




    public static void display(int x[][]){


        for (int i = 0; i <x.length; i++) {

            for (int j = 0; j < x[i].length; j++) {


                //bemærk her at der skal være print og ikke println
                System.out.print(x[i][j]+"\t");

            }
            System.out.println();

        }

    }
}
