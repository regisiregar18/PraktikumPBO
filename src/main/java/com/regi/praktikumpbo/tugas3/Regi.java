package com.regi.pratikumpbo.tugas3;

public class Regi {

    //Attribute 
    private String name;
    private int tinggi;
    private double berat;
    private int umur;

// Constructor
    public Regi(String name, int tinggi, double berat, int umur) {
        this.name = name;
        this.tinggi = tinggi;
        this.berat = berat;
        this.umur = umur;
    }
//Method mencetak semua attribute 

    public void biodataSaya() {

        System.out.println("Name : " + name);
        System.out.println("Umur : " + umur + " Tahun");
        System.out.println("Tinggi Badan : " + tinggi + " Cm");
        System.out.println("Berat Badan :" + berat + " Kg");
        System.out.println();
    }

    // Getter & Setter 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

}
