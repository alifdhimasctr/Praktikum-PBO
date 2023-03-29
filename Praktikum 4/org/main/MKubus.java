/*
	Nama File : MKubus.java  
	Tanggal	  : 15 Maret 2023
	Nama      : Dhimas Alif Prabowo
	NIM       : 24060121120037
	Deskripsi : main class Kubus
*/

package org.main;

import org.bangundatar.BujurSangkar;
import org.bangunruang.Kubus;

public class MKubus {
    public static void main(String[] args){
        BujurSangkar bujurSangkar = new BujurSangkar(5);
        Kubus kubus = new Kubus(bujurSangkar);

        System.out.println("Luas Alas Kubus = " + kubus.luasAlas());
        System.out.println("Volume Kubus = " + kubus.hitungVolume());
    }
}