package backendGameProject.entities;

import backendGameProject.abstracts.Entity;

public class Player implements Entity {
	
	private int id;
	private String firstName;
	private String lastName;
	private String nationalityId;
	private int yearOfBirth;
	private String userName;
	private String password;
	private String accountNumber;
	
	public Player() {}

	public Player(int id, String firstName, String lastName, String nationalityId, int yearOfBirth, String userName,
			String password, String accountNumber) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
		this.yearOfBirth = yearOfBirth;
		this.userName = userName;
		this.password = password;
		this.accountNumber = accountNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	
	
}
