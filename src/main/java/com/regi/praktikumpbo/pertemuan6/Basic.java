package com.regi.pratikumpbo.pertemuan6;

public class Basic {
    public static void main(String[] args) {
        // Membuat array isi 3
        int[] myNumbers = { 1, 2, 3 };
        
        //Uji coba print nilai array index ke-10
        try {
        System.out.println(myNumbers[10]);
        }
        
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array tidak sebesar itu !");
        }
        System.out.println("Proses Selesai !");
    }
}
