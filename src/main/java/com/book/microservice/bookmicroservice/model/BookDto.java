package com.book.microservice.bookmicroservice.model;

import com.book.microservice.bookmicroservice.entity.Author;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class BookDto {

        private Long bookId;
        private String title;
        private String type;
        private LocalDate yearOfPublication;
        private Integer stock;
        private Author author;


}
