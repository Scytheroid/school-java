public class mocniny {

  public static void main(String[] args) {
    int max = Integer.parseInt(args[0]);
    for (int i = 0; i*i < max; i++) {
      System.out.printf("%d ", i*i);
    }
  }
}
