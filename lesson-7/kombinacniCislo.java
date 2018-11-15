public class kombinacniCislo {
    public static void main(String[] args) {
        System.out.printf("Vypocet kombinaciho cisla\n\n");
        System.out.printf("Zadejte velikost mnoziny n: ");
        int n = Integer.parseInt(args[0]);¨
        System.out.printf("\nZadejte pozadovanou velikost vyberu k: ");
        int k = Integer.parseInt(args[1]);
        
        int result = 0;
        result = (faktorial(n) / (faktorial(k) // Yet to be done
    }
    
    public static int faktorial(int num) {
        if (num == 0) {
            return 0;
        }
        else {
            return (num * faktorial(num - 1))
        } 
}