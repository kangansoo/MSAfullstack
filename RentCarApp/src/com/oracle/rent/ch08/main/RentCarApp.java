package com.oracle.rent.ch08.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.oracle.rent.ch08.car.Car;
import com.oracle.rent.ch08.member.Member;
import com.oracle.rent.ch08.res.Reserve;

public class RentCarApp {
	
    public static void viewMembers(List<Member> members) {
        System.out.println("회원 목록:");
		System.out.println("회원 정보를 조회합니다.");
        for (Member member : members) {
            System.out.println(member.viewMember());
        }
    }
    
    public static void updateReserve(Map<String, Reserve> reserves, String reserveNumber, Reserve updatedReserve) {
        if (reserves.containsKey(reserveNumber)) { // 예약 번호가 있는지 확인
            reserves.replace(reserveNumber, updatedReserve); // 예약 정보 수정
            System.out.println("예약 번호: "+reserveNumber + "의 예약 정보가 성공적으로 수정되었습니다.");
            System.out.println();
        } else {
            System.out.println("해당 예약 번호를 찾을 수 없습니다.");
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        List<Member> members = new ArrayList<>();
        List<Car> cars = new ArrayList<>();
        Map<String, Reserve> reserves = new HashMap<>();

        // 회원 추가
        members.add(new Member("lee", "1234", "이순신", "서울시 도봉구", "010-1111-2222"));
        members.add(new Member("kim", "5678", "김유신", "서울시 강남구", "010-3333-4444"));
        members.add(new Member("park", "abcd", "박문수", "서울시 서대문구", "010-5555-6666"));
        members.add(new Member("lee", "1523", "이이", "서울시 서대문구", "010-8888-2222"));

        // 차량 추가
        cars.add(new Car("11가1111", "소나타", "검정", 4000, "현대"));
        cars.add(new Car("22나2222", "그랜저", "흰색", 4800, "현대"));
        cars.add(new Car("33다3333", "고스트", "검은색", 5100, "롤스로이스"));
        cars.add(new Car("44라4444", "프로산게", "빨간색", 4800, "페라리"));
        cars.add(new Car("55마5555", "DB11", "쥐색", 4500, "애스턴마틴"));

        // 예약 추가
        reserves.put("20220708-0001", new Reserve("20220708-0001", "11가1111", "2022-04-30", "2022-05-01", "2022-05-08"));
        reserves.put("20220710-0001", new Reserve("20220710-0001", "22나2222", "2022-05-02", "2022-05-10", "2022-05-12"));

        
        viewMembers(members);
        System.out.println();
        
        // 예약 정보 수정
        Reserve updatedReserve = new Reserve("20220708-0001", "11가1111", "2022-05-02", "2022-05-02", "2022-05-11"); 
        updateReserve(reserves, "20220708-0001", updatedReserve);

        // 예약 가능한 차량 확인
        List<Car> availableCars = new ArrayList<>();
        for (Car car : cars) {
            boolean isReserved = false;
            for (Reserve reserve : reserves.values()) {
                if (reserve.getResCarNumber().equals(car.getCarNumber())) {
                    isReserved = true;
                    break;
                }
            }
            if (!isReserved) {
                availableCars.add(car);
            }
        }

        // 출력
        if (availableCars.isEmpty()) {
            System.out.println("예약 가능한 차량이 없습니다.");
        } else {
            System.out.println("예약 가능한 차량 목록:");
            for (Car car : availableCars) {
                System.out.println(car.checkCarInfo());
            }
        }
    }
}
