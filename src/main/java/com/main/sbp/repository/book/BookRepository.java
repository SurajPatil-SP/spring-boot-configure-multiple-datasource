package com.main.sbp.repository.book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.sbp.entity.book.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
