package com.infinum.bookpublisher.DAO;

import com.infinum.bookpublisher.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
    Optional<Author> findAuthorById(long id);
    List<Author> findAuthorByLastNameOrderByNumberOfPublishedBooksDesc(String lastname);
    List<Author> findAuthorByNameOrderByNumberOfPublishedBooksDesc(String name);
    List<Author> findByOrderById();

}
