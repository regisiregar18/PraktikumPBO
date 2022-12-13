package com.regi.pratikumpbo.pertemuan4.tugas;

public class Pegawai {
    //Attribute
    String nama;
    int noPegawai;
    int gaji;
    
    //Method
    public void disclaimer(){
        System.out.println("Perkenalkan perusahaan kami memiliki pegawai yang bernomor " + noPegawai );
    }
    
    public void showInfo(){
        System.out.println("Yang bernama " + nama + " Dan memiliki gaji " + gaji );
        extraInfo();
    }
    
    // penambahan method
    public void extraInfo(){}
}
