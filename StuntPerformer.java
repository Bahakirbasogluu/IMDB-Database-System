

public class StuntPerformer extends Performer {

    private String StuntPerformerHeight;
    private String ActorId;

    public  StuntPerformer(String Person, String StuntPerformerId,String StuntPerformerName,String StuntPerformerSurname,String StuntPerformerCountry,String StuntPerformerHeight,String ActorId){
        super(Person,StuntPerformerId,StuntPerformerName,StuntPerformerSurname,StuntPerformerCountry);
        this.StuntPerformerHeight = StuntPerformerHeight;
        this.ActorId = ActorId;
    }

    public String getStuntPerformerHeight() {
        return StuntPerformerHeight;
    }

    public void setStuntPerformerHeight(String stuntPerformerHeight) {
        StuntPerformerHeight = stuntPerformerHeight;
    }
}
