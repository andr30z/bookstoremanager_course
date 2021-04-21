package com.andreluiz.bookstoremanager.author.builder;

import com.andreluiz.bookstoremanager.author.dto.AuthorDTO;
import lombok.Builder;

@Builder
public class AuthorDTOBuilder {

    @Builder.Default
    private final Long id = 1L;

    @Builder.Default
    private final String name = "André Luiz";

    @Builder.Default
    private final Integer age = 32;


    public AuthorDTO buildAuthorDTO() {
        return new AuthorDTO(id, name, age);
    }

}
