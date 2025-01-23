import java.util.Scanner;

public class BangunRuangApps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih opsi perhitungan:");
        System.out.println("a. Luas Permukaan Balok");
        System.out.println("b. Volume Balok");
        System.out.println("c. Luas Permukaan Bola");
        System.out.println("d. Volume Bola");
        System.out.print("Masukkan pilihan (a/b/c/d): ");
        char pilihan = scanner.next().charAt(0);

        switch (pilihan) {
            case 'a':
                System.out.println("Masukkan panjang balok:");
                int panjangA = scanner.nextInt();
                System.out.println("Masukkan lebar balok:");
                int lebarA = scanner.nextInt();
                System.out.println("Masukkan tinggi balok:");
                int tinggiA = scanner.nextInt();

                BangunRuang balokA = new Balok(panjangA, lebarA, tinggiA);
                System.out.println("Luas Permukaan Balok: " + balokA.hitungLuas());
                break;

            case 'b':
                System.out.println("Masukkan panjang balok:");
                int panjangB = scanner.nextInt();
                System.out.println("Masukkan lebar balok:");
                int lebarB = scanner.nextInt();
                System.out.println("Masukkan tinggi balok:");
                int tinggiB = scanner.nextInt();

                BangunRuang balokB = new Balok(panjangB, lebarB, tinggiB);
                System.out.println("Volume Balok: " + balokB.hitungVolume());
                break;

            case 'c':
                System.out.println("Masukkan diameter bola:");
                int diameterC = scanner.nextInt();

                BangunRuang bolaC = new Bola(diameterC);
                System.out.println("Luas Permukaan Bola: " + bolaC.hitungLuas());
                break;

            case 'd':
                System.out.println("Masukkan diameter bola:");
                int diameterD = scanner.nextInt();

                BangunRuang bolaD = new Bola(diameterD);
                System.out.println("Volume Bola: " + bolaD.hitungVolume());
                break;

            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }

        scanner.close();
    }
}
