import java.util.Scanner;

public class Main {
    static Penilaian[] nilai;

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
                System.out.println("\nData Penilaian: ");
                for (Penilaian p : nilai) {
                    
                }

                    break;
                case 4:

                    break;
                case 5:

                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihMenu != 0);


        Mahasiswa[] mhs0708 = {
                new Mahasiswa("22001", "Ali Rahman", "Informatika"),
                new Mahasiswa("22002", "Budi Santoso", "Informatika"),
                new Mahasiswa("22003", "Citra Dewi", "Sistem Informasi Bisnis"),
        };

        // array matakuliah
        MataKuliah[] mk0708 = {
                new MataKuliah("MK001", "Struktur Data", 3),
                new MataKuliah("MK002", "Basis Data", 3),
                new MataKuliah("MK003", "Basis Data", 3),
        };

        Penilaian[] penilaian0708 = {
            new Penilaian([0][0].hitungNilaiAkhir),

        };
        // array data penilaian

    }
}