import java.util.Objects;

public class Author {
    private String authorName;
    private String authorSurname;

    public Author(String authorName, String authorSurname) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }

    @Override
    public String toString() {
        return authorName + " " + authorSurname;
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, authorSurname);
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author thereIsNoSimilarityFullName = (Author) other;
        return Objects.equals(authorName, thereIsNoSimilarityFullName.authorName) &&
                Objects.equals(authorSurname, thereIsNoSimilarityFullName.authorSurname);
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public String getAuthorSurname() {
        return this.authorSurname;
    }
}