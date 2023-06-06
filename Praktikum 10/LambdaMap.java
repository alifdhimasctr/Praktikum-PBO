/*
	Nama File : LambdaMap.java
	Tanggal	  : 06 Juni 2023
	Nama      : Dhimas Alif Prabowo
	NIM       : 24060121120037
	Deskripsi : main class Lambda HashMap
*/

import java.util.*;

public class LambdaMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060121120037", "Dhimas");
        mahasiswaMap.put("24060121120037", "Alif");
        mahasiswaMap.put("24060121120037", "Prabowo");
        // lambda digunakan sebagai parameter
        mahasiswaMap.forEach((nim, nama) -> {
            System.out.println(nim + " : " + nama);
        });
    }
}