package com.regi.praktikumpbo.pertemuan3;

public class Animal {
    private String nama;
    private int usia;
    private String color;
    
    public Animal(){}

    public Animal(String nama, int usia, String color) {
        this.nama = nama;
        this.usia = usia;
        this.color = color;
    }
    
    public void showProfile(){
        System.out.println("Nama : " + nama);
        System.out.println("Usia : " + usia);
        System.out.println("Warna : " + color);
    }

    
    // alt + insert + getter & setter --> select all
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}
