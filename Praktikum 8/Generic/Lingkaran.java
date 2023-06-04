/*
	Nama File : Lingkaran.java  
	Tanggal	  : 20 Mei 2023
	Nama      : Dhimas Alif Prabowo
	NIM       : 24060121120037
	Deskripsi : class Lingkaran 
*/

import 
public class Lingkaran extends BangunDatar {
    private double jejari;
    public Lingkaran(double jejari){
        this.jejari = jejari;
    }
    public double hitungKeliling(){
        return 2 * Math.PI* jejari;
    }
    
}