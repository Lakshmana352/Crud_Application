package crud;
//import model.User;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;

//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Statement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
//		try {
//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud_schema","root","IITRopar@MYSQL03");
////			Statement stat = con.createStatement();
//			System.out.println(con);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
	}

}
