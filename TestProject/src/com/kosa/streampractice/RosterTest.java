package com.kosa.streampractice;

import java.time.LocalDate;
import java.util.List;

import com.kosa.lambda.Person;



public class RosterTest {

	interface checkSoldier {
        boolean test(Soldier s);
    }
	public static void printSoldiersOlderThan(List<Soldier> roster, int high, int row) {
        for (Soldier s : roster) {
            if (s.getAge() > row && s.getAge() < high) {
                s.printSoldier();
            }
        }
    }
	public static void main(String[] args) {
		List<Soldier> roster = Soldier.createRoster();
		
		System.out.println("나이가 22이상이고 24살 이하인 사람: ");
		printSoldiersOlderThan(roster, 25, 21);
		System.out.println("===============================================");
		
		System.out.println("공군, 해군 혹은 해병대인 사람 출력: ");
		for (Soldier s : roster) {
		    if ("공군".equals(s.getClassification()) || "해군".equals(s.getClassification()) || "해병대".equals(s.getClassification())) {
		        s.printSoldier();
		    }
		}
		System.out.println("===============================================");
		
		System.out.println("입대일이 2024년 1월 1일 이전인 사람: ");
		roster.stream()
	    	.filter(s -> s.getEnlistDate().isBefore(LocalDate.of(2024, 1, 1)))
	    	.map(s -> s.getName() +" 입대일: "+ s.getEnlistDate())
	    	.forEach(System.out::println);
		System.out.println("===============================================");
		
		System.out.println("남은 복무기간이 400일 이상이고 육군인 사람: ");
		roster.stream()
        	.filter(s -> s.remainPeriod() >= 400 && "육군".equals(s.getClassification()))
            .map(s -> s.getName() + " 남은 일자: " + s.remainPeriod() + "일")
            .forEach(System.out::println);
	}
}
