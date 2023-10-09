package src.Esercizio1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int[] myArray = new int[5];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(10) + 1;
        }

        System.out.println("Array iniziale = " + Arrays.toString(myArray));
        System.out.println();

        int posizione;
        int valore;

        do {
            System.out.println();
            System.out.println("Scegli la posizione (0-4)");
            posizione = scanner.nextInt();

            if (posizione == 0) {
                break;
            }
            if (posizione < 0 || posizione >= myArray.length) {
                System.out.println("Posizione non valida, riprova!");
                continue;
            }

            System.out.println("Quale numero vuoi inserire?");
            valore = scanner.nextInt();

            if (valore < 1 || valore > 10) {
                System.out.println("Valore non valido, riprova!");
                continue;
            }

            myArray[posizione - 1] = valore;
            System.out.println("Nuovo array = " + Arrays.toString(myArray));
        } while (true);
        {
            System.out.println("Programma terminato!");
            scanner.close();
        }
    }
}
