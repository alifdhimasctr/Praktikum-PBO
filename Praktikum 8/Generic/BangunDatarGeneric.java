/*
	Nama File : BangunDatarGeneric.java  
	Tanggal	  : 20 Mei 2023
	Nama      : Dhimas Alif Prabowo
	NIM       : 24060121120037
	Deskripsi : class BangunDatarGeneric
*/

public class BangunDatarGeneric<TT extends BangunDatar> {
    private TT bangunDatar;
    public void set(TT tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }
    public TT get(){
        return bangunDatar;
    }
    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }
}