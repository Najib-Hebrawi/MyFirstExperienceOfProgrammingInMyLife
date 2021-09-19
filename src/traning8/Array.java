package traning8;

public class Array {
    public static void main(String[] args) {


        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};


            //her prøver jeg at printer cars's array men resultet kommer som adresse in i java
        // fordi der skal være en for loop for at kan printer cares's array
        System.out.println(cars);


        //her printer jeg arrays length
        System.out.println(cars.length);

        //her printer jeg arrays numer 3 , husk at array starter med 0
        System.out.println(cars[3]);

        //her printer jeg arrays numer 3 , husk at array starter med 0
        System.out.println(cars[2]);


       // her skifter jeg arrays numer 0 med noget nyt som er Mersedes i den her tilfælde
        cars[0]="Mersedes";


        //her skifter jeg arrays number 3 og printer den, det her kaldes access array
        cars[3]="kia";
        System.out.println(cars[3]);
    }
}


