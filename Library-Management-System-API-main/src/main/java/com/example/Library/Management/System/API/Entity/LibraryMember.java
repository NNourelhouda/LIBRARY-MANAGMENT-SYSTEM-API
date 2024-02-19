package com.example.Library.Management.System.API.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "LibraryMember")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LibraryMember {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    private String name;

    private int telephone;
    private String email;


    @OneToMany(mappedBy = "borrower")
    private List<Book> books=new ArrayList<>();
    }


