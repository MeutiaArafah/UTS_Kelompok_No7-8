import java.util.Scanner;

public class DataMahasiswa {
    Scanner kelompok0708 = new Scanner(System.in);
    String cari = kelompok0708.nextLine();

    static void searchingNIM(Mahasiswa[] mhs0708, String cari){
        int posisi = -1;
        for(int i = 0; i < mhs0708.length; i++){
            if(mhs0708[i].NIM.equals(cari)){
                posisi = i;
                break;
            }
        }
        if(posisi != -1){
            System.out.println("\nMahasiswa NIM mahasiswa yang dicari: " + cari);
            System.out.println("Mahasiswa Ditemukan: " +  mhs0708[posisi].NIM + " | " + mhs0708[posisi].nama + " | " + mhs0708[posisi].prodi);
        } else{
            System.out.println("Masukkan NIM yang valid!");
        }
    }
}
