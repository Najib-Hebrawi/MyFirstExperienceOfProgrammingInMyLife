package ligemed_ligemed_ikke;

public class C {
    public static void main(String[] args) {

        int playerAmount = 4;
        int turn = 1;


        for (int i = 0; i < 3; i++) {

            System.out.println(turn + " is taking turn");





            turn = (turn+1)%playerAmount;

        }







    }
}
