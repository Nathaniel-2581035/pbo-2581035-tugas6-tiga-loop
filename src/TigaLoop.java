import java.util.Scanner;

public class TigaLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Batas deret (n) : ");
        int n = input.nextInt();
        System.out.println();

        System.out.println("===== SATU DERET, TIGA LOOP =====");

        //loop for
        System.out.print("for      : ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        //loop while
        System.out.print("while    : ");
        int j = 1;
        while (j <= n) {
            System.out.print(j + " ");
            j++;
        }
        System.out.println();

        //loop do-while
        System.out.print("do-while : ");
        int k = 1;
        do {
            System.out.print(k + " ");
            k++;
        } while (k <= n);
        System.out.println();

        System.out.println();

        // bukti off-by-one
        int kurang = 0;
        for (int i = 1; i < n; i++) {
            kurang++;
        }

        int kurangSama = 0;
        for (int i = 1; i <= n; i++) {
            kurangSama++;
        }

        System.out.println("i <  n berputar : " + kurang + " kali");
        System.out.println("i <= n berputar : " + kurangSama + " kali");

        // saringan continue dan break
        int hitung = 0;
        System.out.print("Disaring : ");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            if (i > 7) {
                break;
            }
            System.out.print(i + " ");
            hitung++;
        }
        System.out.println();
        System.out.println("Sampai println  : " + hitung + " kali");
    }
    /*
     * ===== OUTPUT RUN 1 (n = 5) =====
     * Batas deret (n) : 5
     *
     * ===== SATU DERET, TIGA LOOP =====
     * for      : 1 2 3 4 5
     * while    : 1 2 3 4 5
     * do-while : 1 2 3 4 5
     *
     * i <  n berputar : 4 kali
     * i <= n berputar : 5 kali
     * Disaring : 1 3 5 7
     * Sampai println  : 4 kali
     *
     * ===== OUTPUT RUN 2 (n = 0) =====
     * Batas deret (n) : 0
     *
     * ===== SATU DERET, TIGA LOOP =====
     * for      :
     * while    :
     * do-while : 1
     *
     * i <  n berputar : 0 kali
     * i <= n berputar : 0 kali
     * Disaring : 1 3 5 7
     * Sampai println  : 4 kali
     *
     * ===== KENAPA for DAN while KOSONG =====
     * Kondisi (1 <= 0) dicek dulu sebelum badan loop jalan, dan hasilnya
     * salah, jadi badannya tidak pernah dijalankan. do-while menjalankan
     * badannya dulu, jadi 1 tetap tercetak.
     *
     * ===== KESIMPULAN =====
     * do-while mengecek kondisinya sesudah badan loop dijalankan, jadi
     * badannya pasti jalan minimal sekali.
     *
     * ===== KENAPA LOOP TIDAK BERHENTI DI i = 8 =====
     * Saat i = 8 (genap), continue jalan lebih dulu dan langsung lompat
     * ke iterasi berikutnya, jadi "if (i > 7) break;" tidak sempat dicek.
     * Break baru kena saat i = 9.
     */
}
