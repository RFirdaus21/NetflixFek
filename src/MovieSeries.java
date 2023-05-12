import java.util.Scanner;
import java.awt.Desktop;
import java.net.URI;

class Movie {
    private String title;
    private String director;
    private int year;
    
    Scanner input = new Scanner(System.in);
    int pil;

    threadSleep sleep = new threadSleep();
    Cls cls = new Cls();

     void setTitle(String title){
        this.title = title;
    }
     String getTitle(){
        return this.title;
    }
     void setDirector (String director){
        this.director = director;
    }
     String getDirector (){
        return this.director;
    }
     void setYear(int year){
        this.year = year;
    }
     int getYear(){
        return this.year;
    }
}
/*inheritance */
class MovieDetails extends Movie{
    private String genre;
    private String cast;
    private String trailerLink;

     void setGenre(String genre){
       this.genre = genre;
    }
     String getGenre(){
        return this.genre;
    }
     void setCast(String cast){
        this.cast = cast;
    }
     String getCast(){
         return this.cast;
    }
    void setTrailerLink(String trailerLink){
        this.trailerLink = trailerLink;
    }
     String getTrailerLink(){
        return this.trailerLink;
    }
     void showMovieinList(){
        System.out.println(" "+this.getTitle()+"    ("+this.getYear()+")");
    }

    void ShowDetails () {
    System.out.println("\nMOVIE DETAILS\n");
    System.out.println("Title : "+this.getTitle());
    System.out.println("Director : "+this.getDirector());
    System.out.println("Year : "+this.getYear());
    System.out.println("Genre : "+this.getGenre());
    System.out.println("Cast : "+this.getCast());
    System.out.println("\n[1] Putar\t [2] Lihat Trailer");
    System.out.println("==========================================================");
    System.out.print("Pilihan anda : ");
    pil = input.nextInt();

        if (pil == 1){
            System.out.println("\n\nSedang Memutar...");
            sleep.delay750();
            System.out.println("\nSelesai\n\nAnda akan dikembalikan ke menu utama\n");
            sleep.delay750(); cls.clearscreen();
        } else if (pil == 2){
            try {
                Desktop.getDesktop().browse(new URI(trailerLink));
            } catch (Exception e) {
            } cls.clearscreen();
        } else {
                System.out.println("Wrong input");
                sleep.delay500(); cls.clearscreen();
        }
    }
}
/*inheritance */
class SeriesDetails extends Movie{
    private int season, eps;
    private String cast, genre;
    private String trailerLink;

     void setSeason(int season){
        this.season = season;
    }
     int getSeason(){
        return this.season;
    }
     void setEps(int eps){
        this.eps = eps;
    }
     int getEps(){
        return this.eps;
    }
     void setGenre(String genre){
       this.genre = genre;
    }
     String getGenre(){
        return this.genre;
    }
     void setCast(String cast){
        this.cast = cast;
    }
     String getCast(){
         return this.cast;
    }
    void setTrailerLink(String trailerLink){
        this.trailerLink = trailerLink;
    }
     String getTrailerLink(){
        return this.trailerLink;
    }

    void showSeriesinList(){
        System.out.println(" "+this.getTitle()+"    ("+this.getYear()+")");
    }

    void ShowDetails () {
    System.out.println("\nSERIES DETAILS\n");
    System.out.println("Title : "+this.getTitle());
    System.out.println("Director : "+this.getDirector());
    System.out.println("Year : "+this.getYear());
    System.out.println("Episodes : "+this.getEps());
    System.out.println("Genre : "+this.getGenre());
    System.out.println("Cast : "+this.getCast());
    System.out.println("\n[1] Putar\t [2] Lihat Trailer");
    System.out.println("==========================================================");
    System.out.print("Pilihan anda : ");
    pil = input.nextInt();

        if (pil == 1){
            System.out.println("\n\nSedang Memutar...");
            sleep.delay750();
            System.out.println("\nSelesai\n\nAnda akan dikembalikan ke menu utama\n");
            sleep.delay750(); cls.clearscreen();
        } else if (pil == 2){
            try {
                Desktop.getDesktop().browse(new URI(trailerLink));
            } catch (Exception e) {
            } cls.clearscreen();
        } else {
                System.out.println("Wrong input");
                sleep.delay500(); cls.clearscreen();
        }
    }
}

/*memberi nilai pada atribut film */
class MovieInitiate  {
    public MovieDetails[] seedMovies(){
    MovieDetails[] movies = new MovieDetails[10];

    movies[0] = new MovieDetails();
    movies[0].setTitle("The Godfather I");
    movies[0].setDirector("Francis Ford");
    movies[0].setYear(1985);
    movies[0].setGenre("Action, Crime");
    movies[0].setCast("Al Pacino, Marlon Brando, James Caan, Diane Keaton");
    movies[0].setTrailerLink("https://www.youtube.com/watch?v=UaVTIH8mujA&pp=ygUUZ29kZmF0aGVyIDEgdHJhaWxlciA%3D");

    movies[1] = new MovieDetails();
    movies[1].setTitle("Harry Potter and the Prisoner of Azkaban"); 
    movies[1].setDirector("David Yates");
    movies[1].setYear(1998);
    movies[1].setGenre("Action, Supranatural, Fantasy");
    movies[1].setCast("Daniel Radcliffe, Emma Watson");
    movies[1].setTrailerLink("https://www.youtube.com/watch?v=1ZdlAg3j8nI&pp=ygUoaGFycnkgcG90dGVyIHByaXNvbmVyIG9mIGF6a2FiYW4gdHJhaWxlcg%3D%3D");

    movies[2] = new MovieDetails();
    movies[2].setTitle("Avengers Infinity War"); 
    movies[2].setDirector("Anthony Russo & Joe Russo");
    movies[2].setYear(2018);
    movies[2].setGenre("Action, Adventure, Sci-Fi");
    movies[2].setCast("Robert Downey Jr, Chris Hemsworth, Mark Ruffalo, Scarlett Johansson");
    movies[2].setTrailerLink("https://www.youtube.com/watch?v=6ZfuNTqbHE8&pp=ygUMaW5maW5pdHkgd2Fy");

    return movies;
    }
}
/*memberi nilai pada atribut series */
class SeriesInitiate {
public SeriesDetails[] seedSeries(){
    SeriesDetails[] series = new SeriesDetails[10];

    series[0] = new SeriesDetails();
    series[0].setTitle("Narcos");
    series[0].setDirector("Chris Brancato, Carlo Bernard, and Doug Miro");
    series[0].setYear(2017);
    series[0].setEps(30);
    series[0].setSeason(3);
    series[0].setGenre("Crime, Action");
    series[0].setCast("Wagner Moura, Pedro Pascal, Boyd Hoolbrook");
    series[0].setTrailerLink("https://www.youtube.com/watch?v=xl8zdCY-abw&pp=ygUObmFyY29zIHRyYWlsZXI%3D");

    series[1] = new SeriesDetails();
    series[1].setTitle("The Umbrella Academy");
    series[1].setDirector("Steven Blackman");
    series[1].setYear(2019);
    series[1].setEps(30);
    series[1].setSeason(3);
    series[1].setGenre("Action, Fantasy, Supranatural");
    series[1].setCast("Aidan Gallagher, Elliot Page, Tom Hooper");
    series[1].setTrailerLink("https://www.youtube.com/watch?v=0DAmWHxeoKw&pp=ygUYdW1icmVsbGEgYWNhZGVteSB0cmFpbGVy");

    return series;
}
}

