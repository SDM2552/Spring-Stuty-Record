package contactapp;

import java.io.Serializable;

public class Member implements Serializable{

	String name;
	String tel;
	String email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Member(String name, String tel, String email) {
		super();
		this.name = name;
		this.tel = tel;
		this.email = email;
	}

	@Override
	public String toString() {
		return "이름: " + name + "\t전화번호: " + tel + "\t이메일: " + email;
	}

}
