public class delitele {
  public static void main(String[] args) {
    int delenec = Integer.parseInt(args[0]);
    for (int i = 1; i < delenec; i++) {
      if (delenec % i == 0) {
        System.out.printf("%d\t", i);
      }
    }
  }
}
