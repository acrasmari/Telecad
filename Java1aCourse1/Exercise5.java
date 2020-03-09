/**
 * @acrasmari
 * @date : 6.03.2020
 *
 * Scrieti un program care transforma un numar de secunde(variabila declarata
 * si initializata la inceputul programului, cu o valoare aleasa de voi) in minute
 * si secunde si le afiseaza in formatul mm:ss
 * Exemplu: Pentru numarul initial 263, rezultatul este 04:23 (263 secunde = 4
 * minute si 23 secunde)
 * */

public class Exercise5 {

    public static void main (String[] args) {
        int numar = 263;

        int secunde = numar % 60;
        int ore = numar / 60;
        int minute = ore % 60;
        ore = ore / 60;

        System.out.println(minute + ":" + secunde + " ( " + numar + " secunde = " + minute + " minute si " + secunde + " secunde )");

    }

}
