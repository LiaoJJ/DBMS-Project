package com.dbms.boot.service;

import com.dbms.boot.domain.Country;
import com.dbms.boot.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TestService {

    @Autowired
    private TestRepository repository;

    @Transactional
    public Country test1(String id) {
        System.out.println("This is test1 service");
        Country c = repository.findById(id).orElse(null);
        return c;
    }

    @Transactional
    public List<Country> test2() {
        return repository.findLargeCountry();
    }
}
