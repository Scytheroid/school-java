public class DenVRoce {
    public static void main(String[] args) {
        awh.IntList datum = awh.IntList.create();

        java.util.Scanner sc = new java.util.Scanner(System.in);
        while(sc.hasNextInt()) {
            datum.add(sc.nextInt());
        }
        datum.reverse();
        System.out.printf("%d", datum.get(0));
    }
}