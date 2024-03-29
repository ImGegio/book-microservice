package com.book.microservice.bookmicroservice.controller;

import com.book.microservice.bookmicroservice.model.BookDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequestMapping("/book")
public interface BookController {

    @GetMapping(value = "/book-get-all", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<BookDto> getAllCarRide ();

}
