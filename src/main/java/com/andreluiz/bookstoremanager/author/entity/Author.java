package com.andreluiz.bookstoremanager.author.entity;

import com.andreluiz.bookstoremanager.auditable.Auditable;
import com.andreluiz.bookstoremanager.books.entity.Book;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.List;

/**
 * @author andr3z0
 */
@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Author extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(columnDefinition = "integer default 0")
    private int age;

    @OneToMany(mappedBy = "author", fetch = FetchType.LAZY)
    private List<Book> books;

}
