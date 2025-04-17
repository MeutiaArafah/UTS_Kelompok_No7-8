public class DataPenilaian {
    static Penilaian[] penilaian;

    void tampilNilai(Penilaian[] nilai, Mahasiswa[] mahasiswa, MataKuliah[] matakuliah){
        for (int i = 0; i < nilai.length; i++) {
            System.out.println(mahasiswa[i].nama + " | " + matakuliah[i].namaMK + " | Nilai Akhir : " + nilai[i].nilaiAkhir);
        }
    }

    static void sortByNilaiAkhirSS(){
        for (int i = 0; i < penilaian.length; i++){
            Penilaian kiri = penilaian[i];
            for (int j = i + 1; j < penilaian.length; j++){
                Penilaian kanan = penilaian[j];
                if (kiri.nilaiAkhir > kanan.nilaiAkhir){
                    penilaian[j - 1] = kanan;
                    penilaian[j] = kiri;
                }
            }
        }
    }
}
