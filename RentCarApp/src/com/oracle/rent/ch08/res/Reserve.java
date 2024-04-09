package com.oracle.rent.ch08.res;

public class Reserve {
	String resNumber;
	String resCarNumber;
	String resDate;
	String useBeginDate;
	String useEndDate;

	public Reserve() {

	}

	public Reserve(String _resNumber, String _resCarNumber, String _resDate, String _useBeginDate, String _useEndDate) {
		resCarNumber = _resCarNumber;
		resDate = _resDate;
		useBeginDate = _useBeginDate;
		useEndDate = _useEndDate;
	}

	public String getResCarNumber() {
		return resCarNumber;
	}

	public void setResCarNumber(String resCarNumber) {
		this.resCarNumber = resCarNumber;
	}

	public String checkResInfo() {
		System.out.println("\n차 예약 정보를 조회합니다.");
		System.out.println("---------------------");
		String resInfo = "예약 번호: " + resNumber + "\n예약 차 번호: " + resCarNumber + "\n예약일자: " + resDate + "\n차 사용 시작 일자: "
				+ useBeginDate + "\n차 반납 예정 일자: " + useEndDate;

		return resInfo;
	}

	public void resCar(String _resNumber, String _resCarNumber, String _resDate, String _useBeginDate,
			String _useEndDate) {
		System.out.println("차 예약 정보를 등록합니다.");
		resCarNumber = _resCarNumber;
		resDate = _resDate;
		useBeginDate = _useBeginDate;
		useEndDate = _useEndDate;
	}

	public void cancelResInfo() {
		System.out.println("\n차 예약을 취소합니다.");
	}
}