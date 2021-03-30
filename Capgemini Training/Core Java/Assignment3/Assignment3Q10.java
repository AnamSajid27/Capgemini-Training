package CapgeminiTraining.Java.Assignment3;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Create class Movie_Details with field’s mov_Name, lead_actor, lead_actories, and genre add setter and
 * getter method in that class.
 *
 * a. After creating this class create class Movie_DetailsList class who will maintain all the objects.
 *
 * b. Movie_DetailsList class should have method add_movie(), remove_movie(), remove_AllMovies(),
 * find_movie_By_mov_Name(), find_movie_By_Genre()
 *
 * c. Movie_DetailsList should have method which will take an argument that will be use to determine on which
 * to sort
 */



class MovieDetails {
    private String movieName;
    private String actor;
    private String actress;
    private String genre;

    public MovieDetails(){}

    public MovieDetails(String movieName, String actor, String actress, String genre) {
        this.movieName = movieName;
        this.actor = actor;
        this.actress = actress;
        this.genre = genre;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getActress() {
        return actress;
    }

    public void setActress(String actress) {
        this.actress = actress;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


    public String toString() {
        super.hashCode();
        return "MovieDetails{" +
                "movieName='" + movieName + '\'' +
                ", actor='" + actor + '\'' +
                ", actress='" + actress + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object obj) {
        return true;
    }

}

public class Assignment3Q10 {
    public static void main(String[] args) {

        System.out.println("inside main");
        MovieDetails m1 = new MovieDetails("Bahubali", "Prabhas", "Anushka", "Drama");
        MovieDetails m2 = new MovieDetails("10", "Vikram", "Sam", "Action");

        Assignment3Q10 assignment3Q10 = new Assignment3Q10();
        assignment3Q10.addMovie(m1);
        assignment3Q10.addMovie(m2);

    }

    public static void sort(ArrayList<MovieDetails> movieDetails, Comparator<MovieDetails> movieDetailsComparator){
        System.out.println("Inside sort");
    }

    public static void printSortedMovieList(ArrayList<MovieDetails> movieDetails){
        System.out.println("print sortedlist");
        System.out.println(movieDetails);
    }
    private static  List<MovieDetails>movieDetails = new ArrayList<>();
    public void addMovie(MovieDetails movie) {

        System.out.println("insidde add movie");
        System.out.println(movieDetails);
        System.out.println(movie);
        movieDetails.add(movie);

    }

    public void removeMovies(String movieName) {
        System.out.println("Inside remove movie");
    }

    public void removeAllMovies(List<MovieDetails> movies) {
        System.out.println("Inside removea all" );
    }

    public MovieDetails find_movie_By_mov_Name(String movieName) {

        MovieDetails movieDetail = new MovieDetails();
        for(MovieDetails list:movieDetails){
            if(movieName.equals(list.getMovieName())){
                movieDetail= list;
            }
        }
        return movieDetail;

    }

    public List<MovieDetails> find_movie_By_Genre(String genre) {
        List<MovieDetails> movieDetailsList = new ArrayList<>();
        //movieDetailsList.add(new MovieDetails("a","b","c","d"));
        for (MovieDetails list:movieDetails){
            if(genre.equals(list.getGenre())){
                MovieDetails m = new MovieDetails();
                m= list;
                movieDetailsList.add(m);
            }
        }
        return movieDetailsList;
    }

    public static Comparator<MovieDetails> sortAccordingly(String sortBy) {
        System.out.println("inside comapratrpr");
        Comparator<MovieDetails> movieDetailsComparator = new Comparator<MovieDetails>() {
            @Override
            public int compare(MovieDetails o1, MovieDetails o2) {
                return 0;
            }
        };
        return movieDetailsComparator;
    }
}