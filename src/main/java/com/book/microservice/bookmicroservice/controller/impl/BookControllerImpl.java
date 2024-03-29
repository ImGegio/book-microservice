package com.book.microservice.bookmicroservice.controller.impl;

import com.book.microservice.bookmicroservice.controller.BookController;
import com.book.microservice.bookmicroservice.model.BookDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController("/book")
public class BookControllerImpl implements BookController {

    @Override
    public ResponseEntity<List<BookDto>> getAllBooks() {
        return null;
    }

    @Override
    public ResponseEntity<BookDto> getBookById(Long bookId) {
        return null;
    }

    @Override
    public ResponseEntity<BookDto> insertBook(BookDto bookDto) {
        return null;
    }

    @Override
    public ResponseEntity<BookDto> updateBook(BookDto bookDto) {
        return null;
    }

    @Override
    public void deleteBook(Long bookId) {
    }
}
