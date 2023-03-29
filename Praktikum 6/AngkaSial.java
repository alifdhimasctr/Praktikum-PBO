/*
	Nama File : AngkaSial.java  
	Tanggal	  : 29 Maret 2023
	Nama      : Dhimas Alif Prabowo
	NIM       : 24060121120037
	Deskripsi : Program penggunaan exception buatan sendiri
                Pengenalan klausa 'throw' dan 'throws'
*/

public class AngkaSial{
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka+" Bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch(AngkaSialException ase){
            //method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("Hati hati memasukkan angka!!!");
        }
    }
}

//ketika eksepsi terjadi baris 12(disini 15) tidak tereksekusi karena setelah ada angka yang tidak diinginkan masuk, namun sebelumnya bilangan lain tereksekusi
//baris 21(disini 24) tereksekusi saat menangkap hasil masukan angksa sial (13)