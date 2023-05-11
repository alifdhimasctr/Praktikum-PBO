/*
	Nama File : Programmer.java  
	Tanggal	  : 10 Mei 2023
	Nama      : Dhimas Alif Prabowo
	NIM       : 24060121120037
	Deskripsi : Class dari Programmer
*/

public class Programmer extends Pegawai {
    private int bonus = 500000;

    public Programmer(String nama) {
        setNama(nama);
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus : " + bonus);
    }
}