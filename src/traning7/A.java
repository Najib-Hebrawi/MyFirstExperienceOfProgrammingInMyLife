package traning7;

public class A {

    /*
    Opret et nyt projekt og kopier følgende kode ind.
Brug debuggeren til at svare på spørgsmålet:

Hvad står der på plads nr 3 i arrayet, når variablen i skifter fra 2 til 3?

Det er forbudt at printe variabler/værdier ud.
Hint: Du kan se hvad der er i arrayet ved at trykke på den lille trekant:


     */




    static void bubbleSort(int arr[])
    {
        int n = arr.length
                ;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }




    public static void main(String[] args) {

        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr);

    }




}
//Ctrl+F8 eller klik i venstre-margin: Sæt et breakpoint f.eks. i starten af main.