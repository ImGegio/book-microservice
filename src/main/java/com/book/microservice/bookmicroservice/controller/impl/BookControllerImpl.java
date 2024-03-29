package com.book.microservice.bookmicroservice.controller.impl;

import com.book.microservice.bookmicroservice.controller.BookController;
import com.book.microservice.bookmicroservice.model.BookDto;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController("/book")
public class BookControllerImpl implements BookController {

    @Override
    public List<BookDto> getAllCarRide() {
        List<BookDto> bookDtos = new ArrayList<>();
        BookDto dto = new BookDto();
        dto.setTitle("Prova");
        bookDtos.add(dto);

        return bookDtos;
    }
}
