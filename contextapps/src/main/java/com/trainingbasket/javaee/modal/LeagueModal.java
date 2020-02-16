package com.trainingbasket.javaee.modal;

public class LeagueModal {
	static int tempID;
	private int id;
	private int year;
	private String season;
	private String title;

	public LeagueModal(int id, int year, String season, String title) {
		super();
		this.id = ++tempID;
		this.year = year;
		this.season = season;
		this.title = title;
	}

	public LeagueModal() {
		// TODO Auto-generated constructor stub
	}

	public int geId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "League [year=" + year + ", season=" + season + ", title=" + title + "]";
	}

//	@Override
//	public String toString() {
//		return "<td>" + year + "</td>" + "<td>" + season + "</td>" + "<td>" + title + "</td>";
//	}

}
