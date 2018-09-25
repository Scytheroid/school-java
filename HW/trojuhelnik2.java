public class trojuhelnik2 {
  public static void main(String[] args) {
    int height = 5;
    height -= 1;
    for (int h = 0; h <= height; h++) {
      for (int i = height - h; i > 0; i--) {System.out.printf(" ");}
      for (int j = 0; j <= h; j++) {System.out.printf("X");}
      System.out.println("");
    }
  }
}
