import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class LibraryManager {

    private Map<Integer, LibraryBook> books = new HashMap<>();
    private Map<Integer, Reader> readers = new HashMap<>();
    private Map<Integer, BorrowedBook> loans = new HashMap<>();

    private int nextLoanId = 1;

    public void addBook(LibraryBook book) {
        books.put(book.getId(), book);
    }

    public void registerReader(Reader reader) {
        readers.put(reader.getId(), reader);
    }

    public BorrowedBook borrowBook(int readerId, int bookId, LocalDate date) {

        LibraryBook book = books.get(bookId);
        Reader reader = readers.get(readerId);

        if (book == null)
            throw new IllegalArgumentException("Book with ID " + bookId + " does not exist");

        if (reader == null)
            throw new IllegalArgumentException("Reader with ID " + readerId + " does not exist");

        if (!book.isAvailable())
            throw new IllegalStateException("No available copies of " + book.getTitle());

        if (!reader.canBorrow())
            throw new IllegalStateException("Reader " + reader.getName() + " reached borrow limit");

        book.borrowOne();
        reader.addBorrowedBookId(bookId);

        BorrowedBook loan = new BorrowedBook(nextLoanId++, bookId, readerId, date);
        loans.put(loan.getId(), loan);

        return loan;
    }

    public void returnBook(int loanId, LocalDate date) {
        BorrowedBook loan = loans.get(loanId);

        if (loan == null)
            throw new IllegalArgumentException("Loan with ID " + loanId + " does not exist");

        if (loan.getStatus() == BorrowedBook.Status.RETURNED)
            throw new IllegalStateException("Loan already returned");

        LibraryBook book = books.get(loan.getBookId());
        Reader reader = readers.get(loan.getReaderId());

        book.returnOne();
        reader.removeBorrowedBookId(book.getId());

        loan.setReturnDate(date);
        loan.setStatus(BorrowedBook.Status.RETURNED);
    }

    public List<BorrowedBook> getActiveLoans() {
        return loans.values().stream()
                .filter(l -> l.getStatus() == BorrowedBook.Status.ACTIVE)
                .collect(Collectors.toList());
    }

    public void printChristmasReport() {

    System.out.println("CHRISTMAS LIBRARY REPORT");
    books.values().forEach(book -> {
        System.out.println(book.getTitle() + ": " +
                book.getAvailableCopies() + " / " + book.getTotalCopies() + " available");
    });

    System.out.println("\nACTIVE LOANS");

    for (BorrowedBook loan : getActiveLoans()) {
        Reader r = readers.get(loan.getReaderId());
        LibraryBook b = books.get(loan.getBookId());
        System.out.println(r.getName() + " - " + b.getTitle());
    }
}

}
