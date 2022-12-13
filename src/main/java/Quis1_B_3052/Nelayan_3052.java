package Quis1_B_3052;

public class Nelayan_3052 extends Penduduk_3052 {

    int jmlBeratIkan_3052;
    int jmlSolar_3052;

    double totalPendapatanNelayan() {
        System.out.println("Total Pendapatan : " + ((jmlBeratIkan_3052 * 8000) - (jmlSolar_3052 * 10000)));
        return 0;
    }

    public void tampilDataNelayan() {
        System.out.println("Jumlah Berat Ikan " + jmlBeratIkan_3052);
        System.out.println("Jumlah Pakai Solar " + jmlSolar_3052);
    }
}
