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
		books.add(book);
		
		for(int i = 0; i < 100; i++) { //create book objects and add to books ArrayList
			title = subjects.get(r.nextInt(subjects.size())) + subsubjects.get(r.nextInt(subsubjects.size()));
			book = new Book(title, "<Author>","<Bio>","<Call Number>", i+1);
			
			/*for(int j = 0; j < books.size(); j++) { //check for repeats
				if(title.equals(books.get(j).getTitle())) {
					check = false;
					i--;
					System.out.println("Check was false");
					
				}
			}
			if(check) {
				books.add(book);
				System.out.println(books.get(i).getTitle());
			}
			check = true;*/
			
			books.add(book);
			System.out.println(books.get(i).toString());
		}
		
		return books;
		
	}
}


