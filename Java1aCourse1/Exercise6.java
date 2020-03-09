/**
 * @acrasmari
 * @date : 6.03.2020
 *
 * Scrieti un program care, avand la dispozitie 3 numere, il afiseaza pe cel mai
 * mare dintre acestea (variabilele pentru cele 3 numere vor fi declarate si
 * initializate la inceputul programului, cu valori alese de voi).
 * */

public class Exercise6 {
    public static void main (String[] args) {
        int primulNumar = 15;
        int alDoileaNumar = 30;
        int alTreileaNumar = 60;

        if(primulNumar>=alDoileaNumar){
            if(primulNumar>=alTreileaNumar){
                System.out.println("Cel mai mare numar dintre: 15, 30 si 60 este: " + primulNumar);
            } else {
                System.out.println("Cel mai mare numar dintre: 15, 30 si 60 este: " + alTreileaNumar);
            }
        } else if (alDoileaNumar>=alTreileaNumar){
            System.out.println("Cel mai mare numar dintre: 15, 30 si 60 este: " + alDoileaNumar);
        } else {
            System.out.println("Cel mai mare numar dintre: 15, 30 si 60 este: " + alTreileaNumar);
        }

    }
}
