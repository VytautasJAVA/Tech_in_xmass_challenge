import java.util.HashSet;
import java.util.Set;

public class Reader {
    private final int id;
    private String name;
    private int borrowLimit;
    private Set<Integer> borrowedBookIds;

    public Reader(int id, String name, int borrowLimit) {
        this.id = id;
        this.name = name;
        this.borrowLimit = borrowLimit;
        this.borrowedBookIds = new HashSet<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBorrowLimit() {
        return borrowLimit;
    }

    public void setBorrowLimit(int borrowLimit) {
        this.borrowLimit = borrowLimit;
    }

    public Set<Integer> getBorrowedBookIds() {
        return borrowedBookIds;
    }

    public void addBorrowedBookId(int bookId) {
        borrowedBookIds.add(bookId);
    }

    public void removeBorrowedBookId(int bookId) {
        borrowedBookIds.remove(bookId);
    }

    public boolean canBorrow() {
        return borrowedBookIds.size() < borrowLimit;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", borrowLimit=" + borrowLimit +
                ", borrowedBookIds=" + borrowedBookIds +
                '}';
    }
}