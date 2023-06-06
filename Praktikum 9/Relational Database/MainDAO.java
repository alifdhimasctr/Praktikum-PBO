/*
	Nama File : MainDAO.java
	Tanggal	  : 06 Juni 2023
	Nama      : Dhimas Alif Prabowo
	NIM       : 24060121120037
	Deskripsi : Main program untuk akses DAO
*/
public class MainDAO{
	public static void main(String args[]){
		Person person = new Person("Andi");
		DAOManager m = new DAOManager();
		m.setPersonDAO(new MySQLPersonDAO());
		try{
			m.getPersonDAO().savePerson(person);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}