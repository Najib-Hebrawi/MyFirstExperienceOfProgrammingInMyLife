package Converting_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class B {
    public static void main(String[] args) {


        String [] names={"Najib","Tarek","Tarek","Rami"};
        String [] names1={"Najibb","Tarekk","Tarekk","Ramii"};

        ArrayList<Integer> number = new ArrayList<Integer>();
        number.add(1);
        number.add(2222);
        number.add(2222);

        ArrayList<Integer> number1 = new ArrayList<Integer>();
        number.add(1);
        number.add(2222);
        number.add(2222);


        System.out.println(Collections.frequency(Arrays.asList(names),"Tarek"));
        System.out.println(Collections.frequency(Arrays.asList(names),"Najib"));

        System.out.println(Collections.frequency(number,2222));

        boolean tof = Collections.disjoint(number,number1);
        System.out.println(tof);
    }
}
