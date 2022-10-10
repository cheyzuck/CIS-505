/* Zuck, C. (2022). CIS 505 Intermediate Java Programming. Bellevue University. 

 */

package Module_6.ComposerApp;

/* Begin Composer class. */
public class Composer {
    /* These are the attributes of a composer. */
    private int id;
    private String name;
    private String genre;

    /* This is a default constructor of a composer. */
    public Composer(){
    }

    /* This is an argument constructor of a composer. */
    public Composer(int id, String name, String genre){
        this.id = id;
        this.name = name;
        this.genre = genre;
    }

    /* Accessor Methods.*/
    /* This method returns the ID of a composer. */
    public int getId(){
        return id;
    }

    /* This method returns the name of a composer. */
    public String getName(){
        return name;
    }

    /* This method returns the genre of a composer. */
    public String getGenre(){
        return genre;
    }

    /* This overrides the toString method. */
    public String toString(){
        return "  ID: " +id+ "\n  Name: " +name+ "\n  Genre: " +genre+ "\n";
    }
} /* End Composer class. */
