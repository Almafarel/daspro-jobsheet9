import java.util.Scanner;
public class ModifikasiArrayRata {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilai = new int [10];
        int totalNilaiLulus = 0;
        int totalNilaiTidakLulus = 0;
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();

            if (nilai[i] > 70) {
                totalNilaiLulus += nilai[i];
                jumlahLulus++;
            } else {
                totalNilaiTidakLulus += nilai[i];
                jumlahTidakLulus++;
            }
        }

        double rataRataLulus = jumlahLulus > 0 ? (double) totalNilaiLulus / jumlahLulus : 0;
        double rataRataTidakLulus = jumlahTidakLulus > 0 ? (double) totalNilaiTidakLulus / jumlahTidakLulus : 0;

        System.out.println("Rata-rata nilai lulus = " + rataRataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataRataTidakLulus);
    }
}

    

