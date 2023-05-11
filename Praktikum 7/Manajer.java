/*
	Nama File : Manajer.java  
	Tanggal	  : 10 Mei 2023
	Nama      : Dhimas Alif Prabowo
	NIM       : 24060121120037
	Deskripsi : Class dari Manajer
*/


public class Manajer extends Pegawai {
    private int tunjangan = 750000;

    public Manajer(String nama) {
        setNama(nama);
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan : " + tunjangan);
    }
}