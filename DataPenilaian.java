public class DataPenilaian {
    void tampilNilai(Penilaian[] nilai, Mahasiswa[] mahasiswa, MataKuliah[] matakuliah){
        for (int i = 0; i < nilai.length; i++) {
            System.out.println(mahasiswa[i].nama + " | " + matakuliah[i].namaMK + " | Nilai Akhir : " + nilai[i].nilaiAkhir);
        }
    }

    static void sortByNilaiAkhirSS(Penilaian[] penilaian){
        for (int i = 0; i < penilaian.length - 1; i++){
            Penilaian kiri = penilaian[i];
            for (int j = i + 1; j < penilaian.length; j++){
                Penilaian kanan = penilaian[j];
                if (kiri.nilaiAkhir < kanan.nilaiAkhir){
                    kiri = penilaian[j];
                    kanan = penilaian[i];
                }
                penilaian[i] = kiri;
                penilaian[j] = kanan;
            }
        }
    }

    static void sortByNilaiAkhirIS(Penilaian[] penilaian) {
        for (int i = 1; i < penilaian.length; i++) {
            Penilaian current = penilaian[i];
            int j = i - 1;
    
            while (j >= 0 && penilaian[j].nilaiAkhir > current.nilaiAkhir) {
                penilaian[j + 1] = penilaian[j];
                j--;
            }
    
            penilaian[j + 1] = current; 
        }
    }
    
}
