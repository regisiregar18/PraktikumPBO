
package com.regi.pratikumpbo.pertemuan5;

public class Array2 {
    public static void main(String[] args) {
    //pembuatan array
    
    String[] names = {"rain","thunder","storm"};
    
    //cek panjang array
    System.out.println("panjang array" + names.length);
            
    //menampilkan semua nilai array
    for(int i=0; i<names.length; i++){
            System.out.println(i + ":" + names[i]);
    }
    }}
