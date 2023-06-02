package com.akulik.usecase;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class BatchServiceTest {

    private final BatchService batchService = new BatchService();

    @Test
    void testSplitIntoBatches() {
        final List<Book> books = List.of(
                new Book("\"The Great Gatsby\" by F. Scott Fitzgerald"),
                new Book("\"To Kill a Mockingbird\" by Harper Lee"),
                new Book("\"1984\" by George Orwell"),
                new Book("\"Pride and Prejudice\" by Jane Austen"),
                new Book("\"The Catcher in the Rye\" by J.D. Salinger"),
                new Book("\"Moby-Dick\" by Herman Melville"),
                new Book("\"The Lord of the Rings\" by J.R.R. Tolkien"),
                new Book("\"Harry Potter and the Philosopher's Stone\" by J.K. Rowling"),
                new Book("\"The Chronicles of Narnia\" by C.S. Lewis"),
                new Book("\"The Hobbit\" by J.R.R. Tolkien"),
                // 10
                new Book("\"The Da Vinci Code\" by Dan Brown"),
                new Book("\"To the Lighthouse\" by Virginia Woolf"),
                new Book("\"Brave New World\" by Aldous Huxley"),
                new Book("\"The Odyssey\" by Homer"),
                new Book("\"The Grapes of Wrath\" by John Steinbeck"),
                new Book("\"Jane Eyre\" by Charlotte Brontë"),
                new Book("\"Fahrenheit 451\" by Ray Bradbury"),
                new Book("\"The Divine Comedy\" by Dante Alighieri"),
                new Book("\"War and Peace\" by Leo Tolstoy"),
                new Book("\"The Great Expectations\" by Charles Dickens"),
                // 20
                new Book("\"The Adventures of Huckleberry Finn\" by Mark Twain"),
                new Book("\"Crime and Punishment\" by Fyodor Dostoevsky"),
                new Book("\"Gone with the Wind\" by Margaret Mitchell"),
                new Book("\"The Picture of Dorian Gray\" by Oscar Wilde"),
                new Book("\"One Hundred Years of Solitude\" by Gabriel García Márquez"),
                new Book("\"The Alchemist\" by Paulo Coelho"),
                new Book("\"The Kite Runner\" by Khaled Hosseini"),
                new Book("\"A Game of Thrones\" by George R.R. Martin"),
                new Book("\"The Hunger Games\" by Suzanne Collins"),
                new Book("\"The Fault in Our Stars\" by John Green"),
                new Book("\"The Handmaid's Tale\" by Margaret Atwood"),
                new Book("\"Sapiens: A Brief History of Humankind\" by Yuval Noah Harari"),
                new Book("\"The Girl on the Train\" by Paula Hawkins")
                // 33
        );

        final List<List<Book>> batches = batchService.splitIntoBatches(books, 10);

        final List<List<Book>> expectedResult = List.of(
                List.of(
                        new Book("\"The Great Gatsby\" by F. Scott Fitzgerald"),
                        new Book("\"To Kill a Mockingbird\" by Harper Lee"),
                        new Book("\"1984\" by George Orwell"),
                        new Book("\"Pride and Prejudice\" by Jane Austen"),
                        new Book("\"The Catcher in the Rye\" by J.D. Salinger"),
                        new Book("\"Moby-Dick\" by Herman Melville"),
                        new Book("\"The Lord of the Rings\" by J.R.R. Tolkien"),
                        new Book("\"Harry Potter and the Philosopher's Stone\" by J.K. Rowling"),
                        new Book("\"The Chronicles of Narnia\" by C.S. Lewis"),
                        new Book("\"The Hobbit\" by J.R.R. Tolkien")
                ),
                List.of(
                        new Book("\"The Da Vinci Code\" by Dan Brown"),
                        new Book("\"To the Lighthouse\" by Virginia Woolf"),
                        new Book("\"Brave New World\" by Aldous Huxley"),
                        new Book("\"The Odyssey\" by Homer"),
                        new Book("\"The Grapes of Wrath\" by John Steinbeck"),
                        new Book("\"Jane Eyre\" by Charlotte Brontë"),
                        new Book("\"Fahrenheit 451\" by Ray Bradbury"),
                        new Book("\"The Divine Comedy\" by Dante Alighieri"),
                        new Book("\"War and Peace\" by Leo Tolstoy"),
                        new Book("\"The Great Expectations\" by Charles Dickens")
                ),
                List.of(
                        new Book("\"The Adventures of Huckleberry Finn\" by Mark Twain"),
                        new Book("\"Crime and Punishment\" by Fyodor Dostoevsky"),
                        new Book("\"Gone with the Wind\" by Margaret Mitchell"),
                        new Book("\"The Picture of Dorian Gray\" by Oscar Wilde"),
                        new Book("\"One Hundred Years of Solitude\" by Gabriel García Márquez"),
                        new Book("\"The Alchemist\" by Paulo Coelho"),
                        new Book("\"The Kite Runner\" by Khaled Hosseini"),
                        new Book("\"A Game of Thrones\" by George R.R. Martin"),
                        new Book("\"The Hunger Games\" by Suzanne Collins"),
                        new Book("\"The Fault in Our Stars\" by John Green")
                ),
                List.of(
                        new Book("\"The Handmaid's Tale\" by Margaret Atwood"),
                        new Book("\"Sapiens: A Brief History of Humankind\" by Yuval Noah Harari"),
                        new Book("\"The Girl on the Train\" by Paula Hawkins")
                ));
        assertThat(batches).isEqualTo(expectedResult).hasSize(4);
    }
}