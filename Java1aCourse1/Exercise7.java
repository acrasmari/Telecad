/**
 * @acrasmari
 * @date: 6.03.2020
 *
 * Un produs costa 100$, dar este redus pe baza varstei clientului. Clientii care
 * au 60 de ani sau mai mult, primesc o reducere de 10$. Clientii sub 18 ani,
 * primesc o reducere de 20$. Toti ceilalti clienti primesc o reducere de 5$.
 * Scrieti un program care sa afiseze pretul produsului pe baza varstei
 * clientului(varsta va fi stocata intr-o variabila declarata si initializata la
 * inceputul programului, cu o valoare aleasa de voi).
 * */

public class Exercise7 {
    public static void main (String[] args){
        int varsta  = 100;
        int pretProdus = 100;
        int reducereCinci = 5;
        int reducereZece = 10;
        int reducereDouaZeci = 20;



        if(varsta>=60){
            System.out.println("Produl costa 100$.");
            System.out.println("Aveti peste 60 ani, primiti o reducere de 10$.");
            System.out.println("Trebuie sa platiti: " + (pretProdus - reducereZece) + "$");

        } else if (varsta>=18 && varsta<60){
            System.out.println("Produsul costa 100$.");
            System.out.println("Aveti intre 18 si 60 de ani, primiti o reducere de 5$.");
            System.out.println("Trebuie sa platiti: " + (pretProdus - reducereCinci) + "$");

        }   else {
            System.out.println("Produl costa 100$.");
            System.out.println("Aveti sub 18 ani, primiti o reducere de 20$.");
            System.out.println("Trebuie sa platiti: " + (pretProdus - reducereDouaZeci) + "$!");
        }




    }
}
