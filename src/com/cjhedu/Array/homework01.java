package com.cjhedu.Array;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author: phil
 * @ProjectName: javaXunlian08
 * @Date: 2021/3/26
 * 通过自定义排序的顺序打印出数组按照价格从大到小的排序结果
 */
public class homework01 {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("红楼梦",100);
        books[1] = new Book("金瓶梅",10);
        books[2] = new Book("亲年文摘",200);
        books[3] = new Book("java从入门到到放弃",300);

        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book book1 = (Book) o1;
                Book book2 = (Book) o2;
               double priceVal = book1.getPrice()-book2.getPrice();
               if (priceVal>0){
                   return -1;
               }else if(priceVal<0){
                   return 1;
               }else{
                   return 0;
               }

            }
        });
       for (Book book : books){
           System.out.println(book);
       }
    }

}
class Book{
    private String name;
    private double price;

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

    public void setPrice(double price) {
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