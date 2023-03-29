/*
	Nama File : MLingkaran.java 
	Tanggal	  : 29 Maret 2023
	Nama      : Dhimas Alif Prabowo
	NIM       : 24060121120037
	Deskripsi : main dari objek lingkaran
*/

import java.util.Scanner;

class MLingkaran{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in); 
		System.out.print("jejari lingkaran : ");
		double jejari = scan.nextDouble();
		Lingkaran l = new Lingkaran(jejari);
		System.out.println("Luas lingkaran dengan jari-jari "+jejari+" adalah "+l.hitungLuas());
	}
}