import java.util.Scanner;

public class Tugas2_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;

        while (true) {
            System.out.print("Masukkan nilai n = ");
            n = input.nextInt();
            if (n >= 3) {
                break;
            } else {
                System.out.println("Nilai n minimal 3");
            }
        }

        int jumlahTotal = 0;

        for (int i = 1; i <= n; i++) { 
            for (int j = 1; j <= n; j++) { 
                int hasilPerkalian = i * j;
                
                System.out.printf("%4d", hasilPerkalian);
                
                jumlahTotal += hasilPerkalian;
            }
            System.out.println();
        }

        System.out.println("Jumlah seluruh angka: " + jumlahTotal);
        
        input.close();
    }
}

