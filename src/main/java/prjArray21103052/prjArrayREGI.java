package prjArray21103052;

import java.util.Scanner;

public class prjArrayREGI {
    public static void main(String[] args) {
    int n, jml = 0;
    Scanner inputan = new Scanner (System.in);
        System.out.println("Masukkan jumlah elemen array:  ");
        n = inputan.nextInt();
        int bil[] = new int[n];
        System.out.println("Masukkan elemen array: ");
        for(int i = 0; i < n; i++)
        {
            bil[i] = inputan.nextInt();
            jml = jml + bil[i];
        }
        System.out.println("Jumlah :"+jml);
    }
    
}
