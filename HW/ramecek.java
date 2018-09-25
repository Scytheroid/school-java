public class ramecek {
  public static void main(String[] args) {
    int height = 3, width = 20;
    for (int i = 0; i < (height + 4); i++) {
      for (int j = 0; j < (width + 4); j++) {
        if ((i <= 1) || (i >= height + 2) || (j <= 1) || (j >= width + 2)) { System.out.printf("X"); } //This if statement creates flexible margin
        else { System.out.printf(" "); }
        //System.out.printf(" Toto jsou indexy: %d : %d\n", i, j);
      }
      System.out.printf("\n");
    }
  }
}
