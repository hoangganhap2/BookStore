package com.codegym.services;

import com.codegym.models.Author;
import com.codegym.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthorServiceImpl implements IAuthorService {
    @Autowired
    AuthorRepository authorRepository;

    @Override
    public Iterable<Author> findAllAuthor() {
        return authorRepository.findAll();
    }

    @Override
    public Optional<Author> findById(Long id) {
        return authorRepository.findById(id);
    }

    @Override
    public void save(Author author) {
        authorRepository.save(author);
    }

    @Override
    public void remote(Long id) {
    authorRepository.deleteById(id);
    }
}
