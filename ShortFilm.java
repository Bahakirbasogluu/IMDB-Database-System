public class ShortFilm extends Films{

    private String ShortFilmGenre;
    private String ShortFilmWriterId;


    public ShortFilm(String Film,String shortFilmId, String shortFilmTitle, String shortFilmLanguage, String shortFilmDirectorId, String shortFilmLength, String shortFilmCountry, String shortFilmPerformerId, String shortFilmGenre, String shortFilmReleaseDate, String shortFilmWriterId) {

        super(Film,shortFilmId,shortFilmTitle,shortFilmLanguage,shortFilmDirectorId,shortFilmLength,shortFilmCountry,shortFilmPerformerId,shortFilmReleaseDate);
        ShortFilmGenre = shortFilmGenre;
        ShortFilmWriterId = shortFilmWriterId;
    }

    public String getShortFilmGenre() {
        return ShortFilmGenre;
    }

    public void setShortFilmGenre(String shortFilmGenre) {
        ShortFilmGenre = shortFilmGenre;
    }

    public String getShortFilmWriterId() {
        return ShortFilmWriterId;
    }

    public void setShortFilmWriterId(String shortFilmWriterId) {
        ShortFilmWriterId = shortFilmWriterId;
    }
}
