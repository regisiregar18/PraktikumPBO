package com.regi.pratikumpbo.tugas3;

public class main {
    public static void main(String[] args) {
        //Memanggil class regi
        Regi saya = new Regi ("Regi", 160, 60, 19);
        Regi dia = new Regi ("Bintera", 170, 58, 20);
        
        //menjalankan method
        saya.biodataSaya();
        dia.biodataSaya();
        
        //menjalankan getter & setter dari class regi
        System.out.println("Tinggi badan saya(sebelum diet) : " + dia.getBerat());
        dia.setBerat(40);
        System.out.println("Tinggi badan saya (setelah diet) : " + dia.getBerat());
        System.out.println("\n");
        
        //menghitung masa tubuh
        double massa = dia.getBerat() / ((dia.getTinggi() * 0.01)*(dia.getTinggi()*0.01));
        System.out.println("Massa tubuh saya adalah" + massa);
        System.out.println("\n");
        
        //inheritance = menghubungkan 2 objek atau lebih
        mamalia hewan = new mamalia(); // memanggil class test
        System.out.println("Apakah hewan adalah objek -> " + (hewan instanceof Object));
        System.out.println("Apakah hewan adalah hewan -> " + (hewan instanceof mamalia));
        System.out.println("Apakah hewan adalah Kelinci -> " + (hewan instanceof singa));
        System.out.println("------------------------------"); //spasi
        
        singa singa = new singa(); //memanggil class singa
        System.out.println("Apakah hewan adalah objek -> " + (singa instanceof Object));
        System.out.println("Apakah Singa adalah Hewan -> " + (singa instanceof mamalia));
        System.out.println("Apakah Singa adalah singa -> " + (singa instanceof singa));
    }
}
