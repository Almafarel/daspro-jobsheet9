import java.util.Scanner;
public class ArrayNilai02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] nilaiAkhir = new int[10];
        double total = 0;
        double rata2;

        for (int i = 0; i < nilaiAkhir.length; i++) {
           System.out.println("Masukkan nilai ke-" + i + " : ");
            nilaiAkhir[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-" + i + " lulus! ");
                 
      }

    }
}
}
