public class Writer extends Artist {

    private String WriterType;

    public Writer(String Person,String WriterId,String WriterName,String WriterSurname,String WriterCountry,String WriterType){
        super(Person,WriterId,WriterName,WriterSurname,WriterCountry);
        this.WriterType = WriterType;

    }

    public String getWriterType() {
        return WriterType;
    }

    public void setWriterType(String writerType) {
        WriterType = writerType;
    }
}
