package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {

    @Test
    void addTest() {
        Book bookAAA = new Book(1, "AAA", 1000, "ABT1");
        Book bookBBB = new Book(3, "BBB", 500, "ABT1");
        Book bookCCC = new Book(11, "CCC", 1000, "ABT2");
        Book bookAAB = new Book(13, "AAA", 10000, "ABT3");
        Smartphone smartphone001 = new Smartphone(2, "A01", 5000, "A1");
        Smartphone smartphone002 = new Smartphone(4, "A02", 6000, "A2");
        Smartphone smartphone012 = new Smartphone(6, "A02", 5000, "A1");
        Smartphone smartphone022 = new Smartphone(8, "A03", 11000, "A5");
        Manager manager = new Manager();

        manager.add(bookAAA);
        manager.add(bookBBB);
        manager.add(bookCCC);
        manager.add(bookAAB);
        manager.add(smartphone001);
        manager.add(smartphone002);
        manager.add(smartphone012);
        manager.add(smartphone022);

        Product[] actual = manager.findAll();
        Product[] expected = {bookAAA, bookBBB, bookCCC, bookAAB, smartphone001, smartphone002, smartphone012, smartphone022};
        assertArrayEquals(expected, actual);


    }

    @Test
    void searchByTest() {
        Book bookAAA = new Book(1, "AAA", 1000, "ABT1");
        Book bookBBB = new Book(3, "BBB", 500, "ABT1");
        Book bookCCC = new Book(11, "CCC", 1000, "ABT2");
        Book bookAAB = new Book(13, "AAA", 10000, "ABT3");
        Smartphone smartphone001 = new Smartphone(2, "A01", 5000, "A1");
        Smartphone smartphone002 = new Smartphone(4, "A02", 6000, "A2");
        Smartphone smartphone012 = new Smartphone(6, "A02", 5000, "A1");
        Smartphone smartphone022 = new Smartphone(8, "A03", 11000, "A5");
        Manager manager = new Manager();

        manager.add(bookAAA);
        manager.add(bookBBB);
        manager.add(bookCCC);
        manager.add(bookAAB);
        manager.add(smartphone001);
        manager.add(smartphone002);
        manager.add(smartphone012);
        manager.add(smartphone022);

        Product[] actual = manager.searchBy("AA");
        Product[] expected = {bookAAA, bookAAB};
        assertArrayEquals(expected, actual);
    }

    @Test
    void dall() {
        Book bookAAA = new Book(1, "AAA", 1000, "ABT1");
        Book bookBBB = new Book(3, "BBB", 500, "ABT1");
        Book bookCCC = new Book(11, "CCC", 1000, "ABT2");
        Book bookAAB = new Book(13, "AAA", 10000, "ABT3");
        Smartphone smartphone001 = new Smartphone(2, "A01", 5000, "A1");
        Smartphone smartphone002 = new Smartphone(4, "A02", 6000, "A2");
        Smartphone smartphone012 = new Smartphone(6, "A02", 5000, "A1");
        Smartphone smartphone022 = new Smartphone(8, "A03", 11000, "A5");
        Manager manager = new Manager();

        manager.add(bookAAA);
        manager.add(bookBBB);
        manager.add(bookCCC);
        manager.add(bookAAB);
        manager.add(smartphone001);
        manager.add(smartphone002);
        manager.add(smartphone012);
        manager.add(smartphone022);

        manager.dall(2);

        Product[] actual = manager.findAll();
        Product[] expected = {bookAAA, bookBBB, bookCCC, bookAAB, smartphone002, smartphone012, smartphone022};
        assertArrayEquals(expected, actual);
    }
}