package com.regi.pratikumpbo.pertemuan4.tugas;

public class Manager extends Pegawai {
    //Attribute
    String jobDesk;
    
    //method
    public void Fact(){
        System.out.println("Pekerjaan ini dinamakan " + nama + " Gaji dari pekerjaan ini lumayan besar untuk kalangan anak muda");
    }
    
    //penambahan method
    public void extraInfo(){
        System.out.println("Untuk menjadi Manager anda harus bisa " + jobDesk + " dan juga harus lulusan S1 Manajemen " );
    }
}
