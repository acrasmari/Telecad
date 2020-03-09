/**
 * @ acrasmari
 * @ date: 6.03.2020
 *
 *  Scrieti un program care sa afiseze aria si perimetrul unui dreptunghi cu
 *  lungimea de 8cm si latimea de 4.2cm.
 * */

public class Exercise3 {
    public static void main (String[] args){
        int lungimea = 8;
        double latimea = 4.2;

        double aria = lungimea * latimea;
        double perimetrul = 2 * (lungimea + latimea);

        System.out.println("Aria unui dreptunghi cu lungimea de 8cm si latimea de 4.2cm este: " + aria);
        System.out.println("Perimetrul unui dreptunghi cu lungimea de 8cm si latimea de 4.2cm este: " + perimetrul);


    }
}
