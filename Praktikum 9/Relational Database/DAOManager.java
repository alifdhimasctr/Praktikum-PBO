/*
	Nama File : DAOManager.java
	Tanggal	  : 06 Juni 2023
	Nama      : Dhimas Alif Prabowo
	NIM       : 24060121120037
	Deskripsi : pengelola DAO dalam program
*/
public class DAOManager{
	private PersonDAO personDAO;
	
	public void setPersonDAO(PersonDAO person){
		personDAO = person;
	}
	public PersonDAO getPersonDAO(){
		return personDAO;
	}
}