package Quis1_B_3052;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Nelayan_3052 nl = new Nelayan_3052();
        Penduduk_3052 pd = new Penduduk_3052();
        Dokter_3052 dk = new Dokter_3052();
        
        nl.nik_3052 = "Sumatera Utara";
        nl.nama_3052 = "Regi";
        nl.umur_3052 = 40;
        nl.alamat_3052 = "Medan";
        nl.jmlBeratIkan_3052 = 50;
        nl.jmlSolar_3052 = 9;
        
        nl.nik_3052 = "Sumatera Utara";
        nl.nama_3052 = "Samsul";
        nl.umur_3052 = 40;
        nl.alamat_3052 = "Purwokerto";
        nl.jmlBeratIkan_3052 = 7;
        nl.jmlSolar_3052 = 7;
        
        nl.tampilDataPenduduk();
        nl.tampilDataNelayan();
        nl.totalPendapatanNelayan();
        
        dk.tampilDataPenduduk();
        dk.tampilDataDokter();
        dk.totalPendapatanDokter();
    }
}
