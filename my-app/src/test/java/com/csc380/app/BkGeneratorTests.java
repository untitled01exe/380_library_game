package com.csc380.app;

import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class BkGeneratorTests extends TestCase {
	ArrayList<Book> books = new ArrayList<Book>();

	public void testArrayListCreation() throws FileNotFoundException{
		books = BkGenerator.generator();
		assertNotNull(books);
	}

	/*public void testArrayListFilled() {
		assertTrue(!books.isEmpty());
	}*/
}
		
