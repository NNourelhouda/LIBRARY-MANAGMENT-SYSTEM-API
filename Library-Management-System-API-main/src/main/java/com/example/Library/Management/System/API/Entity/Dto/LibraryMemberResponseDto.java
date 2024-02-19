package com.example.Library.Management.System.API.Entity.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LibraryMemberResponseDto {
    private Long id;
    private String name;
    private int telephone;
    private String email;

}
