package com.csc380.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class BookCreationTest extends TestCase
{
	Book book = new Book("title", "author", "bio", "Test001", 0);

	public void testCreation() {
		assertNotNull(book);
	}

	public void testTitle() {
		assertEquals(book.getTitle(), "title");
	}

	public void testAuthor() {
		assertEquals(book.getAuthor(), "author");
	}

	public void testBio() {
		assertEquals(book.getBio(), "bio");
	}

	public void testCallNum() {
		assertEquals(book.getCallNum(), "Test001");
	}

	public void testID() {
		assertEquals(book.getID(), 0);
	}
}
