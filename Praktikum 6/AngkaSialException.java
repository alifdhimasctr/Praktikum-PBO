/*
	Nama File : AngkaSialException.java  
	Tanggal	  : 29 Maret 2023
	Nama      : Dhimas Alif Prabowo
	NIM       : 24060121120037
	Deskripsi : Eksepsi buatan sendiri, menolak masukan angka 1
*/

public class AngkaSialException extends Exception{
    public AngkaSialException(){
        super("jangan memasukkan angka 13 karena angka sial!!!");
    }
}