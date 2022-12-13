package com.regi.praktikumpbo.pertemuan6.tugas;

public class Exception4 {
    public static void main(String[] args) {
        try{
        Object[] array = new String[5];
        array[0] = 8;
        }catch(ArrayStoreException e){
            e.printStackTrace();
        }
        System.out.println("Terus Running....");
    }
}
