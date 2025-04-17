import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kelompok0708 = new Scanner(System.in);
        int pilihMenu;

        do {
            System.out.println("\n=== MENU SISTEM AKADEMIK ===");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Tampilkan Daftar Penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihMenu = kelompok0708.nextInt();
            kelompok0708.nextLine();

            switch (pilihMenu) {
                case 0:

                    break;
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;

                default:
                System.out.println("Pilihan tidak valid!");
            }

        } while (pilihMenu != 0);

        Mahasiswa[] mhs = new Mahasiswa[4];
    }
}