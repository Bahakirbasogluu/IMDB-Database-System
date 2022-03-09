public class Films {
    private String Film;
    private String FilmId;
    private String FilmTitle;
    private String FilmLanguage;
    private String FilmDirectorId;
    private String FilmLength;
    private String FilmCountry;
    private String FilmPerformerId;
    private String FilmReleaseDate;

    public Films(String Film,String FilmId,String FilmTitle,String FilmLanguage,String FilmDirectorId,String FilmLength,String FilmCountry,String FilmPerformerId,String FilmReleaseDate){
        this.Film=Film;
        this.FilmId=FilmId;
        this.FilmTitle=FilmTitle;
        this.FilmLanguage=FilmLanguage;
        this.FilmReleaseDate=FilmReleaseDate;
        this.FilmCountry=FilmCountry;
        this.FilmDirectorId=FilmDirectorId;
        this.FilmLength=FilmLength;
        this.FilmPerformerId=FilmPerformerId;
    }

    public String getFilm() {
        return Film;
    }

    public void setFilm(String film) {
        Film = film;
    }

    public String getFilmId() {
        return FilmId;
    }

    public void setFilmId(String filmId) {
        FilmId = filmId;
    }

    public String getFilmTitle() {
        return FilmTitle;
    }

    public void setFilmTitle(String filmTitle) {
        FilmTitle = filmTitle;
    }

    public String getFilmLanguage() {
        return FilmLanguage;
    }

    public void setFilmLanguage(String filmLanguage) {
        FilmLanguage = filmLanguage;
    }

    public String getFilmDirectorId() {
        return FilmDirectorId;
    }

    public void setFilmDirectorId(String filmDirectorId) {
        FilmDirectorId = filmDirectorId;
    }

    public String getFilmLength() {
        return FilmLength;
    }

    public void setFilmLength(String filmLength) {
        FilmLength = filmLength;
    }

    public String getFilmCountry() {
        return FilmCountry;
    }

    public void setFilmCountry(String filmCountry) {
        FilmCountry = filmCountry;
    }

    public String getFilmPerformerId() {
        return FilmPerformerId;
    }

    public void setFilmPerformerId(String filmPerformerId) {
        FilmPerformerId = filmPerformerId;
    }

    public String getFilmReleaseDate() {
        return FilmReleaseDate;
    }

    public void setFilmReleaseDate(String filmReleaseDate) {
        FilmReleaseDate = filmReleaseDate;
    }
}
