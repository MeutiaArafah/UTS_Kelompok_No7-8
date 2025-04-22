public class Penilaian {
    Mahasiswa mahasiswa;
    MataKuliah matakuliah;
    double nilaiTugas;
    double nilaiUTS;
    double nilaiUAS;
    double nilaiKuis;
    double nilaiAkhir;

    Penilaian(Mahasiswa mahasiswa, MataKuliah matakuliah, double nilaiTugas, double nilaiUTS, double nilaiUAS, double nilaiKuis){
        this.mahasiswa = mahasiswa;
        this.matakuliah = matakuliah;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
        this.nilaiKuis = nilaiKuis;
        hitungNilaiAkhir();
    }

        void hitungNilaiAkhir(){
        nilaiAkhir = (nilaiTugas*20/100) + (nilaiUTS*30/100) + (nilaiUAS*30/100) + (nilaiKuis*20/100);
    }
}