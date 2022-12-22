package com.regi.pratikumpbo.pertemuan6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        try {
            System.out.println("Masukkan Bilangan : ");
            int bilangan = input.nextInt();
            
            System.out.println("Masukkan Pembagi : ");
            int pembagi = input.nextInt();
            
            int hasil = bilangan/pembagi;
            
            System.out.println("Hasil Pembagian (dibulatkan) : " + hasil);
        }
        
        catch (ArithmeticException e) {
            System.out.println("Bilangan Tidak bisa dibagi 0 !");
        }
        
        catch (InputMismatchException e){
            System.out.println("Harap Masukkan angka saja!");
        }
    }
}
