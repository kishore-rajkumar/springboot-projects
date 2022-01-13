package com.kishore.springboot.projects;

public interface BookRepository {

  Book getByIsbn(String isbn);

}