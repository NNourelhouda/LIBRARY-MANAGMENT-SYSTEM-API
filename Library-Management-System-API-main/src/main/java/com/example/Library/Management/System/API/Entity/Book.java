package com.example.Library.Management.System.API.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Book")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    private String title;

    @Temporal(TemporalType.DATE)
    private Date publicationDate;

    @ManyToOne
    private Author author;

    @OneToMany
    private List<Genre> genres = new ArrayList<>();
}
