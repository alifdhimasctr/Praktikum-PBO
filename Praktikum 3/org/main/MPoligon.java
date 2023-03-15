/*
	Nama File : MPoligon.java  
	Tanggal	  : 15 Maret 2023
	Nama      : Dhimas Alif Prabowo
	NIM       : 24060121120037
	Deskripsi : main class dari poligon
*/

package org.main;

import org.bangundatar.*;

public class MPoligon{
	public static void main(String[] args){
		PersegiPanjang persegi = new PersegiPanjang(10,10,4);
		Segitiga segitiga = new Segitiga(10,5,3);
		segitiga.printInfo();
		System.out.println("Luas segitiga = "+segitiga.hitungLuas());
		persegi.printInfo();
		System.out.println("Luas persegi panjang = "+persegi.hitungLuas());
	}
}