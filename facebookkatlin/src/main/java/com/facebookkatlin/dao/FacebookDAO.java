package com.facebookkatlin.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.facebookkatlin.entity.FacebookUser;

public class FacebookDAO implements FacebookDAOInterface {

	public int createProifleDAO(FacebookUser fu) {
		int i=0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","rajesh");
			
			PreparedStatement ps=con.prepareStatement("insert into facebookketlin values(?,?,?,?)");
			ps.setString(1, fu.getName());
			ps.setString(2, fu.getPassword());
			ps.setString(3, fu.getEmail());
			ps.setString(4, fu.getAddress());
			
			i=ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return i;
	}

}
