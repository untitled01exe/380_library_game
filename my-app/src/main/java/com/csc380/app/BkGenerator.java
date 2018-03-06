package com.csc380.app;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class BkGenerator {
	public static ArrayList<Book> generator() throws FileNotFoundException {
		File sub = new File("Subjects.txt");
		File subsub = new File("SubSubjects.txt");
		Scanner kb = new Scanner(sub);
		Scanner sc = new Scanner(subsub);
		Random r = new Random();
		String title;
		Book book;
		boolean check = true;

		ArrayList<String> subjects = new ArrayList<String>();
		ArrayList<String> subsubjects = new ArrayList<String>();
		ArrayList<Book> books = new ArrayList<Book>();

		while(kb.hasNext()) {
			subjects.add(kb.nextLine());
		}

		while(sc.hasNext()) {
			subsubjects.add(sc.nextLine());
		}

		title = subjects.get(r.nextInt(subjects.size())) + subsubjects.get(r.nextInt(subsubjects.size()));
		book = new Book(title, "<Author>","<Bio>","<Call Number>", 0);
		System.out.println(book.getTitle());
		books.add(book);
		
		for(int i = 0; i < 50; i++) { //create book objects and add to books ArrayList
			title = subjects.get(r.nextInt(subjects.size())) + subsubjects.get(r.nextInt(subsubjects.size()));
			book = new Book(title, "<Author>","<Bio>","<Call Number>", i+1);
			System.out.println(book.getTitle());
	
			books.add(book);
		}
		
		return books;
		
	}
}


