package com.regi.pertemuan3.challenge;

public class challenge {
    String name;
    int visitorsToday;
    int yearBuilt;
    
    public challenge(){
        
    }
    public challenge(String name, int visitorsToday, int yearBuilt){
        this.name = name;
        this.visitorsToday = visitorsToday;
        this.yearBuilt = yearBuilt;
    }
    
    public void showProfile(){
        System.out.println("Nama : " + name);
        System.out.println("Today Visitor : " + visitorsToday);
        System.out.println("Year Built : " + yearBuilt);
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getVisitorsToday(){
        return visitorsToday;
    }
    
    public void setVisitorsToday(int visitorsToday){
        this.visitorsToday = visitorsToday;
    }
    
    public int getYearBuilt(){
        return yearBuilt;
    }
    
    public void setYearBuilt(int yearBuilt){
        this.yearBuilt = yearBuilt;
    }
}
