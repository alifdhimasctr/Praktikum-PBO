/*
	Nama File : ArrayListTest.java  
	Tanggal	  : 20 Mei 2023
	Nama      : Dhimas Alif Prabowo
	NIM       : 24060121120037
	Deskripsi : class Array List
*/

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("aku");
        strings.add("sayang");
        strings.add("kamu");
        strings.remove("praktikum");
        for(String s : strings){
            System.out.println(s+" ");
        }
        
    }
}