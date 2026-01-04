public class LibraryBook {
    private final int id;
    private String title;
    private String author;
    private int totalCopies;
    private int availableCopies;

    public LibraryBook(int id, String title, String author, int totalCopies) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.totalCopies = totalCopies;
        this.availableCopies = totalCopies;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getTotalCopies() {
        return totalCopies;
    }

    public void setTotalCopies(int totalCopies) {
        if (totalCopies < 0) {
            throw new IllegalArgumentException("total amount of books cannot be negative");
        }
        this.totalCopies = totalCopies;

        if (availableCopies > totalCopies) {
            availableCopies = totalCopies;
        }
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public void setAvailableCopies(int availableCopies) {
        if (availableCopies < 0) {
            throw new IllegalArgumentException("available copies cannot be negative");
        }
        if (availableCopies > totalCopies) {
            throw new IllegalArgumentException("aavailable copies cannot exceed total amount of books");
        }
        this.availableCopies = availableCopies;
    }

    public boolean borrowOne() {
        if (!isAvailable()) return false;
        availableCopies--;
        return true;
    }

    public void returnOne() {
        if (availableCopies < totalCopies) {
            availableCopies++;
        }
    }

    public boolean isAvailable() {
        return availableCopies > 0;
    }

    @Override
    public String toString() {
        return "LibraryBook{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", totalCopies=" + totalCopies +
                ", availableCopies=" + availableCopies +
                '}';
    }
}