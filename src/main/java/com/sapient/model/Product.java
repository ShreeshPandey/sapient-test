package com.sapient.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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

    @JsonIgnoreProperties("products")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(insertable = false)
    private Color color;

    @JsonIgnoreProperties("products")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(insertable = false)
    private ProductCategory productCategory;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getColorId() {
        return colorId;
    }

    public void setColorId(Integer colorId) {
        this.colorId = colorId;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    
    
    
    

}