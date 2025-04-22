import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kelompok0708 = new Scanner(System.in);
        int pilihMenu;

        Mahasiswa[] mhs0708 = {
                new Mahasiswa("22001", "Ali Rahman", "Informatika"),
                new Mahasiswa("22002", "Budi Santoso", "Informatika"),
                new Mahasiswa("22003", "Citra Dewi", "Sistem Informasi Bisnis"),
        };

        MataKuliah[] mk0708 = {
                new MataKuliah("MK001", "Struktur Data", 3),
                new MataKuliah("MK002", "Basis Data", 3),
                new MataKuliah("MK003", "Desain Web", 3),
        };

        Penilaian[] penilaian0708 = {
                new Penilaian(mhs0708[0], mk0708[0], 80, 85, 90, 76),
                new Penilaian(mhs0708[0], mk0708[1], 60, 75, 70, 60),
                new Penilaian(mhs0708[1], mk0708[0], 75, 70, 80, 100),
                new Penilaian(mhs0708[2], mk0708[1], 85, 90, 95, 97),
                new Penilaian(mhs0708[2], mk0708[2], 80, 90, 65, 86),
        };

        do {
            System.out.println("\n=== MENU SISTEM AKADEMIK ===");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Tampilkan Daftar Penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir (DESC)");
            System.out.println("5. Urutkan Mahasiswa Berdasarkan Nilai Akhir (ASC)");
            System.out.println("6. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("7. Cari Mahasiswa Berdasarkan Kode Matkul");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihMenu = kelompok0708.nextInt();
            kelompok0708.nextLine();

            switch (pilihMenu) {
                case 0:
                    break;
                case 1:
                    for (Mahasiswa mhs : mhs0708) {
                        mhs.tampilMahasiswa();
                    }
                    break;
                case 2:
                    for (MataKuliah mk : mk0708) {
                        mk.tampilMataKuliah();
                    }
                    break;
                case 3:
                    System.out.println("\nData Penilaian: ");
                    for (Penilaian p : penilaian0708) {
                        System.out.println(p.mahasiswa.nama + " | " +
                                p.matakuliah.namaMK + " | " +
                                "Nilai Akhir: " + p.nilaiAkhir);
                    }
                    break;
                case 4:
                    DataPenilaian.sortByNilaiAkhirSS(penilaian0708);
                    System.out.println("\nData Penilaian Setelah Sorting (DESC): ");
                    for (Penilaian p : penilaian0708) {
                        System.out.println(p.mahasiswa.nama + " | " +
                                p.matakuliah.namaMK + " | " +
                                "Nilai Akhir: " + p.nilaiAkhir);
                    }
                    break;
                case 5:
                    DataPenilaian.sortByNilaiAkhirIS(penilaian0708);
                    System.out.println("\nData Penilaian Setelah Sorting (ASC): ");
                    for (Penilaian p : penilaian0708) {
                        System.out.println(p.mahasiswa.nama + " | " +
                                p.matakuliah.namaMK + " | " +
                                "Nilai Akhir: " + p.nilaiAkhir);
                    }
                    break;
                case 6:
                    System.out.print("Masukkan NIM mahasiswa yang dicari: ");
                    String cari = kelompok0708.nextLine();
                    DataMahasiswa.searchingNIM(mhs0708, cari);
                    break;
                case 7:
                    System.out.print("Masukkan Kode Matakuliah yang dicari: ");
                    cari = kelompok0708.nextLine();
                    MataKuliah.searchingMK(mk0708, cari);
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihMenu != 0);

    }
}