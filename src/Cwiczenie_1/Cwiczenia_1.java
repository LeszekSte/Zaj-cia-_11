package Cwiczenie_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cwiczenia_1 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String[] napis = new String[3];

        for (int i = 0; i < napis.length; i++) {
            System.out.println("Podaj " + (i + 1) + " tekst.");
            napis[i] = scanner.nextLine();
        }


        int nr = 0;
        boolean ok = false;


        do {

            try {
                System.out.println("Którą chcesz wyświetlić linijke tekstu");
                nr = scanner.nextInt();
                System.out.println(napis[nr]);
                System.out.println("Dobra wartość");
                ok = true;
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Zły qqq index " + ex);
            } catch (InputMismatchException ex) {
                System.out.println("Zły index " + ex);
            } finally {
                System.out.println("Finly ========");
                scanner.nextLine();
            }
        } while (!ok);
    }
}
