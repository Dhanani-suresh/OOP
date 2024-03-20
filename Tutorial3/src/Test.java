import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Director director = new Director("James","Cameron");
        Date dob = new Date(16,8,1954);
        director.setDoB(dob);
        director.setNumberOfMovies(23);
        System.out.println(director);
        System.out.println("name is: " + director.getName());
        System.out.println("surname is: " + director.getSurname());
        System.out.println("dob is: " + director.getDoB());
        System.out.println("number of directed movies is: " +director.getNumberOfMovies());

        Movie movie = new Movie("Avatar","Fantasy",director);
        System.out.println(movie);

        movie.setNumAwards(23);

        System.out.println(movie);
        System.out.println("title is: " + movie.getTitle());
        System.out.println("category is: " + movie.getCategory ());
        System.out.println("name of director is: " + movie.getDirector().getName());
        System.out.println("surname of director is: " + movie.getDirector().getSurname());
        System.out.println("number of awards is " + movie.getNumAwards());





    }
}
