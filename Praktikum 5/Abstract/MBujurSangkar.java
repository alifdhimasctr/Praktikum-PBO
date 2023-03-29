/*
	Nama File : MBujurSangkar.java 
	Tanggal	  : 29 Maret 2023
	Nama      : Dhimas Alif Prabowo
	NIM       : 24060121120037
	Deskripsi : main dari objek bujur sangkar
*/

import java.util.Scanner;
 
class MBujurSangkar{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		BujurSangkar bs = new BujurSangkar();
		System.out.print("Masukkan sisi bujur sangkar : ");
		double sisi = scan.nextDouble();
		System.out.println("Luas bujur sangkar dengan sisi "+sisi+" adalah "+bs.hitungLuas(sisi));
	}
}