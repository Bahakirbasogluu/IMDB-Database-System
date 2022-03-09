public class TvSeries extends Films{

    private String TvSeriesGenre;
    private String TvSeriesWriterId;
    private String TvSeriesEndDate;
    private String TvSeriesSeasons;
    private String TvSeriesEpisodes;
    public TvSeries(String Film,String tvSeriesId, String tvSeriesTitle, String tvSeriesLanguage, String tvSeriesDirectorId, String tvSeriesLength, String tvSeriesCountry, String tvSeriesPerformerId, String tvSeriesGenre, String tvSeriesWriterId, String tvSeriesReleaseDate, String tvSeriesEndDate, String tvSeriesSeasons, String tvSeriesEpisodes) {
        super(Film,tvSeriesId,tvSeriesTitle,tvSeriesLanguage,tvSeriesDirectorId,tvSeriesLength,tvSeriesCountry,tvSeriesPerformerId,tvSeriesReleaseDate);
        TvSeriesGenre = tvSeriesGenre;
        TvSeriesWriterId = tvSeriesWriterId;
        TvSeriesEndDate = tvSeriesEndDate;
        TvSeriesSeasons = tvSeriesSeasons;
        TvSeriesEpisodes = tvSeriesEpisodes;
    }

    public String getTvSeriesGenre() {
        return TvSeriesGenre;
    }

    public void setTvSeriesGenre(String tvSeriesGenre) {
        TvSeriesGenre = tvSeriesGenre;
    }

    public String getTvSeriesWriterId() {
        return TvSeriesWriterId;
    }

    public void setTvSeriesWriterId(String tvSeriesWriterId) {
        TvSeriesWriterId = tvSeriesWriterId;
    }

    public String getTvSeriesEndDate() {
        return TvSeriesEndDate;
    }

    public void setTvSeriesEndDate(String tvSeriesEndDate) {
        TvSeriesEndDate = tvSeriesEndDate;
    }

    public String getTvSeriesSeasons() {
        return TvSeriesSeasons;
    }

    public void setTvSeriesSeasons(String tvSeriesSeasons) {
        TvSeriesSeasons = tvSeriesSeasons;
    }

    public String getTvSeriesEpisodes() {
        return TvSeriesEpisodes;
    }

    public void setTvSeriesEpisodes(String tvSeriesEpisodes) {
        TvSeriesEpisodes = tvSeriesEpisodes;
    }
}
