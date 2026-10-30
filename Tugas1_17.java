import java.util.Scanner;

public class Tugas1_17 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int totalAngka = 0;
    System.out.print("Masukkan nilai n = ");
    int n = sc.nextInt();
    int i = 1;
    while (i <= n) {
      int j = 1;
      while (j <= i) {

        System.out.print(j + " ");
        totalAngka++;
        j++;
      }
      System.out.println();

      i++;
    }
    System.out.println("Total angka tercetak: " + totalAngka);
    sc.close();
  }
}