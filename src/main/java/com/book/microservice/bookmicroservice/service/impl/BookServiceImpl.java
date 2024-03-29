package com.book.microservice.bookmicroservice.service.impl;

import com.book.microservice.bookmicroservice.model.BookDto;
import com.book.microservice.bookmicroservice.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    /**
     * @return
     */
    @Override
    public List<BookDto> getAllBooks() {
        return null;
    }

    /**
     * @param bookId
     * @return
     */
    @Override
    public BookDto getBookById(Long bookId) {
        return null;
    }

    /**
     * @param bookDto
     * @return
     */
    @Override
    public BookDto insertBook(BookDto bookDto) {
        return null;
    }

    /**
     * @param bookDto
     * @return
     */
    @Override
    public BookDto updateBook(BookDto bookDto) {
        return null;
    }

    /**
     * @param bookId
     */
    @Override
    public void deleteBook(Long bookId) {

    }
}
