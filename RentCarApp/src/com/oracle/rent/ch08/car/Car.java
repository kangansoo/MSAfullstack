package com.oracle.rent.ch08.car;

public class Car {
	String carNumber;
	String carName;
	String carColor;
	int carSize;
	String carMaker;

	public Car() {
	}

	public Car(String _carNumber, String _carName, String _carColor, int _carSize, String _carMaker) {
		carNumber = _carNumber;
		carName = _carName;
		carColor = _carColor;
		carSize = _carSize;
		carMaker = _carMaker;

	}

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public String checkCarInfo() {
//		System.out.println("\n렌터카 정보를 조회합니다.");
		System.out.println("--------------------");
		String carInfo = "차 번호: " + carNumber + "\n차 이름: " + carName + "\n차 색상: " + carColor + "\n차 크기: " + carSize
				+ "cc" + "\n차 제조사: " + carMaker;

		return carInfo;
	}

	public void regCarInfo(String _carNumber, String _carName, String _carColor, int _carSize, String _carMaker) {
		System.out.println("차 정보를 등록합니다.");
		carNumber = _carNumber;
		carName = _carName;
		carColor = _carColor;
		carSize = _carSize;
		carMaker = _carMaker;
	}

	public void modCarInfo() {
		System.out.println("\n렌터카 정보를 수정합니다.");
	}

	public void delCarInfo() {
		System.out.println("\n렌터카 정보를 삭제합니다.");
	}

}
