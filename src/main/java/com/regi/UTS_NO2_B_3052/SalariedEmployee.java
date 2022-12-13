package com.regi.UTS_NO2_B_3052;

public class SalariedEmployee extends Employee {
    public SalariedEmployee(){
        
    }
    
    public void TampilData(){
        System.out.println("Salaried Employee");
        Tampil();
        System.out.println("Total Gaji: " + GajiPokok);
    }
}
