import java.util.*;
public class ModifikasiSearchNilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrNilai [] = {80, 85, 78, 96, 90, 82, 86};
        int inputNilai [] = new int[5];
        int key = 78;
        int hasil = 0;
        System.out.println("Banyak nilai yang akan diinput = 5");
        System.out.println("Nilai yang dicari 78");
        for (int i = 0; i < inputNilai.length; i++) {
            System.out.println("Masukkan nilai ke-" + i + " : ");
            inputNilai[i] = sc.nextInt();
        }

        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i;
                break;
            }

        }
        System.out.println();
        System.out.println(" Nilai yang dicari tidak ditemukan ");
        System.out.println();
    }
}
