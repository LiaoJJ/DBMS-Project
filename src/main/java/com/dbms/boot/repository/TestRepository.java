package com.dbms.boot.repository;

import com.dbms.boot.domain.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TestRepository extends JpaRepository<Country,String> {

    @Query(value = "SELECT * FROM Country WHERE Population > 100000000", nativeQuery = true)
    List<Country> findLargeCountry();
}
