public class MataKuliah{
    String kodeMK;
    String namaMK;
    int sks;
    
    MataKuliah(String kodeMK, String namaMK, int sks){
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
    }

    void tampilMataKuliah(){
        System.out.println("Kode MK: "+kodeMK + " | Nama: "+ namaMK+ " | SKS: " + sks);

    }

    static void searchingMK(MataKuliah[] mk0708, String cari){
        int posisi = -1;
        for(int i = 0; i < mk0708.length; i++){
            if(mk0708[i].kodeMK.equalsIgnoreCase(cari)){
                posisi = i;
                break;
            }
        }
        if(posisi != -1){
            System.out.println("\nKode Mata Kuliah yang dicari: " + cari);
            System.out.println("Mata Kuliah Ditemukan: " + "Kode MK: " + mk0708[posisi].kodeMK  + " | Nama: "+  mk0708[posisi].namaMK + " | SKS: " + mk0708[posisi].sks);
        } else{
            System.out.println("Masukkan kode Mata Kuliah yang valid!");
        }
    }
}

