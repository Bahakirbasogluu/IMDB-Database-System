public class Director extends Artist {
    private String DirectorAgent;

    public Director(String Person,String DirectorId,String DirectorName,String DirectorSurname,String DirectorCountry,String DirectorAgent){
        super(Person,DirectorId,DirectorName,DirectorSurname,DirectorCountry);
        this.DirectorAgent = DirectorAgent;
    }

    public String getDirectorAgent() {
        return DirectorAgent;
    }

    public void setDirectorAgent(String directorAgent) {
        DirectorAgent = directorAgent;
    }
}
