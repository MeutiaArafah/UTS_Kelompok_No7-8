public class Penilaian {
    Mahasiswa mahasiswa;
    Matakuliah matakuliah;
    double nilaiTugas;
    double nilaiUTS;
    double nilaiUAS;
    double nilaiAkhir;

    Penilaian(Mahasiswa mahasiswa, Matakuliah matakuliah, double nilaiTugas, double nilaiUTS, double nilaiUAS){
        this.mahasiswa = mahasiswa;
        this.matakuliah = matakuliah;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
        hitungNilaiAkhir();
    }

        void hitungNilaiAkhir(){
        nilaiAkhir = (nilaiTugas*30/100) + (nilaiUTS*30/100) + (nilaiUAS*40/100);
    }
}