package Quis1_B_3052;

public class Dokter_3052 extends Penduduk_3052 {
    int jmlPasien_3052;
    int jmlObat_3052;
    
    double totalPendapatanDokter(){
        System.out.println("Total Pendatapatan : " + ((jmlPasien_3052*50000) + (jmlObat_3052*10000)));
        return 0;
    }
    
    public void tampilDataDokter(){
        System.out.println("===DATA DOKTER===");
        System.out.println("Jumlah Berat Ikan " + jmlPasien_3052);
        System.out.println("Jumlah Pakai Solar " + jmlObat_3052);
    }
}
