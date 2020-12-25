package com.sapient.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="B2C_PRDT")
public class Product{

    @Id
    private Integer id;
    private String name;
    private Integer quantity;

    @Column(name="BRND_ID")
    private Integer brandId;

    @Column(name="CLR_ID")
    private Integer colorId;

    @Column(name="PRDCT_CTGR_ID")
    private Integer categoryId;

    @JsonIgnoreProperties("products")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(insertable = false)
    private Brand brand;

    private ProductCategory productCategory;

}