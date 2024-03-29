package com.book.microservice.bookmicroservice.controller;

import com.book.microservice.bookmicroservice.model.BookDto;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RequestMapping("/book")
public interface BookController {

    @GetMapping(value = "/book-get-all", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<BookDto>> getAllBooks ();

    @GetMapping(value = "/{bookId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BookDto> getBookById(@PathVariable("bookId") Long bookId);

    @PostMapping(value = "/insert-book", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BookDto> insertBook(@RequestBody BookDto bookDto);

    @PutMapping(value = "/update-book", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BookDto> updateBook(@RequestBody BookDto bookDto);

    @DeleteMapping(value = "/{bookId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void deleteBook (@PathVariable("bookId") Long bookId);

}
