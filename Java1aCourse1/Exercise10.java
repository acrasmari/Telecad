/**
 * @acrasmari
 * @date: 6.03.2020
 *
 * Scrieti un program care, avand la dispozitie 3 numere, afiseaza “Toate
 * numerel sunt egale” daca toate numerele sunt egale, “Toate numerele sunt
 * diferite” daca toate numele sunt diferite si “Nici toate egale, nici toate
 * diferite” daca doar doua dintre ele sunt egale si al treilea este diferit
 * (variabilele pentru cele 3 numere vor fi declarate si initializate la inceputul
 * programului, cu valori alese de voi).
 *
 * */

public class Exercise10 {
    public static void main (String[] args) {
        int n1 = 0;
        int n2 = 1;
        int n3 = 1;

        if((n1==n2) && (n1==n3) && (n2==n3)){
            System.out.println("Toate egale ");
        } else if ((n1!=n2) && (n1!=n3) && (n2!=n3)){
            System.out.println("Toate diferite");
        } else if ((n1==n2) && (n1!=n3) || (n1!=n2) && (n1==n3) || (n1!=n2) && (n2==n3)){
            // Ex: 110 || 101 || 011
            System.out.println("Nici toate egale, nici toate diferite");
        }


    }
}
