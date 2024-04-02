package com.book.microservice.bookmicroservice.service;

import com.book.microservice.bookmicroservice.model.BookDto;

import java.util.List;

public interface BookService {
    public List<BookDto> getAllBooks ();

    public BookDto getBookByTitle(String bookId);

    public BookDto insertBook(BookDto bookDto);

    public BookDto updateBook(BookDto bookDto);

    public void  deleteBook (Long bookId);
}
