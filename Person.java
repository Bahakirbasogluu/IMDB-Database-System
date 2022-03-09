public class Person {
    private String Person;
    private String PersonName;
    private String PersonSurname;
    private String PersonId;
    private String PersonCountry;
    public Person(String Person,String PersonId, String PersonName, String PersonSurname, String PersonCountry) {
        this.Person=Person;
        this.PersonCountry = PersonCountry;
        this.PersonId = PersonId;
        this.PersonName = PersonName;
        this.PersonSurname = PersonSurname;
    }

    public String getPerson() {
        return Person;
    }

    public void setPerson(String person) {
        Person = person;
    }

    public String getPersonName() {
        return PersonName;
    }

    public void setPersonName(String personName) {
        PersonName = personName;
    }

    public String getPersonSurname() {
        return PersonSurname;
    }

    public void setPersonSurname(String personSurname) {
        PersonSurname = personSurname;
    }

    public String getPersonId() {
        return PersonId;
    }

    public void setPersonId(String personId) {
        PersonId = personId;
    }

    public String getPersonCountry() {
        return PersonCountry;
    }

    public void setPersonCountry(String personCountry) {
        PersonCountry = personCountry;
    }
}
