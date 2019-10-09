
import java.util.Scanner;

/**
 *
 * @author Vendetta 
 * NAMA              : Rizki Aria Putra 
 * KELAS             : PBO1 
 * NIM               : 10118031
 * Deskripsi Program : Program ini berisi program untuk membandingankan 2 buah nilai
 */

public class PerbandinganDuaBuahNilai {

    public static void main(String[] args) {
        System.out.println("========Program Perbandingan Nilai  ========");
        Scanner scanner = new Scanner(System.in);
        String ulangi = "Ya";
        while (ulangi.equals("Ya")) {
            System.out.print("Masukkan nilai pertama : ");
            int[] nilai = new int[2];
            nilai[0] = scanner.nextInt();
            System.out.print("Masukkan nilai kedua : ");
            nilai[1] = scanner.nextInt();
            System.out.println("Hasil : " + nilai[0] + ((nilai[0] < nilai[1]) ? " Lebih Kecil " : ((nilai[0] == nilai[1]) ? " Sama Dengan " : " Lebih Besar ")) + nilai[1]);
            System.out.print("Ulangi Aktifitas ? (Ya/Tidak) : ");
            ulangi = scanner.next();
        }
    }

}
