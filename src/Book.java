public class Book {
    private String name;
    private int yearRelease;
    private Author author;

    public Book(String name, int yearRelease, Author author) {
        this.name = name;
        this.yearRelease = yearRelease;
        this.author = author;
    }

    public String getName() {
        return this.name;
    }

    public int getYearRelease() {
        return this.yearRelease;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }
    public Author getAuthor() {
        return this.author;
    }
    public String toString(){
        return "" + name + "" + yearRelease + "" + author;
    }
    @Override
    public boolean equals(Object other) {
        if (other == this) return true;
        if (other == null || other.getClass() != getClass()) return false;
        Book otherBook = (Book) other;
        return name.equals(otherBook.name) &&
                author.equals(otherBook.author) &&
                yearRelease == otherBook.yearRelease;
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(name,author,yearRelease);
    }

}
