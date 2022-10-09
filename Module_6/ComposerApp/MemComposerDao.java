package Module_6.ComposerApp;

import java.util.*;

public class MemComposerDao {
    private List<Composer> composers = new ArrayList<>();

    public MemComposerDao(){
        Composer composer1 = new Composer(1007,"Ludwig Van Beethoven","Classical");
        Composer composer2 = new Composer(1008, "Johann Sebastian Bach", "Classical");
        Composer composer3 = new Composer(1009, "Wolfgang Amadeus Mozart", "Classical");
        Composer composer4 = new Composer (1010, "Johannes Brahms", "Classical");
        Composer composer5 = new Composer(1011, "Joseph Haydn", "Classical");
        composers.add(composer1);
        composers.add(composer2);
        composers.add(composer3);
        composers.add(composer4);
        composers.add(composer5);
    }

    public List<Composer> findAll(){
        System.out.println("  --DISPLAYING COMPOSERS--");
        return composers;
    }
    public Composer findBy(int id){
        System.out.println("  --DISPLAYING COMPOSERS--");
        Composer composer = new Composer();;
        

        }
        return composer;
    }

    public Composer insert(){
        Composer composer = new Composer();
        composers.add(composer);
        return composer;
    }
}
