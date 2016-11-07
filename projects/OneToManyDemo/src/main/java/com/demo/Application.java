package com.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Hue on 10/28/2016.
 */
@SpringBootApplication
public class Application { //implements CommandLineRunner {
//    private static final Logger logger = LoggerFactory.getLogger(Application.class);
//
//    @Autowired
//    private BookReponsitory bookRepository;
//
//    @Autowired
//    private PublisherRepository publisherRepository;
//
//    @Autowired
//    private BookCategoryReponsitory bookCategoryRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

//    @Override
//    @Transactional
//    public void run(String... strings) throws Exception {

       // bookCategoryRepository.delete(23);

//        BookCategory categoryA = new BookCategory("Category A");
//        Set bookAs = new HashSet<Book>(){{
//            add(new Book("Book A1", categoryA));
//            add(new Book("Book A2", categoryA));
//            add(new Book("Book A3", categoryA));
//        }};
//        categoryA.setBooks(bookAs);

//        BookCategory categoryB = new BookCategory("Category B");
//        Set bookBs = new HashSet<Book>(){{
//            add(new Book("Book B1", categoryB));
//            add(new Book("Book B2", categoryB));
//            add(new Book("Book B3", categoryB));
//        }};
//        categoryB.setBooks(bookBs);

//        bookCategoryRepository.save(categoryA);

//        bookCategoryRepository.save(new HashSet<BookCategory>() {{
//            add(categoryA);
//            add(categoryB);
//        }});

        // save a couple of books
//        Publisher publisherA = new Publisher("Publisher A");
//        Publisher publisherB = new Publisher("Publisher B");
//        Publisher publisherC = new Publisher("Publisher C");

//        bookRepository.save(new HashSet<Book>() {
//                                {
//                                    add(new Book("Book A", categoryA, new HashSet<Publisher>() {{
//                                        add(publisherA);
//                                        add(publisherB);
//                                    }}));

//
//            add(new Book("Book B", categoryB, new HashSet<Publisher>(){{
//                add(publisherA);
//                add(publisherC);
//            }}));
//        }});
//
//        // fetch all books

//        logger.info("\n-------------------------------------------\n");
//        for(Book book : bookRepository.findAll()) {
//            logger.info(book.getName() + "\n");
//        }
//
//        // save a couple of publishers
//        Book bookA = new Book("Book A");
//        Book bookB = new Book("Book B");
//
//        publisherRepository.save(new HashSet<Publisher>() {{
//            add(new Publisher("Publisher A", new HashSet<Book>() {{
//                add(bookA);
//                add(bookB);
//            }}));
//
//            add(new Publisher("Publisher B", new HashSet<Book>() {{
//                add(bookA);
//                add(bookB);
//            }}));
//        }});

//
                // fetch all publishers
//                for (Publisher publisher :publisherRepository.findAll()) {
//                    logger.info(publisher.toString());
//                }


//        for (Book publisher :bookRepository.findAll()) {
//                    logger.info(publisher);
//                }
//    }
}