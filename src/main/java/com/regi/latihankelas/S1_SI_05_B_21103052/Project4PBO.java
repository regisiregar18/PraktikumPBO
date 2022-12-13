package com.regi.latihankelas.S1_SI_05_B_21103052;

import java.util.Scanner;

public class Project4PBO {

    public static void main(String[] args) {
        
        int[] listBilangan = {0, 0, 0, 0, 0, 0};
        int x;
        Scanner input = new Scanner(System.in);
        for(x = 0; x < listBilangan.length; ++x)
        {
            try
            {
                System.out.println("Masukkan Bilangan >> ");
                listBilangan[x] = input.nextInt();
            }
            catch (Exception e)
            {
                System.out.println("Exception Muncul");
            }
        }
        System.out.println("Bilangan : ");
        for(x = 0; x < listBilangan.length; ++x)
        {
            System.out.println(listBilangan[x] + "");
            System.out.println();
        }
    }
}