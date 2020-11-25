import java.util.Arrays;

class Book {

    private String title;
    private int yearOfPublishing;
    private String[] authors;

    public Book(String title, int yearOfPublishing, String[] authors) {
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
        this.authors = authors;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (String str : authors) {
            s.append(str + ",");
        }
        s.deleteCharAt(s.length() - 1);
        return String.format("title=%s,yearOfPublishing=%d,authors=[%s]", title, yearOfPublishing, s);
    }
}