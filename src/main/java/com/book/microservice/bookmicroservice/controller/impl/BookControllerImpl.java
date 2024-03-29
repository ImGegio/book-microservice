package com.book.microservice.bookmicroservice.controller.impl;

import com.book.microservice.bookmicroservice.controller.BookController;
import com.book.microservice.bookmicroservice.model.BookDto;
import com.book.microservice.bookmicroservice.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController("/book")
public class BookControllerImpl implements BookController {

    @Autowired
    private BookService bookService;

    @Override
    public ResponseEntity<List<BookDto>> getAllBooks() {
        return new ResponseEntity<>(bookService.getAllBooks(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<BookDto> getBookById(Long bookId) {
        return new ResponseEntity<>(bookService.getBookById(bookId), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<BookDto> insertBook(BookDto bookDto) {
        return new ResponseEntity<>(bookService.insertBook(bookDto), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<BookDto> updateBook(BookDto bookDto) {
        return new ResponseEntity<>(bookService.updateBook(bookDto), HttpStatus.OK);
    }

    @Override
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBook(Long bookId) {
        bookService.deleteBook(bookId);
    }
}
