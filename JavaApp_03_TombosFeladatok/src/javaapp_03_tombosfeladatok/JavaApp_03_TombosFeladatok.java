package javaapp_03_tombosfeladatok;

import java.util.Scanner;

public class JavaApp_03_TombosFeladatok {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] t = new int[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.println(
                    String.format("Kérem adja meg a(z) %d. számot: ", (i+1))
            );
            t[i]=sc.nextInt();
        }
        
        System.out.println("\nMegadás sorrendje:");
        for (int i = 0; i < 5; i++) {
            System.out.print(t[i] + ", ");
        }
        System.out.println("\nFordított sorrend:");
        for (int i = 4; i >= 0; i--) {
            System.out.print(t[i] + ", ");
        }
        //megoldás 2
        /*System.out.println("\nFordított sorrend:");
        for (int i = 0; i < 5; i++) {
            System.out.print(t[4-i] + ", ");
        }
        System.out.println("");*/
        
        
        System.out.println("\nMinden második elem:");
        for (int i = 0; i < 5; i+=2) {
            System.out.print(t[i]+ ", ");
        }
        
        int ind;
        do {
            System.out.println("\nKérem adjon meg egy 1-5 közötti számot: ");
            ind = sc.nextInt();
            if (ind<1||ind>5) {
                System.out.println("Hiba! Nem megfelelő szám!");
            }
        } while (ind < 1 || ind > 5);
        System.out.println(
                String.format("A tömb %d. eleme %d", ind, t[ind-1])
        );
    }
    
}
