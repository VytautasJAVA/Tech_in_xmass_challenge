import java.time.LocalDate;

public class BorrowedBook {
    public enum Status {
        ACTIVE,
        RETURNED
    }

    private final int id;
    private final int bookId;
    private final int readerId;
    private final LocalDate loanDate;
    private LocalDate returnDate;
    private Status status;

    public BorrowedBook(int id, int bookId, int readerId, LocalDate loanDate) {
        this.id = id;
        this.bookId = bookId;
        this.readerId = readerId;
        this.loanDate = loanDate;
        this.status = Status.ACTIVE;
    }

    public int getId() {
        return id;
    }

    public int getBookId() {
        return bookId;
    }

    public int getReaderId() {
        return readerId;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "BorrowedBook{" +
                "id=" + id +
                ", bookId=" + bookId +
                ", readerId=" + readerId +
                ", loanDate=" + loanDate +
                ", returnDate=" + returnDate +
                ", status=" + status +
                '}';
    }
}