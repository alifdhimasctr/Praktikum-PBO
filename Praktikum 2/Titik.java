/*
Nama	: Dhimas Alif Prabowo
NIM		: 24060121120037
*/

public class Titik{
	//atribut
	private double absis;
	private double ordinat;
	static int counterTitik;
	
	//konstruktor
	Titik(){
		absis = 0;
		ordinat = 0;
		counterTitik++;
	}
	
	Titik(double x, double y){
		absis = x;
		ordinat = y;
		counterTitik++;
	}
	
	Titik (int x, int y){
		absis = x;
		ordinat = y;
		counterTitik++;		
	}
	
	//metode
	
	double getAbsis(){
		return absis;
	}
	
	double getOrdinat(){
		return ordinat;
	}
	
	int counterTitik(){
		return counterTitik;
	}
	
	void setAbsis(double a){
		absis = a;
	}
	
	void setOrdinat(double o){
		ordinat = o;
	}
}