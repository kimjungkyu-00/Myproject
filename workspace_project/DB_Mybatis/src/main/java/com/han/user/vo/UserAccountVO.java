package com.han.user.vo;

public class UserAccountVO {
	// 회원 아이디
	private String signUpUserId;

	// 회원 비밀번호
	private String signUpUserPwd;

	// 회원 회사명
	private String signUpUserCompanyName;

	// 회원 회사 전화번호
	private String signUpUserTelNo;

	// 회원 회사 이메일
	private String signUpUserEmail;

	// 회원 회사 사업자번호
	private String signUpUserCompanyNo;


	// 회원 회사주소 - 우편번호
	private String signUpUserPostNo;

	// 회원 회사주소 - 도로명 주소
	private String signUpUserCompanyAddress;

	// 회원 회사주소 - 상세주소
	private String signUpUserCompanyAddressDetail;

	public String getSignUpUserId() {
		return signUpUserId;
	}

	public void setSignUpUserId(String signUpUserId) {
		this.signUpUserId = signUpUserId;
	}

	public String getSignUpUserPwd() {
		return signUpUserPwd;
	}

	public void setSignUpUserPwd(String signUpUserPwd) {
		this.signUpUserPwd = signUpUserPwd;
	}

	public String getSignUpUserCompanyName() {
		return signUpUserCompanyName;
	}

	public void setSignUpUserCompanyName(String signUpUserCompanyName) {
		this.signUpUserCompanyName = signUpUserCompanyName;
	}

	public String getSignUpUserTelNo() {
		return signUpUserTelNo;
	}

	public void setSignUpUserTelNo(String signUpUserTelNo) {
		this.signUpUserTelNo = signUpUserTelNo;
	}

	public String getSignUpUserEmail() {
		return signUpUserEmail;
	}

	public void setSignUpUserEmail(String signUpUserEmail) {
		this.signUpUserEmail = signUpUserEmail;
	}

	public String getSignUpUserCompanyNo() {
		return signUpUserCompanyNo;
	}

	public void setSignUpUserCompanyNo(String signUpUserCompanyNo) {
		this.signUpUserCompanyNo = signUpUserCompanyNo;
	}

	public String getSignUpUserPostNo() {
		return signUpUserPostNo;
	}

	public void setSignUpUserPostNo(String signUpUserPostNo) {
		this.signUpUserPostNo = signUpUserPostNo;
	}

	public String getSignUpUserCompanyAddress() {
		return signUpUserCompanyAddress;
	}

	public void setSignUpUserCompanyAddress(String signUpUserCompanyAddress) {
		this.signUpUserCompanyAddress = signUpUserCompanyAddress;
	}

	public String getSignUpUserCompanyAddressDetail() {
		return signUpUserCompanyAddressDetail;
	}

	public void setSignUpUserCompanyAddressDetail(String signUpUserCompanyAddressDetail) {
		this.signUpUserCompanyAddressDetail = signUpUserCompanyAddressDetail;
	}
}