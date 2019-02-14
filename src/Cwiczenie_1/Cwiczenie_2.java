package Cwiczenie_1;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Cwiczenie_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double suma = 0;

        for (int i = 1; i <= 5; i++) {
                try {
                    System.out.println("Podaj " + (i) + " liczbę");
                    suma += scanner.nextDouble();
                } catch (InputMismatchException ex) {
                    System.out.println("To nie liczba");
                    scanner.nextLine();
                    i--;}
        }
        System.out.println(suma);
    }
}
