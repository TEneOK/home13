public class Book {
    private String nameBook;
    private Author author;
    private int yearOfIssue;

    public Book(String nameBook, Author author, int yearOfIssue) {
        this.nameBook = nameBook;
        this.author = author;
        this.yearOfIssue = yearOfIssue;
    }

    @Override
    public String toString() {
        return nameBook + " " + author + " " + yearOfIssue;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(nameBook);
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book ThereIsNoSimilarityName = (Book) other;
        return nameBook.equals(ThereIsNoSimilarityName.nameBook);
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearOfIssue() {
        return this.yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }
}