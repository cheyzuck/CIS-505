package Module_6.ComposerApp;

public class Composer {
    private int id;
    private String name;
    private String genre;

    public Composer(){
    }

    public Composer(int id, String name, String genre){
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getGenre(){
        return genre;
    }

    public String toString(){
        return "  ID: " +id+ "\n  Name: " +name+ "\n  Genre: " +genre+ "\n";
    }
}
