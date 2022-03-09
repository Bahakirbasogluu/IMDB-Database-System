public class FeatureFilm extends Films {

    private String FeatureFilmGenre;
    private String FeatureFilmWriterId;
    private String FeatureFilmBudget;

    public FeatureFilm(String Film,String featureFilmId, String featureFilmTitle, String featureFilmLanguage, String featureFilmDirectorId, String featureFilmLength, String featureFilmCountry, String featureFilmPerformerId, String featureFilmGenre, String featureFilmReleaseDate, String featureFilmWriterId, String featureFilmBudget) {
        super(Film,featureFilmId,featureFilmTitle,featureFilmLanguage,featureFilmDirectorId,featureFilmLength,featureFilmCountry,featureFilmPerformerId,featureFilmReleaseDate);
        this.FeatureFilmGenre = featureFilmGenre;
        this.FeatureFilmWriterId = featureFilmWriterId;
        this.FeatureFilmBudget = featureFilmBudget;
    }

    public String getFeatureFilmGenre() {
        return FeatureFilmGenre;
    }

    public void setFeatureFilmGenre(String featureFilmGenre) {
        FeatureFilmGenre = featureFilmGenre;
    }

    public String getFeatureFilmWriterId() {
        return FeatureFilmWriterId;
    }

    public void setFeatureFilmWriterId(String featureFilmWriterId) {
        FeatureFilmWriterId = featureFilmWriterId;
    }

    public String getFeatureFilmBudget() {
        return FeatureFilmBudget;
    }

    public void setFeatureFilmBudget(String featureFilmBudget) {
        FeatureFilmBudget = featureFilmBudget;
    }
}
