import javax.lang.model.util.ElementScanner6;

/* DenVRoce spočítá rekurzivně počet dní v předešlých uběhlých měsících
   DenVRoce rozlišuje přestupný rok
*/
public class DenVRoce {
    public static int DenVMesici(int mesic, int rok) {
        int dny = 0;
        if (mesic == 0) { return dny; }
        if ((mesic == 2) && (rok % 4 == 0)) {
            dny += 28; 
        }

        else if (mesic == 2) {
            dny += 29; 
        }

        else if ((mesic == 1)  || (mesic == 3)  ||
                (mesic == 5)  ||
                (mesic == 7)  ||
                (mesic == 8)  ||
                (mesic == 10) ||
                (mesic == 12))
        {
            dny += 31;
        }

        else {dny += 30;}

        return (dny + DenVMesici(mesic - 1, rok));

    }

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
                DenVMesici((datum.get(1) - 1), datum.get(0))
                + datum.get(2)
                // Součet počtu dní v uběhlých měsících a počtu uběhlých dní
                //      aktuálního měsíce.
            )
        );
    }
}