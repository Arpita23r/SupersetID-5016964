package com.library.service;

import com.library.repositor.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void performService() {
        System.out.println("BookService is performing operations...");
        bookRepository.performRepositoryOperation();
    }
}
