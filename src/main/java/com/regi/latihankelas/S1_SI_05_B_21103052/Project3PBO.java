package com.regi.latihankelas.S1_SI_05_B_21103052;

import java.util.Scanner;

public class Project3PBO {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pembilang, penyebut, hasil;
        System.out.print("Masukkan pembilang >> ");
        pembilang = input.nextInt();
        System.out.print("Masukkan penyebut >> ");
        penyebut = input.nextInt();
        try
        {
            hasil = pembilang / penyebut;
            System.out.println(pembilang + " / " + penyebut + " = " + hasil);
        }
        catch(ArithmeticException mistake)
        {
            System.out.println("Error perhitungan aritmatika sudah ditangani");
        }
        System.out.println("Program selesai");
    }
}