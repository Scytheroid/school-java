public class nasobky {
  public static void main(String[] args) {
    for (int i = 3; i <= 30; i += 3) {
      System.out.printf("%d\t", i);
      if (i % 12 == 0) {
        System.out.println("");
      }
    }
    System.out.println("");
  }
}
