package com.shmily;

import com.shmily.domain.Book;
import com.shmily.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootAllApplicationTests {

    @Autowired
    private BookService bookService;

    @Test
    void contextLoads() {
        Book book = bookService.getById(2);
        System.out.println(book);

    }

}
