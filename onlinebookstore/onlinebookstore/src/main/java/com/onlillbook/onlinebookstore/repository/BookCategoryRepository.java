package com.onlillbook.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.onlillbook.onlinebookstore.entity.Book;
import com.onlillbook.onlinebookstore.entity.BookCatogery;

@RepositoryRestResource(collectionResourceRel ="bookCategory", path ="book-category")
public interface BookCategoryRepository extends JpaRepository<BookCatogery,Long>{

}