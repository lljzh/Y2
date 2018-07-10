package com.sz.entity;

public class book {
    private Integer id;
    private String isbn;
    private String name;
    private float price;

    @Override
    public String toString() {
        return "book{" +
                "id=" + id +
                ", isbn='" + isbn + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", publisher='" + publisher + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    private float discount;
    private String publisher;
}
