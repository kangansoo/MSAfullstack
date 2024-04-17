package com.kosa;

import java.util.ArrayList;

public class MemberTest2 {

	public static void main(String[] args) {
		
		MemberDAO dao = new MemberDAO();
		String _name = "Jennifer";
		int _age = 20;

		MemberVO vo = new MemberVO(_name, _age);
		dao.modMember(vo);

		ArrayList<MemberVO> list = dao.list(vo);
		
		for (int i = 0; i < list.size(); i++) {
			MemberVO data = list.get(i);
			String id = data.getId();
			String name = data.getName();
			int height = data.getHeight();
			int weight = data.getWeight();
			int age = data.getAge();

			System.out.println("아이디는>>"+id+
					   ", 이름은>>"+name+
					   ", 키는>>"+height+
					   ", 체중은>>"+weight+
					   ", 나이는>>"+age);		
		}
	}

}
