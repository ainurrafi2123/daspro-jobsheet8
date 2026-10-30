import java.util.Scanner;

public class Triangle17 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan nilai n = ");
    int n = sc.nextInt();
    int i = n;
    while (i > 0) {
      int j = 1;
      while (j <= i) {
        System.out.print("*");
        j++;
      }
      System.out.println();
      i--;
    }
    sc.close();
  }
}