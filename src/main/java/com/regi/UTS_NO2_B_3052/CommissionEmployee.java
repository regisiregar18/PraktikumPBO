package com.regi.UTS_NO2_B_3052;

public class CommissionEmployee extends Employee {
    public float Komisi;
    public float TotalPenjualan;
    public float Totalgaji;
    
    public CommissionEmployee(){
        
    }
    
    public float TotalGaji(){
        Totalgaji = GajiPokok + (Komisi * TotalPenjualan);
        return Totalgaji;
    }
    
    public void TampilData(){
        System.out.println("Commission Employee");
        Tampil();
        System.out.println("Total Gaji: " + Totalgaji);
    }
}
