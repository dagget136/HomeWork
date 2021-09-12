public class lesson2 {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 5; j++) {
        System.out.println("* ");
      }
      System.out.println();
    }
    sw(args);
}
  static void sw(String[] args) {
    int a = 2;
    switch (a) {
      case 1:
        System.out.println("a = 1");
        break;
      case 2:
        System.out.println("a = 2");
        break;
      case 3:
        System.out.println("a = 3");
        break;
    }
  }
}
