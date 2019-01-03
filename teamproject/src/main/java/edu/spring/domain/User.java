package edu.spring.domain;

public class User {
	
	private String userId;		// 유저아이디
	private String userPw;		// 유저 비번
	private String userEmail;	// 유저 이메일
	private String phone;		// 유저 폰
	private int point;			// 유저 포인트
	private int certification;	// 이메일 인증 여부 0(false) 아니면 1(true)
	
	public User () {}

	public User(String userId, String userPw, String userEmail, String phone, int point, int certification) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.userEmail = userEmail;
		this.phone = phone;
		this.point = point;
		this.certification = certification;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public int getCertification() {
		return certification;
	}

	public void setCertification(int certification) {
		this.certification = certification;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userPw=" + userPw + ", userEmail=" + userEmail + ", phone=" + phone
				+ ", point=" + point + ", certification=" + certification + "]";
	}
	

}
