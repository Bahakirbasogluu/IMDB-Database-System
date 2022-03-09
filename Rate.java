public class Rate {
    private String RatePoint;
    private String FilmId;
    private String UserId;

    public Rate(String UserId,String FilmId,String RatePoint){
        this.RatePoint=RatePoint;
        this.FilmId=FilmId;
        this.UserId=UserId;
    }
    public String getRatePoint() {
        return RatePoint;
    }
    public void setRatePoint(String ratePoint) {
        this.RatePoint = ratePoint;
    }

    public String getFilmId() {
        return FilmId;
    }

    public void setFilmId(String filmId) {
        FilmId = filmId;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }
}
