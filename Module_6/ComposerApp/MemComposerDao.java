/* Zuck, C. (2022). CIS 505 Intermediate Java Programming. Bellevue University. 

Java Interfaces. W3 Schools. (2022). Retrieved 07 October 2022, from https://www.w3schools.com/java/java_files.asp.
Modifications by C. Zuck, 2022.

Using user input value to display a specific object from an array list. Stack Overflow. (2015). Retrieved 10 October 2022, from https://stackoverflow.com/questions/30986775/using-user-input-value-to-display-a-specific-object-from-an-array-list.
Modifications by C. Zuck, 2022.

Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: Comprehensive Version (12th ed.). Pearson Education, Inc.

Payne, D., (2021). CSD 405 Intermediate Java Programming. Bellevue University, all rights reserved. */

package Module_6.ComposerApp;

import java.util.*;

public class MemComposerDao implements ComposerDao{ /* This class implements our abstract interface ComposerDao. */
    /* This is the attribute of MemComposerDao. */
    private List<Composer> composers;

    /* This is a constructor that creates 5 default composer objects and puts them in the list composers. */
    public MemComposerDao(){
        composers = new ArrayList<Composer>();
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
    /* This overrides the findAll method from our GenericDao class extended to ComposerDao. It returns all of our composers in the list. */
    @Override
    public List<Composer> findAll(){
        System.out.println("  --DISPLAYING COMPOSERS--");
        return composers;
    }
    /* This overrides the findBy method from our GenericDao class extended to ComposerDao. It returns a composer based on the ID selected by the user. */
    @Override
    public Composer findBy(Integer id){
        System.out.println("  --DISPLAYING COMPOSERS--");
        for (Composer composer : composers){ /* This iterates through the composer list. */
            if (id.equals(composer.getId())){ /* This selects a composer based on the ID and returns it. */
                return composer;
            }
        }
        return null;
    }
    /* This overrides our void insert method from the GenericDao class extended to ComposerDao. It adds a composer to the composer list. */
    @Override
    public void insert(Composer newComposer){
        composers.add(newComposer);
    }
}/* End MemComposerDao class. */


