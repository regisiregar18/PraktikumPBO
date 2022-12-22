
package com.regi.pratikumpbo.pertemuan5;

import java.util.Scanner;

public class DyanamicArray {
     public static void main(String[] args) {
         
         //deklarasi scanner untuk input
         Scanner input = new Scanner(System.in);
        
         //membuat agar panjang array ditentukan input user
         
         System.out.println("--Program Input Nilai--");
         System.out.println("Masukan Jumlah Matkul :");
         int jml = input.nextInt();
         System.out.println();
         
         //membuat array baru dengan panjang sesuai input user
         int[] nilai = new int [jml];
         
         //memasukan nilai ke array
         for(int i=0; i<jml; i++){
             System.out.println("Masukan nilai ke-" + (i+1) + ":");
             nilai[i] = input.nextInt();
         }
         
         System.out.println();
         
         System.out.println("== Daftar Nilai ==");
        for (int i = 0; i < jml; i++) {
            System.out.println(i + " : " + nilai[i]);
     }
}
}
