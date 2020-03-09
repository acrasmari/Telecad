/**
 * @acrasmari
 * @date: 6.03.2020
 *
 * Scrieti un program care sa determine si afiseze daca un an este bisect
 * (variabila in care va fi stocat anul va fi declarata si initializata la inceputul
 * programului, cu o valoare aleasa de voi).
 * */

public class Exercise9 {
    public static void main(String[] args){
        int an = 2024;

        // Un an este bisect daca se divide cu 4 si nu se divide cu 100 sau se divide cu 400

        if((an % 4 == 0) && (an % 100 !=0) || (an % 400 ==0 )){
            System.out.println("Anul " + an + " este bisect!");
        } else {
            System.out.println("Anul " + an + " nu este bisect!");
        }



    }
}
