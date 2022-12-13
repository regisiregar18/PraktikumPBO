package com.regi.pratikumpbo.pertemuan4.tugas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("===Pegawai===");
        System.out.println("  1. Programmer  ");
        System.out.println("  2. Manager     ");
        System.out.println("  3. Developer   ");
        System.out.println("  4. Exit        ");
        System.out.println("Masukkan Pilihan : ");
        int pilihan = input.nextInt();
        System.out.println();
        
        //pembuatan objek
        Programmer pr = new Programmer();
        Pegawai pg = new Pegawai();
        Manager mn = new Manager();
        
        //mengisi nilai attribute
        pr.nama = "Programmer";
        pr.noPegawai = 0;
        pr.gaji = 50000000;
        pr.jobDesk = "Membuat program ataupun mengembangkan sistem";
        
        pg.nama = "Developer";
        pg.noPegawai = 3;
        pg.gaji = 60000000;
        
        mn.nama = "Manager";
        mn.noPegawai = 6;
        mn.gaji = 90000000;
        mn.jobDesk = "Memanajemen Perusahaan";
    
    
    //pemanggilan method
    switch(pilihan){
        case 1:
            pr.disclaimer();
            pr.showInfo();
            pr.Fact();
            pr.extraInfo();
            break;
            
        case 2:
            pg.disclaimer();
            pg.showInfo();
            break;
            
        case 3:
            mn.disclaimer();
            mn.showInfo();
            mn.Fact();
            mn.extraInfo();
            break;
            
        case 4:
            System.out.println("Silahkan Keluar");
            break;
        }
    }
}
