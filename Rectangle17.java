import java.util.Scanner;

public class Rectangle17 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Masukkan Berapa Baris: ");
    int baris = scanner.nextInt();
    System.out.print("Masukkan Berapa Kolom: ");
    int kolom = scanner.nextInt();

    for (int i = 1; i <= baris; i++) {
      for (int j = 1; j <= kolom; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    scanner.close();  
  }
}