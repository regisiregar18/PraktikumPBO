package com.regi.praktikumpbo.pertemuan6.tugas;

public class Exception2 {
    public static void main(String[] args) {
        String str = "Regi Siregar";
        for(int i=0; i<str.length(); i++){
            System.out.println(str.charAt(i));
        }
        System.out.println();
        System.out.println("Panjang String : " + str.length());
        
        try{
        //Mengakses Elemen Lebih Besar dari Panjang String
        System.out.println(str.charAt(30));
        }catch(StringIndexOutOfBoundsException e){
        System.out.println("Sudah Terjadi Exception");
        }
    }
}
