import java.io.FileWriter;      import java.io.IOException;        import java.util.List;
import java.util.ArrayList;     import java.util.Arrays;
import java.util.Queue;

public class Main {

    // I created the ArrayLists here to use  , All films in one ArrayList, all films in different Arraylist, All people in one ArrayList, and people are in different ArrayList.
    public static ArrayList<Rate> ReadSaveRating(List<String> wordlist, ArrayList<Rate> RatingArrayList){
        RatingArrayList.add(new Rate(wordlist.get(1),wordlist.get(2),wordlist.get(3)));
        return RatingArrayList;}
    public static ArrayList<Actor> ReadSaveActor(List<String> wordList, ArrayList<Actor> actorArrayList, ArrayList<Person> personArrayList) {
        personArrayList.add(new Actor(wordList.get(0),wordList.get(1), wordList.get(2), wordList.get(3), wordList.get(4), wordList.get(5)));
        actorArrayList.add(new Actor(wordList.get(0),wordList.get(1), wordList.get(2), wordList.get(3), wordList.get(4), wordList.get(5)));
        return actorArrayList; }
    public static ArrayList<Director> ReadSaveDirector(List<String> wordList, ArrayList<Director> directorArrayList, ArrayList<Person> personArrayList) {
        personArrayList.add(new Director(wordList.get(0),wordList.get(1), wordList.get(2), wordList.get(3), wordList.get(4), wordList.get(5)));
        directorArrayList.add(new Director(wordList.get(0),wordList.get(1), wordList.get(2), wordList.get(3), wordList.get(4), wordList.get(5)));
        return directorArrayList; }
    public static ArrayList<StuntPerformer> ReadSaveStuntPerformer(List<String> wordList, ArrayList<StuntPerformer> stuntPerformerArrayList, ArrayList<Person> personArrayList) {
        stuntPerformerArrayList.add(new StuntPerformer(wordList.get(0),wordList.get(1), wordList.get(2), wordList.get(3), wordList.get(4), wordList.get(5), wordList.get(6)));
        personArrayList.add(new StuntPerformer(wordList.get(0),wordList.get(1), wordList.get(2), wordList.get(3), wordList.get(4), wordList.get(5), wordList.get(6)));
        return stuntPerformerArrayList; }
    public static ArrayList<ChildActor> ReadSaveChildActor(List<String> wordList, ArrayList<ChildActor> childActorArrayList, ArrayList<Person> personArrayList) {
        personArrayList.add(new ChildActor(wordList.get(0),wordList.get(1), wordList.get(2), wordList.get(3), wordList.get(4), wordList.get(5)));
        childActorArrayList.add(new ChildActor(wordList.get(0),wordList.get(1), wordList.get(2), wordList.get(3), wordList.get(4), wordList.get(5)));
        return childActorArrayList; }
    public static ArrayList<Writer> ReadSaveWriter(List<String> wordList,ArrayList<Writer> writerArrayList,ArrayList<Person> personArrayList) {
        personArrayList.add(new Writer(wordList.get(0),wordList.get(1), wordList.get(2), wordList.get(3), wordList.get(4), wordList.get(5)));
        writerArrayList.add(new Writer(wordList.get(0),wordList.get(1), wordList.get(2), wordList.get(3), wordList.get(4), wordList.get(5)));
        return writerArrayList; }
    public static ArrayList<Person> ReadSaveUser(List<String> wordList, ArrayList<Person> personArrayList) {
        personArrayList.add(new User(wordList.get(0),wordList.get(1), wordList.get(2), wordList.get(3), wordList.get(4)));
        return personArrayList; }
    public static ArrayList<FeatureFilm> ReadSaveFeatureFilm(List<String> wordList, ArrayList<FeatureFilm> featureFilms, ArrayList<Films> films) {
        if (wordList.size() == 13) {
            films.add(new FeatureFilm("FeatureFilm:",wordList.get(2), wordList.get(3), wordList.get(4), wordList.get(5), wordList.get(6), wordList.get(7), wordList.get(8), wordList.get(9), wordList.get(10), wordList.get(11), wordList.get(12)));
            featureFilms.add(new FeatureFilm("FeatureFilm:",wordList.get(2), wordList.get(3), wordList.get(4), wordList.get(5), wordList.get(6), wordList.get(7), wordList.get(8), wordList.get(9), wordList.get(10), wordList.get(11), wordList.get(12)));
            return featureFilms; }
        else {
            films.add(new FeatureFilm(wordList.get(0),wordList.get(1), wordList.get(2), wordList.get(3), wordList.get(4), wordList.get(5), wordList.get(6), wordList.get(7), wordList.get(8), wordList.get(9), wordList.get(10), wordList.get(11)));
            featureFilms.add(new FeatureFilm(wordList.get(0),wordList.get(1), wordList.get(2), wordList.get(3), wordList.get(4), wordList.get(5), wordList.get(6), wordList.get(7), wordList.get(8), wordList.get(9), wordList.get(10), wordList.get(11)));
            return featureFilms; } }
    public static ArrayList<ShortFilm> ReadSaveShortFilm(List<String> wordList, ArrayList<ShortFilm> shortFilms, ArrayList<Films> films) {
        if (Integer.parseInt(wordList.get(5))>40){
            System.out.println("A ShortFilm cannot be more than 40 minutes Error");
            return  shortFilms; }
        else{
        films.add(new ShortFilm(wordList.get(0),wordList.get(1), wordList.get(2), wordList.get(3), wordList.get(4), wordList.get(5), wordList.get(6), wordList.get(7), wordList.get(8), wordList.get(9), wordList.get(10)));
        shortFilms.add(new ShortFilm(wordList.get(0),wordList.get(1), wordList.get(2), wordList.get(3), wordList.get(4), wordList.get(5), wordList.get(6), wordList.get(7), wordList.get(8), wordList.get(9), wordList.get(10)));
        return shortFilms;} }
    public static ArrayList<TvSeries> ReadSaveTVseries(List<String> wordList, ArrayList<TvSeries> tvSeries, ArrayList<Films> films) {
        films.add(new TvSeries(wordList.get(0),wordList.get(1), wordList.get(2), wordList.get(3), wordList.get(4), wordList.get(5), wordList.get(6), wordList.get(7), wordList.get(8), wordList.get(9), wordList.get(10), wordList.get(11), wordList.get(12), wordList.get(13)));
        tvSeries.add(new TvSeries(wordList.get(0),wordList.get(1), wordList.get(2), wordList.get(3), wordList.get(4), wordList.get(5), wordList.get(6), wordList.get(7), wordList.get(8), wordList.get(9), wordList.get(10), wordList.get(11), wordList.get(12), wordList.get(13)));
        return tvSeries; }
    public static ArrayList<Documentary> ReadSaveDocumentary(List<String> wordList, ArrayList<Documentary> Documentary,ArrayList<Films> films) {
        Documentary.add(new Documentary(wordList.get(0),wordList.get(1), wordList.get(2), wordList.get(3), wordList.get(4), wordList.get(5), wordList.get(6), wordList.get(7), wordList.get(8)));
        films.add(new Documentary(wordList.get(0),wordList.get(1), wordList.get(2), wordList.get(3), wordList.get(4), wordList.get(5), wordList.get(6), wordList.get(7), wordList.get(8)));
        return Documentary;}

        public static void main(String[] args) throws IOException{

        // I read the txt files here taking as argument the txt files.
    String[] command_lines1 = ReadFromFile.readFile(args[0]);
    String[] command_lines2 = ReadFromFile.readFile(args[1]);
    String[] command_lines3 = ReadFromFile.readFile(args[2]);

        // File write method
        FileWriter writer = new FileWriter(args[3]);

        // Creating ArrayList of objects.
    ArrayList<Documentary> Documentaries = new ArrayList<>();                         ArrayList<Rate> Rates = new ArrayList<>();
    ArrayList<id_avg>  id_avg_FeatureFilm = new ArrayList<>();                        ArrayList<id_avg>  id_avg_ShortFilm = new ArrayList<>();
    ArrayList<id_avg>  id_avg_Documentary = new ArrayList<>();                        ArrayList<id_avg>  id_avg_TVSerie = new ArrayList<>();
    ArrayList<Person> person = new ArrayList<>();                                     ArrayList<ChildActor> ChildActors = new ArrayList<>();
    ArrayList<Director> Directors = new ArrayList<>();                                ArrayList<Actor> Actors = new ArrayList<>();
    ArrayList<StuntPerformer> StuntPerformers = new ArrayList<>();                    ArrayList<Writer> Writers = new ArrayList<>();
    ArrayList<Films> films = new ArrayList<>();                                       ArrayList<TvSeries> TvSeries = new ArrayList<>();
    ArrayList<FeatureFilm> FeatureFilms = new ArrayList<>();                          ArrayList<ShortFilm> ShortFilms = new ArrayList<>();

    // Here is the people.txt. I write the methods up for making objects of the people and I send the necessary th  ings to the methods
    for(String line : command_lines1){String[] words=line.split("\t");
        if (words[0].equals("Actor:")){List<String> wordList=Arrays.asList(words);ReadSaveActor(wordList,Actors,person);}
        else if(words[0].equals("Director:")){List<String> wordList=Arrays.asList(words);ReadSaveDirector(wordList,Directors,person);}
        else if(words[0].equals("StuntPerformer:")){List<String> wordList=Arrays.asList(words);ReadSaveStuntPerformer(wordList,StuntPerformers,person);}
        else if(words[0].equals("ChildActor:")){List<String> wordList=Arrays.asList(words);ReadSaveChildActor(wordList,ChildActors,person); }
        else if(words[0].equals("Writer:")){List<String> wordList = Arrays.asList(words);ReadSaveWriter(wordList,Writers, person); }
        else if(words[0].equals("User:")){List<String> wordList = Arrays.asList(words);ReadSaveUser(wordList, person);}}
    // Here is the films.txt. same thing with up
        for(String line : command_lines2){String[] words=line.split("\t");
            if(words[0].equals("FeatureFilm:")) {List<String> wordList=Arrays.asList(words);ReadSaveFeatureFilm(wordList,FeatureFilms,films);}
            else if(words[0].equals("ShortFilm:")){List<String> wordList=Arrays.asList(words);ReadSaveShortFilm(wordList,ShortFilms,films);}
            else if(words[0].equals("TVSeries:")){List<String> wordList=Arrays.asList(words);ReadSaveTVseries(wordList,TvSeries,films);}
            else if(words[0].equals("Documentary:")){List<String> wordList=Arrays.asList(words);ReadSaveDocumentary(wordList,Documentaries,films);}}
        // Here is the commands.txt. I take all lines and write algorithms for all 12 methods.
        // in all methods, I print the title of commandline first than print others
    for(String line : command_lines3){           String[] words = line.split("\t");
            double counter_dir = 0; double counter_id = 0; double average = 0; double rate_counter = 0; double rate_sum = 0;
            // Rat method, in this method the user gives rating the films. If there is no problem prints the rating
            if(words[0].equals("RATE")){
                if(1<=Integer.parseInt(words[3])&&Integer.parseInt(words[3])<=10){
                int a = Rates.size(); int rate_counter2 = 0; int user_flag = 0;
                for(int i =0 ; i<person.size();i++){
                    if(person.get(i).getPersonId().equals(words[1])&&person.get(i).getPerson().equals("User:")){
                        user_flag =1;
                        if(a>0){
                            for(int j = 0; j<Rates.size();j++){
                                if(Rates.get(j).getUserId().equals(words[1])&&Rates.get(j).getFilmId().equals(words[2])){
                                    writer.write("\n"+words[0] + "    " + words[1] + "    " + words[2] + "    " + words[3]+"\n\n"+"This film was earlier rated"+"\n");
                                    writer.write("\n"+"-----------------------------------------------------------------------------------------------------");
                                    rate_counter2=1; }
                            }
                            if(rate_counter2==0){
                            for(int k = 0; k<films.size();k++) {
                                if (films.get(k).getFilmId().equals(words[2])) {
                                    List<String> wordList = Arrays.asList(words); ReadSaveRating(wordList, Rates);
                                    writer.write("\n"+words[0] + "    " + words[1] + "    " + words[2] + "    " + words[3]+"\n");
                                    writer.write("\n"+"Film rated successfully"+"\n"+"Film type: "+films.get(k).getFilm().substring(0,films.get(k).getFilm().length()-1));
                                    writer.write("\n"+"Film title: "+films.get(k).getFilmTitle()+"\n");
                                    writer.write("\n"+"-----------------------------------------------------------------------------------------------------"); }
                            }
                            }
                        }
                        else{
                            for(int k = 0; k<films.size();k++) {
                                if (films.get(k).getFilmId().equals(words[2])) {
                                    List<String> wordList = Arrays.asList(words); ReadSaveRating(wordList, Rates);
                                    writer.write("\n"+words[0] + "    " + words[1] + "    " + words[2] + "    " + words[3]+"\n");
                                    writer.write("\n"+"Film rated successfully"+"\n"+"Film type: "+films.get(k).getFilm().substring(0,films.get(k).getFilm().length()-1));
                                    writer.write("\n"+"Film title: "+films.get(k).getFilmTitle()+"\n");
                                    writer.write("\n"+"-----------------------------------------------------------------------------------------------------"); }
                            }
                        }
                    }
                }
                // If there is problem with rating method it prints fail
                if(user_flag==0){
                    writer.write("\n"+words[0] + "    " + words[1] + "    " + words[2] + "    " + words[3]+"\n");
                    writer.write("\n"+"Command Failed"+"\n"+"User ID: "+words[1]+"\n"+"Film ID: "+words[2]+"\n");
                    writer.write("\n"+"-----------------------------------------------------------------------------------------------------"); }
                }
            else{ System.out.println("A rate cannot be more than 10 or 0 Error"); }
            }
            // This ADD method adds a new featurefilm to the film list (my film arrray).
            else if(words[0].equals("ADD")){
                for ( int i = 0; i < FeatureFilms.size(); i++ ) {
                    String[] dir = words[8].split(",");
                    for ( int j = 0; j < person.size(); j++ ) {
                        for ( String a : dir ) {
                            if (person.get(j).getPersonId().equals(a)) {
                                counter_dir += 1; } } }
                    for ( int l = 0; l < FeatureFilms.size(); l++ ) {
                        if (FeatureFilms.get(l).getFilmId().equals(words[2])) {
                            counter_id = 1; } }
                    // if there is a problem like director cannot be find and same number you had. It prints fail
                    if (counter_id == 1) {
                        writer.write("\n"+words[0] + "    " + words[1] + "    " + words[2] + "    " + words[3]+ "    " + words[4]+ "    " + words[5]+ "    " + words[6]+ "    " + words[7]+ "    " + words[8]+ "    " + words[9]+ "    " + words[10]+ "    " + words[11]+"    "+words[12]+"\n");
                        writer.write("\n"+"Command Failed"+"\n"+"Film ID: " + words[2]+"\n"+"Film title: " + words[3]+"\n");
                        writer.write("\n"+"-----------------------------------------------------------------------------------------------------");
                        break; }
                    else if (counter_dir != dir.length) {
                        writer.write("\n"+words[0] + "    " + words[1] + "    " + words[2] + "    " + words[3]+ "    " + words[4]+ "    " + words[5]+ "    " + words[6]+ "    " + words[7]+ "    " + words[8]+ "    " + words[9]+ "    " + words[10]+ "    " + words[11]+"    "+words[12]+"\n");
                        writer.write("\n"+"Command Failed"+"\n"+"Film ID: " + words[2]+"\n"+"Film title: " + words[3]+"\n");
                        writer.write("\n"+"-----------------------------------------------------------------------------------------------------");
                        break; }
                    else {
                        List<String> wordList = Arrays.asList(words); ReadSaveFeatureFilm(wordList, FeatureFilms, films);
                        writer.write("\n"+words[0] + "    " + words[1] + "    " + words[2] + "    " + words[3]+ "    " + words[4]+ "    " + words[5]+ "    " + words[6]+ "    " + words[7]+ "    " + words[8]+ "    " + words[9]+ "    " + words[10]+ "    " + words[11]+"    "+words[12]+"\n");
                        writer.write("\n"+"FeatureFilm added successfully"+"\n"+"Film ID: " + words[2]+"\n"+"Film title: " + words[3]+"\n");
                        writer.write("\n"+"-----------------------------------------------------------------------------------------------------");
                        break; } } }
            // This VIEWFILM method shows the film with given number.
            else if(words[0].equals("VIEWFILM")) {
                int film_counter = 0;       int tab = 0;        int vote_counter = 0;
                for ( int a = 0; a < Rates.size(); a++ ) {
                    if (Rates.get(a).getFilmId().equals(words[1])) {
                        vote_counter += 1; } }
                writer.write("\n" + words[0] + "     " + words[1] + "\n");
                // After title it prints the lines by lines wanted in output.txt file.
                for ( int i = 0; i < films.size(); i++ ) {
                    if (films.get(i).getFilmId().equals(words[1])) {
                        film_counter += 1;
                        writer.write("\n" + films.get(i).getFilmTitle() + " (" + films.get(i).getFilmReleaseDate().substring(6) + ")");
                        for ( int j = 0; j < FeatureFilms.size(); j++ ) {
                            if (FeatureFilms.get(j).getFilmId().equals(films.get(i).getFilmId())) {
                                writer.write("\n" + (FeatureFilms.get(j).getFeatureFilmGenre()));
                            }
                        }
                        for ( int j = 0; j < ShortFilms.size(); j++ ) {
                            if (ShortFilms.get(j).getFilmId().equals(films.get(i).getFilmId())) {
                                writer.write("\n" + (ShortFilms.get(j).getShortFilmGenre()));
                            }
                        }
                        for ( int j = 0; j < TvSeries.size(); j++ ) {
                            if (TvSeries.get(j).getFilmId().equals(films.get(i).getFilmId())) {
                                writer.write("\n" + TvSeries.get(j).getTvSeriesSeasons() + " seasons " + TvSeries.get(j).getTvSeriesEpisodes() + " episodes");
                                writer.write("\n" + (TvSeries.get(j).getTvSeriesGenre()));
                            }
                        }
                        for ( int j = 0; j < Documentaries.size(); j++ ) {
                            if (Documentaries.get(j).getFilmId().equals(films.get(i).getFilmId()) && tab == 0) {
                                writer.write("\n" + "");
                                tab = 1;
                            }
                        }
                        // Comma counter method (FEATUREFILM)
                        int comma_counter = 0;
                        for ( int j = 0; j < FeatureFilms.size(); j++ ) {
                            //Feature films
                            if (FeatureFilms.get(j).getFilmId().equals(films.get(i).getFilmId())) {
                                String[] writers = FeatureFilms.get(j).getFeatureFilmWriterId().split(",");
                                for ( String ides : writers ) {
                                    for ( int k = 0; k < person.size(); k++ ) {
                                        if (ides.equals(person.get(k).getPersonId())) {
                                            comma_counter += 1;
                                        }
                                    }
                                }
                            }
                        }

                        // for Writers: (FEATUREFILM)
                        for ( int j = 0; j < FeatureFilms.size(); j++ ) {
                            //Feature films
                            if (FeatureFilms.get(j).getFilmId().equals(films.get(i).getFilmId())) {
                                String[] writers = FeatureFilms.get(j).getFeatureFilmWriterId().split(",");
                                writer.write("\nWriters: ");
                                for ( String ides : writers ) {
                                    for ( int k = 0; k < person.size(); k++ ) {
                                        if (ides.equals(person.get(k).getPersonId())) {
                                            writer.write(person.get(k).getPersonName() + " " + person.get(k).getPersonSurname());
                                            if (comma_counter > 1) {
                                                comma_counter -= 1;
                                                writer.write(", ");
                                            }
                                        }
                                    }
                                }
                                writer.write("\n");
                            }
                        }
                        //Comma counter for (TvSeries)
                        comma_counter = 0;
                        for ( int j = 0; j < TvSeries.size(); j++ ) {
                            if (TvSeries.get(j).getFilmId().equals(films.get(i).getFilmId())) {
                                String[] writers = TvSeries.get(j).getTvSeriesWriterId().split(",");
                                for ( String ides : writers ) {
                                    for ( int k = 0; k < person.size(); k++ ) {
                                        if (ides.equals(person.get(k).getPersonId())) {
                                            comma_counter += 1;
                                        }
                                    }
                                }
                            }
                        }

                        //Tv Series
                        for ( int j = 0; j < TvSeries.size(); j++ ) {
                            if (TvSeries.get(j).getFilmId().equals(films.get(i).getFilmId())) {
                                String[] writers = TvSeries.get(j).getTvSeriesWriterId().split(",");
                                writer.write("\nWriters: ");
                                for ( String ides : writers ) {
                                    for ( int k = 0; k < person.size(); k++ ) {
                                        if (ides.equals(person.get(k).getPersonId())) {
                                            writer.write(person.get(k).getPersonName() + " " + person.get(k).getPersonSurname());
                                            if (comma_counter > 1) {
                                                comma_counter -= 1;
                                                writer.write(", ");
                                            }
                                        }
                                    }
                                }
                                writer.write("\n");
                            }
                        }
                        //Comma counter for (ShortFilms)
                        comma_counter = 0;
                        for ( int j = 0; j < ShortFilms.size(); j++ ) {
                            if (ShortFilms.get(j).getFilmId().equals(films.get(i).getFilmId())) {
                                String[] writers = ShortFilms.get(j).getShortFilmWriterId().split(",");
                                for ( String ides : writers ) {
                                    for ( int k = 0; k < person.size(); k++ ) {
                                        if (ides.equals(person.get(k).getPersonId())) {
                                            comma_counter += 1;
                                        }
                                    }
                                }
                            }
                        }
                        // Short films
                        for ( int j = 0; j < ShortFilms.size(); j++ ) {
                            if (ShortFilms.get(j).getFilmId().equals(films.get(i).getFilmId())) {
                                String[] writers = ShortFilms.get(j).getShortFilmWriterId().split(",");
                                writer.write("\nWriters: ");
                                for ( String ides : writers ) {
                                    for ( int k = 0; k < person.size(); k++ ) {
                                        if (ides.equals(person.get(k).getPersonId())) {
                                            writer.write(person.get(k).getPersonName() + " " + person.get(k).getPersonSurname());
                                            if (comma_counter > 1) {
                                                comma_counter -= 1;
                                                writer.write(", ");
                                            }
                                        }
                                    }
                                }
                                writer.write("\n");
                            }
                        }
                        // comma counter for all types (director:)
                        comma_counter = 0;
                        for ( int j = 0; j < films.size(); j++ ) {
                            if (films.get(j).getFilmId().equals(films.get(i).getFilmId())) {
                                String[] directors = films.get(j).getFilmDirectorId().split(",");
                                for ( String ides : directors ) {
                                    for ( int k = 0; k < person.size(); k++ )
                                        if (ides.equals(person.get(k).getPersonId())) {
                                            comma_counter += 1;
                                        }
                                }
                            }
                        }
                        //directors:
                        for ( int j = 0; j < films.size(); j++ ) {
                            if (films.get(j).getFilmId().equals(films.get(i).getFilmId())) {
                                String[] directors = films.get(j).getFilmDirectorId().split(",");
                                writer.write("Directors: ");
                                for ( String ides : directors ) {
                                    for ( int k = 0; k < person.size(); k++ )
                                        if (ides.equals(person.get(k).getPersonId())) {
                                            writer.write(person.get(k).getPersonName() + " " + person.get(k).getPersonSurname());
                                            if (comma_counter > 1) {
                                                comma_counter -= 1;
                                                writer.write(", ");
                                            }
                                        }
                                }
                                writer.write("\n");
                            }
                        }
                        // Comma counter for all (stars)
                        comma_counter = 0;
                        for ( int j = 0; j < films.size(); j++ ) {
                            if (films.get(j).getFilmId().equals(films.get(i).getFilmId())) {
                                String[] directors = films.get(j).getFilmPerformerId().split(",");
                                for ( String ides : directors ) {
                                    for ( int k = 0; k < person.size(); k++ )
                                        if (ides.equals(person.get(k).getPersonId())) {
                                            comma_counter += 1;
                                        }
                                }
                            }
                        }
                        //stars:
                        for ( int j = 0; j < films.size(); j++ ) {
                            if (films.get(j).getFilmId().equals(films.get(i).getFilmId())) {
                                String[] directors = films.get(j).getFilmPerformerId().split(",");
                                writer.write("Stars: ");
                                for ( String ides : directors ) {
                                    for ( int k = 0; k < person.size(); k++ )
                                        if (ides.equals(person.get(k).getPersonId())) {
                                            writer.write(person.get(k).getPersonName() + " " + person.get(k).getPersonSurname());
                                            if (comma_counter > 1) {
                                                writer.write(", ");
                                                comma_counter -= 1;
                                            }
                                        }
                                }
                                writer.write("\n");
                            }
                        }
                        comma_counter = 0;
                        for ( int j = 0; j < films.size(); j++ ) {
                            if (films.get(j).getFilmId().equals(films.get(i).getFilmId())) {
                                for ( int k = 0; k < Rates.size(); k++ ) {
                                    if (Rates.get(k).getFilmId().equals(films.get(j).getFilmId())) {
                                        rate_counter = rate_counter + 1;
                                        rate_sum = rate_sum + Integer.parseInt(Rates.get(k).getRatePoint());
                                    }
                                }
                                average = rate_sum / rate_counter;
                                if (vote_counter > 0) {
                                    if (Double.toString(average).endsWith(".0")) {
                                        writer.write("Ratings: ");
                                        writer.write(Double.toString(average).replace(".0", "") + "/" + "10 " + "from " + (int) rate_counter + " users" + "\n\n");
                                        writer.write("-----------------------------------------------------------------------------------------------------");
                                    } else {
                                        writer.write("Ratings: ");
                                        writer.write(Double.toString(average).replace(".", ",") + "/" + "10 " + "from " + (int) rate_counter + " users" + "\n\n");
                                        writer.write("-----------------------------------------------------------------------------------------------------");
                                    }
                                }
                                // If there is no vote this prints awaiting for votes.
                                else if (vote_counter == 0) {
                                    writer.write("Awaiting for votes" + "\n");
                                    writer.write("\n" + "-----------------------------------------------------------------------------------------------------");
                                }
                            }
                        }
                    }
                }
                // If there is no result it prints fail
                if (film_counter == 0) {
                    writer.write("\n" + "Command Failed");
                    writer.write("\n" + "Film ID: " + words[1] + "\n");
                    writer.write("\n" + "-----------------------------------------------------------------------------------------------------");
                }
            }
            // Here this LIST method does more than 1 duty and I seperate it as different duties.
            else if(words[0].equals("LIST")){
                // In this method, i print the rating of user which wanted from command line.
                if(words[1].equals("USER")){
                    int vote_counter =0;    int user_counter =0;
                    writer.write("\n"+words[0] + "    " + words[1] + "    " + words[2] + "    "+ words[3]+"\n");
                    for(int j = 0; j<person.size();j++){
                        if(person.get(j).getPerson().equals("User:")){
                        if(person.get(j).getPersonId().equals(words[2])){ user_counter +=1; }
                        }
                    }
                    if(user_counter==1){
                        for(int k=0;k<Rates.size();k++){
                            if(Rates.get(k).getUserId().equals(words[2])){
                                for(int l = 0;l<films.size();l++){
                                    vote_counter +=1;
                                    if(films.get(l).getFilmId().equals(Rates.get(k).getFilmId())){ writer.write("\n"+films.get(l).getFilmTitle()+": "+Rates.get(k).getRatePoint()); }
                                }
                            }
                        }
                        writer.write("\n"+"\n"+"-----------------------------------------------------------------------------------------------------"); }
                    else{
                        vote_counter +=1;
                        writer.write("\n"+"Command Failed"+"\n"+"User Id: "+words[2]+"\n");
                        writer.write("\n"+"-----------------------------------------------------------------------------------------------------"); }
                    if(vote_counter==0){
                        writer.write("\n"+"There is not any ratings so far");
                    }
                    user_counter=0;     vote_counter =0;}
                // In this method it prints TvSeries
                else if(words[1].equals("FILM")){ writer.write("\n"+words[0]+" "+words[1]+" "+words[2]+"\n");
                int serie_counter =0;
                    for (int j=0;j<films.size();j++){
                       if(films.get(j).getFilm().equals("TVSeries:")){
                           for (int k =0;k< TvSeries.size();k++){
                               if(TvSeries.get(k).getFilmId().equals(films.get(j).getFilmId())){
                                   serie_counter+=1;
                                   writer.write("\n"+TvSeries.get(k).getFilmTitle()+" ("+TvSeries.get(k).getFilmReleaseDate().substring(6)+"-"+TvSeries.get(k).getTvSeriesEndDate().substring(6)+")");
                                   writer.write("\n"+TvSeries.get(k).getTvSeriesSeasons()+" seasons and "+TvSeries.get(k).getTvSeriesEpisodes() +" episodes"+"\n"); }
                           }
                       }
                    }
                    if(serie_counter==0){ writer.write("\n"+"No result");}
                    serie_counter=0;
                    writer.write("\n"+"-----------------------------------------------------------------------------------------------------"); }
                // In this method it prints films from the wanted country
                else if(words[1].equals("FILMS")&&words[3].equals("COUNTRY")){
                    int country_counter =0;
                    writer.write("\n"+words[0]+"   "+words[1]+"   "+words[2]+"   "+words[3]+"   "+words[4]+"\n");
                    for(int j=0;j< films.size();j++){
                        if(films.get(j).getFilmCountry().equals(words[4])){
                            writer.write("\n"+"Film Title: "+films.get(j).getFilmTitle()+"\n"+films.get(j).getFilmLength()+" min");
                            writer.write("\n"+"Language: "+films.get(j).getFilmLanguage()+"\n");
                            country_counter=1; } }
                    if(country_counter==0){ writer.write("\n"+"No Result"+"\n"); }
                    writer.write("\n"+"-----------------------------------------------------------------------------------------------------"); }
                // In this method it prints films before given year. The year will not be included
                else if(words[1].equals("FEATUREFILMS")&&words[2].equals("BEFORE")){
                    int Before_counter =0 ;
                    writer.write("\n"+words[0]+"   "+words[1]+"   "+words[2]+"   "+words[3]+"\n");
                    for (int j=0;j<FeatureFilms.size();j++){
                        if(Integer.parseInt(words[3])>Integer.parseInt(FeatureFilms.get(j).getFilmReleaseDate().substring(6))){
                            writer.write("\n"+"Film Title: " +FeatureFilms.get(j).getFilmTitle()+ " (" + FeatureFilms.get(j).getFilmReleaseDate().substring(6) + ")");
                            writer.write("\n"+FeatureFilms.get(j).getFilmLength()+" min"+"\n"+"Language: "+FeatureFilms.get(j).getFilmLanguage()+"\n");
                            Before_counter=1; } }
                    if(Before_counter==0){
                        writer.write("\n"+"No Result"+"\n");
                        writer.write("\n"+"-----------------------------------------------------------------------------------------------------"); }
                    else{ writer.write("\n"+"-----------------------------------------------------------------------------------------------------"); }
                }
                // In this method it prints films after given year. The year will be included
                else if(words[1].equals("FEATUREFILMS")&&words[2].equals("AFTER")){
                    int After_counter =0 ;
                    writer.write("\n"+words[0]+"   "+words[1]+"   "+words[2]+"   "+words[3]+"\n");
                    for (int j=0;j<FeatureFilms.size();j++){
                        if(Integer.parseInt(words[3])<=Integer.parseInt(FeatureFilms.get(j).getFilmReleaseDate().substring(6))){
                            writer.write("\n"+"Film Title: " +FeatureFilms.get(j).getFilmTitle()+ " (" + FeatureFilms.get(j).getFilmReleaseDate().substring(6) + ")");
                            writer.write("\n"+FeatureFilms.get(j).getFilmLength()+" min"+"\n"+"Language: "+FeatureFilms.get(j).getFilmLanguage()+"\n");
                            After_counter=1; } }
                    if(After_counter==0){
                        writer.write("\n"+"No Result"+"\n"); }
                    writer.write("\n"+"-----------------------------------------------------------------------------------------------------");}
                // In this method FROM, it prints the artist from wanted country. If there is no result it prints no result.
                else if(words[1].equals("ARTISTS")&&words[2].equals("FROM")){
                    int artist_counter =0;
                    writer.write("\n"+words[0]+"   "+words[1]+"   "+words[2]+"   "+words[3]+"\n\n"+"Directors:");
                    for(int j=0;j<Directors.size();j++) {
                        if (Directors.get(j).getPersonCountry().equals(words[3])) {
                            artist_counter+=1;
                            writer.write("\n"+Directors.get(j).getPersonName() + " " + Directors.get(j).getPersonSurname() + " " + Directors.get(j).getDirectorAgent()); }
                    }
                    if (artist_counter==0){
                        writer.write("\n"+"No result");
                    }
                    writer.write("\n"+"\n"+"Writers:");
                    artist_counter=0;
                    for(int j=0;j<Writers.size();j++){
                        if(Writers.get(j).getPersonCountry().equals(words[3])) {
                            artist_counter+=1;
                            writer.write("\n"+Writers.get(j).getPersonName() + " " + Writers.get(j).getPersonSurname() + " " + Writers.get(j).getWriterType()); }
                    }
                    if (artist_counter==0){
                        writer.write("\n"+"No result");
                    }
                    writer.write("\n"+"\n"+"Actors:");
                    artist_counter=0;
                    for(int j=0;j<Actors.size();j++){
                        if(Actors.get(j).getPersonCountry().equals(words[3])){
                            artist_counter+=1;
                            writer.write("\n"+Actors.get(j).getPersonName() + " " + Actors.get(j).getPersonSurname() + " " + Actors.get(j).getActorHeight()+" cm"); }
                    }
                    if (artist_counter==0){
                        writer.write("\n"+"No result");
                    }
                    writer.write("\n"+"\n"+"ChildActors:");
                    artist_counter=0;
                    for(int j=0;j<ChildActors.size();j++){
                        if(ChildActors.get(j).getPersonCountry().equals(words[3])){
                            artist_counter+=1;
                            writer.write("\n"+ChildActors.get(j).getPersonName() + " " + ChildActors.get(j).getPersonSurname() + " " + ChildActors.get(j).getChildActorAge()); }
                    }
                    if (artist_counter==0){
                        writer.write("\n"+"No result");
                    }
                    writer.write("\n"+"\n"+"StuntPerformers:");
                    artist_counter=0;
                    for(int j=0;j<StuntPerformers.size();j++){
                        if(StuntPerformers.get(j).getPersonCountry().equals(words[3])){
                            artist_counter+=1;
                            writer.write("\n"+StuntPerformers.get(j).getPersonName() + " " + StuntPerformers.get(j).getPersonSurname() + " " + StuntPerformers.get(j).getStuntPerformerHeight()+" cm"); }
                    }
                    if (artist_counter==0){
                        writer.write("\n"+"No result");
                    }
                    artist_counter=0;                    writer.write("\n"+"\n"+"-----------------------------------------------------------------------------------------------------");}
                // In this FILMS RATE method it prints all films ratings  in decreasing order.
                else if (words[1].equals("FILMS")&&words[3].equals("RATE")){
                    int average_counter=0;
                    writer.write("\n"+words[0]+"   "+words[1]+"   "+words[2]+"   "+words[3]+"   "+words[4]+"\n");
                    double times = 0;double times2=0;double times3=0;double times4 =0;
                    double sums=0;double sums2=0;double sums3=0;double sums4 =0;
                    double avg=0;double avg2=0;double avg3=0;double avg4 =0;
                    for(int j = 0;j<films.size();j++){
                        for(int i = 0;i<Rates.size();i++){
                            if(Rates.get(i).getFilmId().equals(films.get(j).getFilmId())&&films.get(j).getFilm().equals("FeatureFilm:")){ times+=1;       sums +=Integer.parseInt(Rates.get(i).getRatePoint()); }
                            else if(Rates.get(i).getFilmId().equals(films.get(j).getFilmId())&&films.get(j).getFilm().equals("ShortFilm:")){ times2+=1;      sums2+=Integer.parseInt(Rates.get(i).getRatePoint()); }
                            else if(Rates.get(i).getFilmId().equals(films.get(j).getFilmId())&&films.get(j).getFilm().equals("Documentary:")){ times3+=1;  sums3+=Integer.parseInt(Rates.get(i).getRatePoint()); }
                            else if(Rates.get(i).getFilmId().equals(films.get(j).getFilmId())&&films.get(j).getFilm().equals("TVSeries:")){ times4+=1;      sums4+=Integer.parseInt(Rates.get(i).getRatePoint()); }
                        }
                        avg = Math.round((sums/times)*10.0)/10.0; avg2=Math.round((sums2/times2)*10.0)/10.0;
                        avg3=Math.round((sums3/times3)*10.0)/10.0; avg4=Math.round((sums4/times4)*10.0)/10.0;
                        if(avg>0&&films.get(j).getFilm().equals("FeatureFilm:")){
                        id_avg_FeatureFilm.add(new id_avg(Double.toString(avg),films.get(j).getFilmId(),films.get(j).getFilm(),Double.toString(times)));
                        avg =0; sums =0; times=0; }
                        else if(films.get(j).getFilm().equals("FeatureFilm:")){ id_avg_FeatureFilm.add(new id_avg("0",films.get(j).getFilmId(),films.get(j).getFilm(),Double.toString(times))); }
                        if(avg2>0&&films.get(j).getFilm().equals("ShortFilm:")){
                            id_avg_ShortFilm.add(new id_avg(Double.toString(avg2),films.get(j).getFilmId(),films.get(j).getFilm(),Double.toString(times2)));
                            avg2 =0; sums2 =0; times2=0; }
                        else if(films.get(j).getFilm().equals("ShortFilm:")){ id_avg_ShortFilm.add(new id_avg("0",films.get(j).getFilmId(),films.get(j).getFilm(),Double.toString(times2))); }
                        if(avg3>0&&films.get(j).getFilm().equals("Documentary:")){
                            id_avg_Documentary.add(new id_avg(Double.toString(avg3),films.get(j).getFilmId(),films.get(j).getFilm(),Double.toString(times3)));
                            avg3 =0; sums3 =0; times3=0; }
                        else if(films.get(j).getFilm().equals("Documentary:")){ id_avg_Documentary.add(new id_avg("0",films.get(j).getFilmId(),films.get(j).getFilm(),Double.toString(times3))); }
                        if(avg4>0&&films.get(j).getFilm().equals("TVSeries:")){
                            id_avg_TVSerie.add(new id_avg(Double.toString(avg4),films.get(j).getFilmId(),films.get(j).getFilm(),Double.toString(times4)));
                            avg4 =0; sums4 =0; times4=0; }
                        else if(films.get(j).getFilm().equals("TVSeries:")){ id_avg_TVSerie.add(new id_avg("0",films.get(j).getFilmId(),films.get(j).getFilm(),Double.toString(times4))); }
                    }
                    id_avg_FeatureFilm.sort(new RateSORTED().reversed()); id_avg_ShortFilm.sort(new RateSORTED().reversed());
                    id_avg_Documentary.sort(new RateSORTED().reversed()); id_avg_TVSerie.sort(new RateSORTED().reversed());
                    writer.write("\n"+"FeatureFilm:");
                    for(int j=0;j<id_avg_FeatureFilm.size();j++){
                        for(int k =0 ;k<films.size();k++){
                            if(films.get(k).getFilmId().equals(id_avg_FeatureFilm.get(j).getId())){
                                average_counter+=1;
                                if(id_avg_FeatureFilm.get(j).getAvg().endsWith(".0")) {
                                    writer.write("\n"+films.get(k).getFilmTitle() + " (" + films.get(k).getFilmReleaseDate().substring(6) + ") Ratings: " + id_avg_FeatureFilm.get(j).getAvg().replace(".0","") + "/10 from " + (int) Double.parseDouble(id_avg_FeatureFilm.get(j).getTimes()) + " users");
                                }
                            else{
                                    writer.write("\n"+films.get(k).getFilmTitle() + " (" + films.get(k).getFilmReleaseDate().substring(6) + ") Ratings: " + id_avg_FeatureFilm.get(j).getAvg().replace(".",",") + "/10 from " + (int) Double.parseDouble(id_avg_FeatureFilm.get(j).getTimes()) + " users");
                                }
                            } } }
                    if(average_counter==0){
                        writer.write("\n"+"No result");
                    }
                    average_counter=0;
                    writer.write("\n"+"\n"+"ShortFilm:");
                    for(int j=0;j<id_avg_ShortFilm.size();j++){
                        for(int k =0 ;k<films.size();k++){
                            if(films.get(k).getFilmId().equals(id_avg_ShortFilm.get(j).getId())){
                                average_counter+=1;
                                if(id_avg_ShortFilm.get(j).getAvg().endsWith(".0")) {
                                    writer.write("\n"+films.get(k).getFilmTitle() + " (" + films.get(k).getFilmReleaseDate().substring(6) + ") Ratings: " + id_avg_ShortFilm.get(j).getAvg().replace(".0","") + "/10 from " + (int) Double.parseDouble(id_avg_ShortFilm.get(j).getTimes()) + " users");
                                }
                                else{
                                    writer.write("\n"+films.get(k).getFilmTitle() + " (" + films.get(k).getFilmReleaseDate().substring(6) + ") Ratings: " + id_avg_ShortFilm.get(j).getAvg().replace(".",",") + "/10 from " + (int) Double.parseDouble(id_avg_ShortFilm.get(j).getTimes()) + " users");
                                }
                            } } }
                    if(average_counter==0){
                        writer.write("\n"+"No result");
                    }
                    average_counter=0;
                    writer.write("\n"+"\n"+"Documentary:");
                    for(int j=0;j<id_avg_Documentary.size();j++){
                        for(int k =0 ;k<films.size();k++){
                            if(films.get(k).getFilmId().equals(id_avg_Documentary.get(j).getId())){
                                average_counter+=1;
                                if(id_avg_Documentary.get(j).getAvg().endsWith(".0")) {
                                writer.write("\n"+films.get(k).getFilmTitle()+" ("+films.get(k).getFilmReleaseDate().substring(6)+") Ratings: "+id_avg_Documentary.get(j).getAvg().replace(".0","")+"/10 from "+(int)Double.parseDouble(id_avg_Documentary.get(j).getTimes())+" users");
                            }
                            else{
                                writer.write("\n"+films.get(k).getFilmTitle()+" ("+films.get(k).getFilmReleaseDate().substring(6)+") Ratings: "+id_avg_Documentary.get(j).getAvg().replace(".",",")+"/10 from "+(int)Double.parseDouble(id_avg_Documentary.get(j).getTimes())+" users");
                                }
                            }} }
                    if(average_counter==0){
                        writer.write("\n"+"No result");
                    }
                    average_counter=0;
                    writer.write("\n"+"\n"+"TVSeries:");
                    for(int j=0;j<id_avg_TVSerie.size();j++){
                        for(int k =0 ;k<films.size();k++){
                            if(films.get(k).getFilmId().equals(id_avg_TVSerie.get(j).getId())){
                                average_counter+=1;
                                if(id_avg_TVSerie.get(j).getAvg().endsWith(".0")) {
                                    writer.write("\n"+films.get(k).getFilmTitle()+" ("+films.get(k).getFilmReleaseDate().substring(6)+") Ratings: "+id_avg_TVSerie.get(j).getAvg().replace(".0","")+"/10 from "+(int)Double.parseDouble(id_avg_TVSerie.get(j).getTimes())+" users"); }
                                else{
                                    writer.write("\n"+films.get(k).getFilmTitle()+" ("+films.get(k).getFilmReleaseDate().substring(6)+") Ratings: "+id_avg_TVSerie.get(j).getAvg().replace(".",",")+"/10 from "+(int)Double.parseDouble(id_avg_TVSerie.get(j).getTimes())+" users");
                                }
                            } } }
                    if(average_counter==0){
                        writer.write("\n"+"No result");
                    }
                    average_counter=0;
                    writer.write("\n"+"\n"+"-----------------------------------------------------------------------------------------------------"); }}
            // In this EDIT method ratings change as given rating in command line if there is no rating prints fail
            else if(words[0].equals("EDIT")){
                int edit_counter =0;
                writer.write("\n"+words[0]+"   "+words[1]+"   "+words[2]+"   "+words[3]+"  "+words[4]+"\n");
                for (int j =0 ;j<Rates.size();j++){
                    if(Rates.get(j).getUserId().equals(words[2])&&Rates.get(j).getFilmId().equals(words[3])){ edit_counter+=1; }
                }
                if(edit_counter>0){
                    int print_counter =0;
                    for(int j =0;j<Rates.size();j++){
                        for(int k=0; k<films.size();k++){
                            if(Rates.get(j).getFilmId().equals(words[3])&&films.get(k).getFilmId().equals(Rates.get(j).getFilmId())&&print_counter==0&&Rates.get(j).getUserId().equals(words[2])){
                                writer.write("\n"+"New ratings done successfully"+"\n"+"Film title: "+films.get(k).getFilmTitle());
                                writer.write("\n"+"Your rating: "+words[4]+"\n\n"+"-----------------------------------------------------------------------------------------------------");
                                Rates.get(j).setRatePoint(words[4]);
                                print_counter=1; } }} }
                else{ writer.write("\n"+"Command failed"+"\n"+"User ID: "+words[2]+"\n"+"Film ID: "+words[3]+"\n\n"+"-----------------------------------------------------------------------------------------------------"); }
            }
            // In this REMOVE method the ratings given before is deleted. If there is no rating as given command prints fail
            else if(words[0].equals("REMOVE")){
                int remove_counter =0;
                writer.write("\n"+words[0]+"   "+words[1]+"   "+words[2]+"   "+words[3]+"\n");
                for (int j =0 ;j<Rates.size();j++){
                    if(Rates.get(j).getUserId().equals(words[2])&&Rates.get(j).getFilmId().equals(words[3])){ remove_counter+=1; }
                }
                if (remove_counter>0){ writer.write("\n"+"Your film rating was removed successfully");
                    for(int j=0;j<Rates.size();j++){
                        for(int k=0;k< films.size();k++){
                            if(Rates.get(j).getFilmId().equals(words[3])&&films.get(k).getFilmId().equals(words[3])){
                                writer.write("\n"+"Film title: "+films.get(k).getFilmTitle()+"\n\n"+"-----------------------------------------------------------------------------------------------------");
                                Rates.remove(Rates.get(j)); break; }
                        }
                    }
                }
                else{ writer.write("\n"+"Command failed"+"\n"+"User ID: "+words[2]+"\n"+"Film ID: "+words[3]+"\n\n"+"-----------------------------------------------------------------------------------------------------"); } } }
    writer.close();}

}
// get the idea of inheritance in this exp. Also this is a bit polymorph.
