package com.book.microservice.bookmicroservice.service;

import com.book.microservice.bookmicroservice.model.BookDto;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface BookService {
    public List<BookDto> getAllBooks ();

    public BookDto getBookById(Long bookId);

    public BookDto insertBook(BookDto bookDto);

    public BookDto updateBook(BookDto bookDto);

    public void  deleteBook (Long bookId);
}
