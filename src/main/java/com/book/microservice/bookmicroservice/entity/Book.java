package com.book.microservice.bookmicroservice.entity;

import com.book.microservice.bookmicroservice.utils.DataSourceConstants;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = DataSourceConstants.BOOK, schema = DataSourceConstants.SCHEMA )

public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String type;
    private LocalDate yearOfPublication;
    private Integer stock;


}
