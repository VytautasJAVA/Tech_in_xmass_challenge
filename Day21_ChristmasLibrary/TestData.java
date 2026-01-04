//separated test data to keep the logic clean

import java.time.LocalDate;

public class TestData {

    public static void load(LibraryManager manager) {

        manager.addBook(new LibraryBook(1, "Clean Code", "Robert C. Martin", 2));
        manager.addBook(new LibraryBook(2, "The Pragmatic Programmer", "Andrew Hunt", 1));
        manager.addBook(new LibraryBook(3, "Refactoring", "Martin Fowler", 1));

        manager.registerReader(new Reader(1, "Alice", 2));
        manager.registerReader(new Reader(2, "Bob", 1));

        LocalDate today = LocalDate.now();

        //alice borrows Clean Code
        try {
            manager.borrowBook(1, 1, today);
            System.out.println("BORROW OK: Alice borrowed \"Clean Code\"");
        } catch (Exception e) {
            System.out.println("BORROW FAILED: Alice could not borrow \"Clean Code\" (" + e.getMessage() + ")");
        }

        //alice borrows Clean Code again
        try {
            manager.borrowBook(1, 1, today);
            System.out.println("BORROW OK: Alice borrowed \"Clean Code\"");
        } catch (Exception e) {
            System.out.println("BORROW FAILED: Alice could not borrow \"Clean Code\" (" + e.getMessage() + ")");
        }

        //bob tries to borrow Clean Code(fails)
        try {
            manager.borrowBook(2, 1, today);
            System.out.println("BORROW OK: Bob borrowed \"Clean Code\"");
        } catch (Exception e) {
            System.out.println("BORROW FAILED: Bob cannot borrow \"Clean Code\" (no copies available)");
        }

        //alice returns one copy
        int loanIdToReturn = manager.getActiveLoans().stream()
                .filter(l -> l.getReaderId() == 1 && l.getBookId() == 1)
                .findFirst()
                .get()
                .getId();

        manager.returnBook(loanIdToReturn, today);
        System.out.println("RETURN OK: \"Clean Code\" returned by Alice\n");
    }
}
