
public class Actor extends Performer {

    private String ActorHeight;

    public Actor(String Person,String ActorId,String ActorName,String ActorSurname,String ActorCountry,String ActorHeight){
        super(Person,ActorId,ActorName,ActorSurname,ActorCountry);
        this.ActorHeight = ActorHeight;
    }

    public String getActorHeight() {
        return ActorHeight;
    }

    public void setActorHeight(String actorHeight) {
        ActorHeight = actorHeight;
    }
}
