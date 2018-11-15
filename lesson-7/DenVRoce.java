import javax.lang.model.util.ElementScanner6;

/* DenVRoce spočítá rekurzivně počet dní v předešlých uběhlých měsících
   DenVRoce rozlišuje přestupný rok
*/

public class DenVRoce {
    public static boolean prestupnyRok(int rok, int mesic) {
       if (rok % 400 == 0) {return true;}
       if (rok % 100 == 0) {return false;}
       return rok % 4 == 0;
    }
          

    public static int dnuVMesici(int rok, int mesic) {
        int unor = prestupnyRok ? 29 : 28;
        awh.IntList pocet_dni = awh.IntList.create(
           0, 31, unor, 31, 30, 31, 30, 31,
           31, 30, 31, 30, 31);
       int vysledek;
       
       for (int i, i < mesic, i++) {
          vysledek += pocet_dni[i];
       }
        

       return vysledek;

    }
   // Rest is yet to be done

/*
    Tělo programu načte datum z jednoho řádku a poté jednotlivá čísla
    uloží do pole knihovny awh
*/
    public static void main(String[] args) {
        awh.IntList datum = awh.IntList.create();

        java.util.Scanner sc = new java.util.Scanner(System.in);
        while(sc.hasNextInt()) {
            datum.add(sc.nextInt());
        }
        System.out.printf("%d", 
            (
                // Počet celých uběhlých měsíců je o 1 menší
                dnuVMesici((datum.get(1) - 1), datum.get(0))
                 + datum.get(2)
                // Součet počtu dní v uběhlých měsících a počtu uběhlých dní
                //      aktuálního měsíce.
            )
        );
    }
}
