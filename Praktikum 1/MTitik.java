
class MTitik{
	public static void main(String[] args) {
		
		Titik A = new Titik();
		
		System.out.println("Titik Baru = ("+A.getAbsis()+","+A.getOrdinat()+")");
		A.setAbsis(6);
		System.out.println("absis berubah menjadi = ("+A.getAbsis()+","+A.getOrdinat()+")");
		A.setOrdinat(-5);
		System.out.println("ordinat berubah menjadi = ("+A.getAbsis()+","+A.getOrdinat()+")");
	}
}
