package com.regi.pratikumpbo.pertemuan3;

public class Main {
    public static void main(String[] args) {
        // -- Pembuatan Class --
        Animal cat = new Animal ("Miyu", 4, "Black");
        Animal dog = new Animal ("Dewa",5, "Pink");
        Animal rabbit = new Animal ("Zidan", 6, "Kuning"); 
        
        // Menjalankan Method 'Show Profile()' masing masing object 
        dog.showProfile();
        cat.showProfile();
        rabbit.showProfile();
        
        System.out.println("Dog's name (before): " + dog.getNama());
        dog.setNama("Blacky");
        System.out.println("Dog's name (after):" + dog.getNama());
    }
}
