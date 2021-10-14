package task_2;

public class Movie {

    private String name;
    private Genre genre;
    private int length;
    private int year;

    public Movie() {
        name = "unknown";
        genre = Genre.NONE;
        length = 0;
        year = 2019;
    }

    public Movie(String name, Genre genre, int length, int year) {
        this.name = name;
        this.genre = genre;
        this.length = length;
        this.year = year;
    }

    @Override
    public String toString() {
        return getInfo();
    }

    public String getInfo() {
        return "Name: " + name + "\nLength: " + getFormattedLength() + "\nGenre: " + genre + "\nReleased in " + year;
    }

    public String getFormattedLength() {
        return (length / 60) + "h " + (length % 60) + "m";
    }

    public String getName() {
        return name;
    }

    public Genre getGenre() {
        return genre;
    }

    public int getLength() {
        return length;
    }

    public int getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
