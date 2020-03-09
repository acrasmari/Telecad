/***
 * @acramari
 * @date: 6.03.2020
 *
 * Scrieti un program care sa determine si afiseze daca un caracter este vocala
 * sau consoana (variabila in care va fi stocat caracterul va fi declarata si
 * initializata la inceputul programului, cu o valoare aleasa de voi).
 */


public class Exercise8 {
    public static void main(String[]args) {
        char tasta ='f';

        if ( tasta == ('a' & 'e' & 'i' & 'o' & 'u')){
            System.out.println("Este vocala !");
        } else{
            System.out.println("Este consoana !");
        }
    }
}
