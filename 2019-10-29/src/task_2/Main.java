package task_2;

public class Main {

    public static void main(String[] args) {

        String name = "Avatar";
        Genre genre = Genre.ACTION;
        int length = 115;
        int year = 2009;

        Movie movie1 = new Movie(name, genre, length, year);
        Movie movie2 = new Movie();
        Movie movie3 = new Movie();

        movie2.setName("Deadpool 2");
        movie2.setGenre(Genre.COMEDY);
        movie2.setLength(99);
        movie2.setYear(2018);

        System.out.println(movie1);
        System.out.println();
        System.out.println(movie2);
        System.out.println();
        System.out.println(movie3);



    }
}
