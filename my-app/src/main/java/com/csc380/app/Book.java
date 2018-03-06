package com.csc380.app;
public class Book {
	
	private String title;
	private String author;
	private String bio;
	private String callNum;
	private int itemID;

	public Book (String t, String a, String b, String cn, int id) {
		title = t;
		author = a;
		bio = b;
		callNum = cn;
		itemID = id;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getBio() {
		return bio;
	}
	
	public String getCallNum() {
		return callNum;
	}

	public int getID() {
		return itemID;
	}
}
