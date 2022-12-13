package com.regi.pertemuan3.challenge;

public class main {
    public static void main(String[] args) {
        challenge regi = new challenge("Regi", 19, 2003);
        challenge bintera = new challenge("Bintera", 20, 2004);
        challenge siregar = new challenge ("Siregar", 25, 2005);
        
        regi.showProfile();
        bintera.showProfile();
        siregar.showProfile();
        
        System.out.println("Regi name (before) : " + regi.getName());
        regi.setName("Regar");
        System.out.println("Regi name (after) : " + regi.getName());
    }
 
}
