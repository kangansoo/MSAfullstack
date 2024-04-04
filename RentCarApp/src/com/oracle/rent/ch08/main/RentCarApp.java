package com.oracle.rent.ch08.main;

import com.oracle.rent.ch08.car.Car;
import com.oracle.rent.ch08.member.Member;
import com.oracle.rent.ch08.res.Reserve;

public class RentCarApp {
	public static void main(String[] args) {
//		Member member = new Member("lee", "1234", "이순신", "서울시 도봉구", "010-1111-2222");
//		Car car = new Car("11가1111", "소나타", "2000", "현대");
//		Reserve reserve = new Reserve("11가1111", "2022-04-30", "2022-05-01", "2022-0508");
		
		Member member = new Member();
		Car car = new Car();
		Reserve reserve = new Reserve();
		member.regMember("lee", "1234", "이순신", "서울시 도봉구", "010-1111-2222");
		car.regCarInfo("11가1111", "소나타", "검정", 2000, "현대");
		reserve.resCar("20220708-0001", "11가1111", "2022-04-30", "2022-05-01", "2022-0508");
		
		String memberInfo = member.viewMember();
		System.out.println(memberInfo);
		
		String carInfo = car.checkCarInfo();
		System.out.println(carInfo);
		
		String resInfo = reserve.checkResInfo();
		System.out.println(resInfo);
	}
}
