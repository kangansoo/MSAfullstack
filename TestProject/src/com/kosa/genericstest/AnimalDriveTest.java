package com.kosa.genericstest;

import java.util.ArrayList;
import java.util.List;

public class AnimalDriveTest {
	
	public static <T> void printList(List<T> list) {
        for (T item : list) {
            System.out.println(item);
        }
    }

	public static void main(String[] args) {
		List<Animal> animalList = new ArrayList<>();
		animalList.add(new Dog());
		animalList.add(new Cat());
		animalList.add(new Tiger());

		// 동물 종 출력
		System.out.println("동물 종:");
		animalList.stream()
			.forEach(System.out::println);
		printList(animalList);
		System.out.println("=================================");
		
		// 강아지 리스트 생성
		List<Dog> dogList = new ArrayList<>();
		dogList.add(new Dog("바둑이"));
		dogList.add(new Dog("누렁이"));
		dogList.add(new Dog("백구"));
		dogList.add(new Dog("황구"));

		// 강아지 이름 출력
		System.out.println("강아지 이름:");
		dogList.stream()
	    	.map(Dog::getName)
	    	.forEach(System.out::println);
		printList(dogList);
		
		
	}

}
