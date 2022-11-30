package com.zetcode;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import java.io.File;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;

public class JavaWriteXmlJaxbEx {

	public static void main(String[] args) throws JAXBException {

		var bookList = new ArrayList<Book>();

		// create books
		var book1 = new Book();
		book1.setIsbn("978-0060554736");
		book1.setName("The Game");
		book1.setAuthor("Neil Strauss");
		book1.setPublisher("Harpercollins");
		bookList.add(book1);

		var book2 = new Book();
		book2.setIsbn("978-3832180577");
		book2.setName("Feuchtgebiete");
		book2.setAuthor("Charlotte Roche");
		book2.setPublisher("Dumont Buchverlag");
		bookList.add(book2);

		// create bookstore, assign books
		var bookstore = new BookStore();
		bookstore.setName("Fraport Bookstore");
		bookstore.setLocation("Livres belles");
		bookstore.setBookList(bookList);

		// create JAXB context and instantiate marshaller
		JAXBContext context = JAXBContext.newInstance(BookStore.class);
		var m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		StringWriter builder = new StringWriter();
		// Write to System.out
		m.marshal(bookstore, builder);
		System.out.println("*************" + builder.toString());
		Unmarshaller jaxbUnmarshaller = context.createUnmarshaller();
		StringReader reader = new StringReader(builder.toString());
		BookStore bookStore2 = (BookStore) jaxbUnmarshaller.unmarshal(reader);
		System.out.println("unmarshellinmg*********************");
		System.out.println(bookStore2);
		// Write to File

	}
}