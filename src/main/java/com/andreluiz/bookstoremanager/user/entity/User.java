package com.andreluiz.bookstoremanager.user.entity;

import com.andreluiz.bookstoremanager.auditable.Auditable;
import com.andreluiz.bookstoremanager.books.entity.Book;
import com.andreluiz.bookstoremanager.user.entity.enums.Gender;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
public class User extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int age;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private Gender gender;

    @Column(nullable = false, unique = true, length = 100)
    private String email;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, columnDefinition = "TIMESTAMP")
    private LocalDate birthDate;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Book> books;
}