package com.shop.cafe.dao;

import java.sql.DriverManager;

public class MemberDao {
	
	public void insertMember(Member m) {
		Class.forName(DB_DRIVER);
		Connection con = DriverManager.getConnection())
	}

}
