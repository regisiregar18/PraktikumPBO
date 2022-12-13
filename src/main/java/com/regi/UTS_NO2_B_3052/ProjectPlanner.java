package com.regi.UTS_NO2_B_3052;

public class ProjectPlanner extends Employee {
    public float Komisi;
    public float TotalHslProyek;
    public double Totalgaji;
    
    public ProjectPlanner(){
        
    }
            
    public double TotalGaji(){
        Totalgaji = GajiPokok + (Komisi * TotalHslProyek) - (GajiPokok*5/100);
        return Totalgaji;
    }
    
    public void TampilData(){
        System.out.println("Project Plannner");
        Tampil();
        System.out.println("Total Gaji: " + Totalgaji);
    }

}
