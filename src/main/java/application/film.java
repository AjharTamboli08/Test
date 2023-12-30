package application;

public class film {

    private int filmId;
    private String filmName;
    private String filmLang;
    private int filmRating;
    private double filmYear;

    public film() {
    }

    public film(int filmId, String filmName, String filmLang, int filmRating, double filmYear) {
        this.filmId = filmId;
        this.filmName = filmName;
        this.filmLang = filmLang;
        this.filmRating = filmRating;
        this.filmYear = filmYear;
    }

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String getFilmLang() {
        return filmLang;
    }

    public void setFilmLang(String filmLang) {
        this.filmLang = filmLang;
    }

    public int getFilmRating() {
        return filmRating;
    }

    public void setFilmRating(int filmRating) {
        this.filmRating = filmRating;
    }

    public double getFilmYear() {
        return filmYear;
    }

    public void setFilmYear(double filmYear) {
        this.filmYear = filmYear;
    }
}
