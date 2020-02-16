package com.trainingbasket.javaee.modal;

public class Player {
	String name;
	MyDate dob;
	String contact;
	String address;
	String email;
	String gender;
	LeagueModal league;

	public LeagueModal getLeague() {
		return league;
	}

	public void setLeague(LeagueModal league) {
		this.league = league;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MyDate getDob() {
		return dob;
	}

	public void setDob(MyDate dob) {
		this.dob = dob;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Player() {

	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", dob=" + dob + ", contact=" + contact + ", address=" + address + ", email="
				+ email + ", gender=" + gender + ", league=" + league + "]";
	}

}
