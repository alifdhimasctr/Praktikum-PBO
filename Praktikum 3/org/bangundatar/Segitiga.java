/*
	Nama File : Segitiga.java  
	Tanggal	  : 15 Maret 2023
	Nama      : Dhimas Alif Prabowo
	NIM       : 24060121120037
	Deskripsi : representasi dasar dari objek segitiga subclass poligon
*/

package org.bangundatar;

import org.poligon.Poligon;

public class Segitiga extends Poligon{
	private double alas,tinggi;
	
	public Segitiga(double alas,double tinggi, int jumlahSisi){
		this.alas = alas;
		this.tinggi = tinggi;
		this.jumlahSisi = jumlahSisi;
	}
	
	public double hitungLuas(){
		return 0.5 * alas * tinggi;
	}
	
	public void printInfo(){
		System.out.println("Segitiga bersisi "+this.getJumlahSisi());
	}
	
}