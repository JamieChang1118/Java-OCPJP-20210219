package com.ocp.day08;

public class BuyBook {
    public static void main(String[] args) {
        // 取得出版社名?
        // 類別成員不是物件，所以不用 new
        System.out.println(Book.getPublish());
        Book b = new Book(100);
        System.out.println(b.getPages());
        System.out.println(new Book(200).getPages());
    }
}
