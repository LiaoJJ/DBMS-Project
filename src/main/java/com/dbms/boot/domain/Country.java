package com.dbms.boot.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Data
public class Country {

    @Id
    private String CODE;

    private String NAME;

    private String CAPITAL;

    private String PROVINCE;

    private BigDecimal AREA;

    private BigDecimal POPULATION;
}
