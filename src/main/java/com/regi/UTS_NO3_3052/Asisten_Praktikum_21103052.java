package com.regi.UTS_NO3_3052;

public class Asisten_Praktikum_21103052 extends Mahasiswa_21103052 implements IPendapatan_21103052 {
    private String mkAsistensi;
    private int jmlPertemuan;

    public String getMkAsistensi() {
        return mkAsistensi;
    }

    public void setMkAsistensi(String mkAsistensi) {
        this.mkAsistensi = mkAsistensi;
    }

    public int getJmlPertemuan() {
        return jmlPertemuan;
    }

    public void setJmlPertemuan(int jmlPertemuan) {
        this.jmlPertemuan = jmlPertemuan;
    }

    @Override
    public void tampilDataMhs() {
        System.out.println("NIM                     : " + nim);
        System.out.println("Nama                    : " + nama);
        System.out.println("Jurusan                 : " + jurusan);
        System.out.println("IPK                     : " + ipk);
        System.out.println("MK Asistentsi           : " + mkAsistensi);
        System.out.println("Jumlah Pertemuan        : " + jmlPertemuan);
        System.out.println("-----------------------------------------");
    }

    @Override
    public double totalPendapatan() {
        double totalPendapatan;

        return totalPendapatan = jmlPertemuan * 50000;

    }
}
