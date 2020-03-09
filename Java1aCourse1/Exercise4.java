/**
 * @acrasmari
 * @date : 6.03.2020
 *
 * Scrieti un program care, avand la dispozitie 3 numere, verifica daca suma
 * primelor doua este egala cu cel de-al treilea (variabilele pentru cele 3 numere
 * vor fi declarate si initializate la inceputul programului, cu valori alese de voi).
 * Sa se afiseze true sau false in functie de rezultat.
 * Exemplu: Pentru numerele 5, 10, 15, rezultatul este true
 * Pentru numerele 5, 10, 12, rezultatul este false
 * */

public class Exercise4 {
    public static void main (String[] args) {

        int a = 5;
        int b = 10;
        int c = 15;

        int x = 5;
        int y = 10;
        int z = 12;

        if((a+b)==c){
            System.out.println("5 + 10 = 15 TRUE!");
        }else {
            System.out.println("5 + 10 = 15 FALSE");
        }

        if((x+y)==z){
            System.out.println("5 + 10 = 12 TRUE!");
        }else {
            System.out.println("5 + 10 = 12 FALSE!");
        }

    }
}
