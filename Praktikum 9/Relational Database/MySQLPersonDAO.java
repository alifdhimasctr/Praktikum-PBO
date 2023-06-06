import java.sql.*;

/*
	Nama File : MySQLPersonDAO.java
	Tanggal	  : 06 Juni 2023
	Nama      : Dhimas Alif Prabowo
	NIM       : 24060121120037
	Deskripsi : implementasi PersonDAO untuk MySQL
*/
public class MySQLPersonDAO implements PersonDAO{
	public void savePerson(Person person) throws Exception{
		String name = person.getName();
		//membuat koneksi, nama db,user, password menyesuaikan
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(
							"jdbc:mysql://localhost/pbo","root","Belajar03_");
		//kerjakan mysql query
		String query = "INSERT INTO person(name) VALUES('"+name+"')";
		System.out.println(query);
		Statement s = con.createStatement();
		s.executeUpdate(query);
		//tutup koneksi database
		con.close();
	}
}