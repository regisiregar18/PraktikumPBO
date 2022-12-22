package com.regi.pratikumpbo.pertemuan5;

public class Array1 {
    public static void main(String[] args) {
        String[] names = new String[5];
        
        //cek panjang array
        System.out.println("Panjang array : " + names.length);
        
        //memasukan nilai array
        names[0] = "rain";
        names[1] = "thunder";
        names[2] = "storm";
        
        //menampilakan semua array
        for(int i=0; i<names.length; i++){
            
            System.out.println(i+":" + names[i]);
        }    
    }
    
}
