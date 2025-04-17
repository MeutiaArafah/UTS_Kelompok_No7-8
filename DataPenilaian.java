public class DataPenilaian {
    Penilaian[] penilaian;

    void tampilNilai(Penilaian[] nilai, Mahasiswa[] mahasiswa, Matakuliah[] matakuliah){
        for (int i = 0; i < nilai.length; i++) {
            System.out.println(mahasiswa[i].nama + " | " + matakuliah[i].namaMK + " | Nilai Akhir : " + nilai[i].nilaiAkhir);
        }
    }

    void sortByNilaiAkhirSS(){
        for (int i = 0; i < penilaian.length; i++){
            double temp = penilaian[i].nilaiAkhir;
            
        }
    }
}
