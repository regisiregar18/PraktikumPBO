package com.regi.praktikumpbo.pertemuan6.tugas;

import java.util.*;

public class Exception1 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Angka : ");
        String strInput = input.nextLine();
        int intInput = 5;
        try{
        intInput = Integer.parseInt(strInput);
        System.out.println(strInput);
        System.out.println("Yeah Berhasil");
        }catch(NumberFormatException e){
            System.out.println("Tidak bisa diproses karna bukan angka");
        }
    }
}
