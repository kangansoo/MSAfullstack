package com.kosa;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class MemberDAO {

	private Connection conn = DBConnection.getConnection();
	private Statement stmt;
	private ResultSet rs;	
	
	public ArrayList<MemberVO> list(MemberVO vo) {
		String _name = vo.getName();
		int _age = vo.getAge();

		ArrayList<MemberVO> list = new ArrayList<MemberVO>();

		try {
			String query = "select * from member";
			if (_name != null && _age != 0) {
				query += " where name='" + _name + "' and age=" + _age;
			} else if (_name != null && _age == 0) {
				query += " where name='" + _name + "'";
			} else if (_name == null && _age != 0) {
				query += " where age=" + _age;
			}

			System.out.println(query);
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);

			while (rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				int height = rs.getInt("height");
				int weight = rs.getInt("weight");
				int age = rs.getInt("age");

				MemberVO data = new MemberVO();

				data.setId(id);
				data.setName(name);
				data.setHeight(height);
				data.setWeight(weight);
				data.setAge(age);

				list.add(data);
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public void modMember(MemberVO vo) {
		String _name = null;
		int _age = 0;

		_name = vo.getName();
		_age = vo.getAge();

		try {

			String query = "update member ";
			query += " set age=" + _age;
			query += " where name='" + _name + "'";

			System.out.println(query);
			stmt = conn.createStatement();
			stmt.executeUpdate(query);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}