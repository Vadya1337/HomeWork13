public class Author {
    private String name;
    private String lastName;

    public Author(String name, String lastName) {

        this.name = name;
        this.lastName = lastName;

    }
    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }
    @Override
    public String toString(){
        return "" + this.name + "" + this.lastName;
    }
    @Override
    public boolean equals(Object other) {
        if (other == this) return true;
        if (other == null || other.getClass() != getClass()) return false;
        Author otherAuthor = (Author) other;
        return name.equals(otherAuthor.name) &&
                lastName.equals(otherAuthor.lastName);
    }
    @Override
    public int hashCode(){
        return java.util.Objects.hash(name,lastName);
    }
}
