package com.book.microservice.bookmicroservice.service.impl;

import com.book.microservice.bookmicroservice.entity.Book;
import com.book.microservice.bookmicroservice.mapper.BookMapper;
import com.book.microservice.bookmicroservice.model.BookDto;
import com.book.microservice.bookmicroservice.repository.BookRepository;
import com.book.microservice.bookmicroservice.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BookMapper bookMapper;

    /**
     * @return a list of all books
     */
    @Override
    public List<BookDto> getAllBooks() {
        return bookMapper.toDto(bookRepository.findAll());
    }

    /**
     * @param title of book to search
     * @return book by title
     */
    @Override
    public BookDto getBookByTitle(String title) {
        Book book = bookRepository.findByTitle(title);

        return bookMapper.toDto(book);
    }

    /**
     * @param bookDto
     * @return an instance ok book inserted
     */
    @Override
    public BookDto insertBook(BookDto bookDto) {
        Book savedBook = bookRepository.save(bookMapper.toEntity(bookDto));
        return bookMapper.toDto(savedBook);
    }

    /**
     * @param bookDto
     * @return an instance ok book updated
     */
    @Override
    public BookDto updateBook(BookDto bookDto) {
        Book updatedBook = bookRepository.save(bookMapper.toEntity(bookDto));
        return bookMapper.toDto(updatedBook);
    }

    /**
     * @param bookId of book to delete
     */
    @Override
    public void deleteBook(Long bookId) {
        Optional<Book> optional = bookRepository.findById(bookId);
        Book book = optional.orElse(null);

        bookRepository.delete(Objects.requireNonNull(book));

    }
}
