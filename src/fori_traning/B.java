package fori_traning;

public class B {
    public static void main(String[] args) {


        int[][] numer = {{1, 1, 1, 1, 1}, {2, 2, 2}, {3, 3, 3, 3}};


        /**
         * @auther sda
         * @version sda
         */
        for (int i = 0; i < numer.length; i++) {

            for (int j = 0; j < numer[i].length; j++)

                System.out.print(numer[i][j] + " ");

            System.out.println();
        }

    }
}
