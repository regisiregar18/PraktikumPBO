package com.regi.pratikumpbo.pertemuan4.tugas;

public class Programmer extends Pegawai {
    //Attribute
    String jobDesk;
    
    //method
    public void Fact(){
        System.out.println("Pekerjaan ini bernama" + nama + "yang bekerja fulltime untuk mengembangkan sistem perusahaan");
    }
    
    //penambahan method
    public void extraInfo(){
        System.out.println("Pekerjaan ini fokus untuk " + jobDesk + " dan bisa menguasai 3 bahasa pemograman yaitu java, c++ , dan python");
    }
}
