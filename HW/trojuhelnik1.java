public class trojuhelnik1 {

  public static void main(String[] args) {
    int height = 5;
    for (int i = 1; i <= height; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.printf("X");
      }
      System.out.println("");
    }
  }
}
