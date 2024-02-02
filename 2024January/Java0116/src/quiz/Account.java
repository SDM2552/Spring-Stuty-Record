package quiz;

import java.io.Serializable;

public class Account implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String name;
	private String id;
	private String pass;
	private String tel;
	private String ssn;
	private int balance;
	private int money = 10000;

	public Account() {
	}

	public Account(String name, String id, String pass, String tel, String ssn) {
		super();
		this.name = name;
		this.id = id;
		this.pass = pass;
		this.tel = tel;
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", id=" + id + ", pass=" + pass + ", tel=" + tel + ", ssn=" + ssn
				+ ", balance=" + balance + ", money=" + money + "]";
	}

}
