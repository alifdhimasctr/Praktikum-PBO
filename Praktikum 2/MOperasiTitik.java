class MOperasiTitik{
	public static void main(String[]args{
	
	titik A = new Titik(4.0,2.0);
	OperasiTitik OP = new OperasiTitik();
	
	System.out.println("Titik yang dimasukkan adalah ("+A.getAbsis()+","+A.getOrdinat()+")");
	
	OP.refleksiX(A);
	System.out.println("Setelah direfleksikan dengan sumbu X menjadi ("+A.getAbsis+","+A.getOrdinat+")");
	
	OP.refleksiY(A);
	System.out.println("Setelah direfleksikan dengan sumbu Y menjadi ("+A.getAbsis+","+A.getOrdinat+")");
		
	}
}