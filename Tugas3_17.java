import java.util.Scanner;

public class Tugas3_17 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int jumlahToko;
    do {
      System.out.print("Masukkan jumlah toko: ");
      jumlahToko = sc.nextInt();
    } while (jumlahToko < 1);

    int totalSemuaBarang = 0;
    int barangTerbanyak = -1;   
    int tokoTerbanyak = 0;

    for (int t = 1; t <= jumlahToko; t++) {

      int jumlahPelanggan;
      do {
        System.out.print("Toko " + t + " - jumlah pelanggan: ");
        jumlahPelanggan = sc.nextInt();
      } while (jumlahPelanggan < 0);

      int totalBarangToko = 0;   

      for (int p = 1; p <= jumlahPelanggan; p++) {
        int barang;
        do {
          System.out.print("  Barang pelanggan " + p + ": ");
          barang = sc.nextInt();
        } while (barang < 0);

        totalBarangToko += barang;
      }

      System.out.println("Toko " + t + " - pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarangToko);

      totalSemuaBarang += totalBarangToko;

      if (totalBarangToko > barangTerbanyak) {
        barangTerbanyak = totalBarangToko;
        tokoTerbanyak = t;
      }
    }

    System.out.println("Total barang seluruh toko: " + totalSemuaBarang);
    System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);

    sc.close();
  }
}