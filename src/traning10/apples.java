package traning10;

public class apples {

    public static void main(String[] args) {

        average(2,41,3);




    }


    public static int average(int...numbers){

        int sum=0;

        for (int x:numbers)
            sum+=x;


        return sum/numbers.length;
    }
}

