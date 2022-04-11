package edu.miu.cs.cs425.fairfieldlibrarydbcliapp;

import edu.miu.cs.cs425.fairfieldlibrarydbcliapp.model.Book;
import edu.miu.cs.cs425.fairfieldlibrarydbcliapp.model.PrimaryAddress;
import edu.miu.cs.cs425.fairfieldlibrarydbcliapp.model.Publisher;
import edu.miu.cs.cs425.fairfieldlibrarydbcliapp.repository.PublisherRepository;
import edu.miu.cs.cs425.fairfieldlibrarydbcliapp.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class FairfieldlibrarydbcliappApplication implements CommandLineRunner {

    private BookService bookService;
    @Autowired
    private PublisherRepository publisherRepository;

    @Autowired
    public FairfieldlibrarydbcliappApplication(@Qualifier("bookServiceImpl") BookService bookService){
        this.bookService =bookService;
    }

    public static void main(String[] args) {
        SpringApplication.run(FairfieldlibrarydbcliappApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello SpringBoot!!!");

//        Book newBook1 = new Book(null, "978-0001", "SpringBoot In Action", LocalDate.of(2021, 11, 25), 120);
//        var savedBook1 = bookService.addNewBook(newBook1);
//        System.out.println(savedBook1);
//        Book newBook2 = new Book(null, "978-0002", "Algorithms", LocalDate.of(2019, 5, 9), 204);
//        var savedBook2 = bookService.addNewBook(newBook2);
//        System.out.println(savedBook2);
//
//        var books = bookService.getAllBooks();
//        books.forEach(System.out::println);

        // Find by BookId
//        var book = bookService.getBookById(1);
//        System.out.println(book);

        // Update Book by bookId
        var book = bookService.updateBookById(1);
        System.out.println(book);

        var pAddr = new PrimaryAddress(null, "20 N street", "New York", "NY", "10012", null);
        var apress = new Publisher(null, "Apress", pAddr);
        pAddr.setPublisher(apress);

        var savedPub = publisherRepository.save(apress);

    }

}
