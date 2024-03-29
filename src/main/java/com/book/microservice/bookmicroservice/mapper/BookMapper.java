package com.book.microservice.bookmicroservice.mapper;

import com.book.microservice.bookmicroservice.entity.Book;
import com.book.microservice.bookmicroservice.model.BookDto;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Component
public class BookMapper {

    /**
     * @return a Book from a BookDto
     */
    public Book toEntity(BookDto dto) {
        Book entity = new Book();
        BeanUtils.copyProperties(dto, entity);
        return entity;
    }

    /**
     * @return a BookDto from a Book
     */
    public BookDto toDto(Book entity) {
        BookDto dto = new BookDto();

        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

    /**
     * @return a list of Book from a BookDtoList
     */
    public List<Book> toEntity(List<BookDto> dto) {
        List<Book> entity = new ArrayList<>();
        for (BookDto current : dto) {
            entity.add(toEntity(current)) ;
        }
        return entity;
    }

    /**
     * @return a BookDtoList from a list of Book
     */
    public List<BookDto> toDto(List<Book> entity) {
        List<BookDto> dto = new ArrayList<>();
        for (Book current : entity) {
            dto.add(toDto(current)) ;
        }
        return dto;
    }

    /**
     * @return a BookDto from an Optional<Book>
     */
    public BookDto optionalToDto(Optional<Book> optional) {
        return toDto(optional.orElse(null));
    }
}
