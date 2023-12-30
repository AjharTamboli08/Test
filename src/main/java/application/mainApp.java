package application;

import java.util.List;
import java.util.Scanner;

public class mainApp {

    private static Scanner  sc = new Scanner(System.in);
    private static Service service = new Service();

    public static void main(String[] args) {
        System.out.println("SELECT OPERATION ");
        System.out.println("1. INSERT FILM INFO");
        System.out.println("2. DISPLAY FILM INFO");
        System.out.println("EXIT");

        int ch=sc.nextInt();

        switch (ch){
            case 1:
                insertFilmDetails();
                break;

            case 2:
                displayAllFilm();
                break;

            default:
                System.out.println("INVALID INPUT");

        }
        main(args);
    }
    public static void insertFilmDetails()
    {
        System.out.println("ENTER FILM ID");
        int filmId = sc.nextInt();
        System.out.println("ENTER FILM NAME");
        String filmName = sc.next();
        System.out.println("ENTER FILM LANGUAGE");
        String  filmLang = sc.next();
        System.out.println("ENTER FILM RATING");
        int filmRating = sc.nextInt();
        System.out.println("ENTER FILM YEAR");
        double filmYear = sc.nextDouble();

        film newfilm = new film(filmId , filmName , filmLang , filmRating , filmYear);
        int n= Service.insertFilmDetails(newfilm);
        System.out.println(n+ "Film Added !!");
    }

    public static void displayAllFilm()
    {
        List<film> filmList = service.displayAllFilm();
    }
}
