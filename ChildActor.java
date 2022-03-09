public class ChildActor extends Performer{
    private String ChildActorAge;

    public ChildActor(String Person,String ChildActorId,String ChildActorName,String ChildActorSurname,String ChildActorCountry,String ChildActorAge){
        super(Person,ChildActorId,ChildActorName,ChildActorSurname,ChildActorCountry);
        this.ChildActorAge=ChildActorAge;
    }

    public String getChildActorAge() {
        return ChildActorAge;
    }

    public void setChildActorAge(String childActorAge) {
        ChildActorAge = childActorAge;
    }
}
