package com.kosa.streampractice;

import java.time.LocalDate;
import java.time.Period;
import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.List;


public class Soldier {
	String name;
	int age;
	String classification;
	LocalDate enlistDate;
	LocalDate dischargeDate;
	
	public Soldier(String name, int age, String classification, LocalDate enlistDate, LocalDate dischargeDate) {
		super();
		this.name = name;
		this.age = age;
		this.classification = classification;
		this.enlistDate = enlistDate;
		this.dischargeDate = dischargeDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getClassification() {
		return classification;
	}
	public void setClassification(String classification) {
		this.classification = classification;
	}
	public LocalDate getEnlistDate() {
		return enlistDate;
	}
	public void setEnlistDate(LocalDate enlistDate) {
		this.enlistDate = enlistDate;
	}
	public LocalDate getDischargeDate() {
		return dischargeDate;
	}
	public void setDischargeDate(LocalDate dischargeDate) {
		this.dischargeDate = dischargeDate;
	}
	
	public int remainPeriod() {
        Period period = Period.between(LocalDate.now(), dischargeDate);
        int totalDays = period.getYears() * 365 + period.getMonths() * 30 + period.getDays();
        return totalDays;
    }
	public void printSoldier() {
		System.out.println("이름: "+name+", 나이: "+age+", 분류: "+classification);
	}
	public static List<Soldier> createRoster(){
		List<Soldier> roster = new ArrayList<>();
        roster.add(new Soldier("Kim", 20, "육군", LocalDate.of(2023, 6, 20), LocalDate.of(2025, 6, 20)));
        roster.add(new Soldier("Lee", 22, "공군", LocalDate.of(2024, 1, 5), LocalDate.of(2027, 1, 5)));
        roster.add(new Soldier("Ko", 21, "해병대", LocalDate.of(2023, 1, 20), LocalDate.of(2025, 1, 20)));
        roster.add(new Soldier("Son", 23, "해군", LocalDate.of(2022, 1, 20), LocalDate.of(2024, 6, 20)));
        roster.add(new Soldier("Park", 25, "육군", LocalDate.of(2022, 4, 20), LocalDate.of(2024, 4, 20)));
        roster.add(new Soldier("Choi", 28, "육군", LocalDate.of(2024, 3, 20), LocalDate.of(2026, 3, 20)));
        return roster;
	}

}
