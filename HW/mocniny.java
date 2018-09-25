public class mocniny {

  public static void main(String[] args) {
    int max = Integer.parseInt(args[0]);
    for (int i = 0; i < max; i++) {
      if (i*i < max) {
        System.out.printf("%d ", i*i);
      }
      else {
        System.out.println("");
        break;
      }
    }
  }
}
