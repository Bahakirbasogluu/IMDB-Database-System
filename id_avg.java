public class id_avg {
    private String id;
    private String avg;
    private String Type;
    private String times;
    public id_avg(String avg,String id,String genre,String times){
        this.avg = avg;
        this.id = id;
        this.Type =genre;
        this.times=times;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAvg() {
        return avg;
    }

    public void setAvg(String avg) {
        this.avg = avg;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        this.Type = type;
    }

    public String getTimes() {
        return times;
    }

    public void setTimes(String times) {
        this.times = times;
    }
}
