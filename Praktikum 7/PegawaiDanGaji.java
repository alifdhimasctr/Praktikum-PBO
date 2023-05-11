/*
	Nama File : PegawaiDanGaji.java  
	Tanggal	  : 10 Mei 2023
	Nama      : Dhimas Alif Prabowo
	NIM       : 24060121120037
	Deskripsi : Main Class dari Gaji pegawai
*/

public class PegawaiDanGaji{
	public static void main(String args[]) {
		Pegawai pegawai1 = new Programmer("Nafis");
		Pegawai pegawai2 = new Manajer("Yanto");
		Pegawai pegawai3 = new Manajer("Mufadhal");

		Payroll payroll = new Payroll();
		payroll.cetakGaji(pegawai1);
		payroll.cetakGaji(pegawai2);
		payroll.cetakGaji(pegawai3);
	}
}