package for_each_traning;

public class B {
    public static void main(String[] args) {

        int[][] numbers = {{1, 1, 1, 1, 1}, {2, 2, 2}, {3, 3, 3, 3}};


        for (int[] row : numbers) {

            for (int j : row)

                System.out.print(j + " ");

            System.out.println();

        }
    }
}
