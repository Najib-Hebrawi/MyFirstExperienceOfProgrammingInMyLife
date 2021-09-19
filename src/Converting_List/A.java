package Converting_List;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class A {
    public static void main(String[] args) {

        // create an array and convert to list.
        Character[] ray ={'p','w','n'};
        List<Character> x = Arrays.asList(ray);
        System.out.println("List is : " );
        output(x);


        // reverse and print out the list.
        Collections.reverse(x);
        System.out.println("After reverse : " );
        output(x);


        // create a new array and a new list.
        Character [] newRay = new Character[3];
        List<Character> listCopy = Arrays.asList(newRay);


        // copy contents of list into listCopy
        Collections.copy(listCopy, x);
        System.out.println("Copy of list : ");
        output(listCopy);


        // fill collection with crap
        Collections.fill(x,'X');
        System.out.println("After filling th list : ");
        output(x);
    }

    // output methods

    private  static void output(List<Character> theList ){

        for (Character thing:
                theList) {
            System.out.printf("%s",  thing);
            System.out.println();
        }
    }




}
