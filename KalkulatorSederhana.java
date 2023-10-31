import java.util.Scanner;

public class KalkulatorSederhana {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di kalkulator sederhana!");
        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();

        System.out.println("Pilih operasi matematika: ");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.print("Masukkan pilihan (1/2/3/4): ");
        int pilihan = scanner.nextInt();

        double hasil;

        switch (pilihan) {
            case 1:
                hasil = angka1 + angka2;
                break;
            case 2:
                hasil = angka1 - angka2;
                break;
            case 3:
                hasil = angka1 * angka2;
                break;
            case 4:
                if (angka2 == 0) {
                    System.out.println("Tidak dapat melakukan pembagian dengan angka nol.");
                    return;
                } else {
                    hasil = angka1 / angka2;
                }
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                return;
        }

        System.out.println("Hasil: " + hasil);

        scanner.close();
    }
}
