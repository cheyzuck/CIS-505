package Module_6.ComposerApp;

import java.util.*;

public class MemComposerDao {
    private List<Composer> composers;

    public MemComposerDao(){
    }

    public List<Composer> findAll(){
        System.out.println("  --DISPLAYING COMPOSERS--");
        return composers;
    }
    public Composer findBy(int id){
        Composer composer = new Composer();
        return composer;
    }

    public Composer insert(){
        Composer composer = new Composer();
        composers.add(composer);
        return composer;
    }
}
