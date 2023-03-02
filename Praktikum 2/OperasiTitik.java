/*
Nama	: Dhimas Alif Prabowo
NIM		: 24060121120037
*/

class OperasiTitik{
	
	private void refleksiSumbuX(Titik T){
		double ordinat = T.getOrdinat();
		ordinat = ordinat *-1;
		T.setOrdinat(ordinat);
	}
	
	private void refleksiSumbuY(Titik T){
		double absis T.getAbsis();
		absis = absis *-1;
		T.setAbsis(absis);
	}
	
	public Titik refleksiX(Titik T1){
		refleksiSumbuX(T1);
		return T1;
	}
	
	public Titik refleksiY(Titik T1){
		refleksiSumbuY(T1);
		return T1;
	}
}