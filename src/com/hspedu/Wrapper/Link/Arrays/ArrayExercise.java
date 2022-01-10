package com.hspedu.Wrapper.Link.Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayExercise {
    public static void main(String[] args) {
        Book[] book = new Book[4];
        book[0] = new Book("红楼梦", 100);
        book[1] = new Book("金瓶梅1", 90);
        book[2] = new Book("青年文摘2", 5);
        book[3] = new Book("Java教程", 300);

        bubble_(book, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                double book1 = (double)o1;
                double book2 = (double)o2;
                return (int)(book2-book1);
            }
        });


//        Arrays.sort(book, new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                Book book1 = (Book)o1;
//                Book book2 = (Book)o2;
//                double priceVal =  book1.getPrice()-book2.getPrice();
//                if(priceVal >0){
//                    return 1;
//                }else if(priceVal <0){
//                    return -1;
//                }else {
//                    return 0;
//                }
//            }
//        });
        Arrays.sort(book, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book book1 = (Book)o1;
                Book book2 = (Book)o2;
                return book1.getName().length() - book2.getName().length();
                //return book2.getName().compareTo(book1.getName());
            }
        });
        System.out.println(Arrays.toString(book));

    }

    public static void bubble_(Book[] books, Comparator c) {
        Book temp;
        for (int i = 0; i < books.length; i++) {
            for (int j = 0; j < books.length - i - 1; j++) {
                if (books[j+1] == null) {
                    return;
                }
                if (c.compare(books[j].getPrice(),books[j+1].getPrice())>0) {
                    temp = books[j + 1];
                    books[j + 1] = books[j];
                    books[j] = temp;
                }
            }
        }
    }
}

class Book {
    private String name;
    private double price;

    public Book() {
    }

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

