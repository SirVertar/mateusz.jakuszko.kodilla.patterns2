package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void calculateMedianTest() {
        //Given
        Book book1 = new Book("Tolkien", "Hobbit", 1990, "321321321");
        Book book2 = new Book("Tolkien", "Lord Of the Rings", 1995, "42342342");
        Book book3 = new Book("Tolkien", "Hobbit", 2000, "654354");
        Book book4 = new Book("Tolkien", "Hobbit", 1990, "42345654");
        Book book5 = new Book("Tolkien", "Lord Of the Rings", 1995, "578578");
        Book book6 = new Book("Tolkien", "Hobbit", 2000, "654654");
        Set<Book> bookSet = new HashSet<>(Arrays.asList(book1, book2, book3, book4, book5, book6));
        //When
        MedianAdapter medianAdapter = new MedianAdapter();
        //Then
        assertEquals(1995, medianAdapter.publicationYearMedian(bookSet));
    }
}
