/* Zuck, C. (2022). CIS 505 Intermediate Java Programming. Bellevue University. */

package Module_4.BowlingShopApp;

public class Bag extends Product { /* Bag class extends Product (superclass). */
    /* This is the additional attribute of a bag. */
    private String type;

    /* This is a default constructor for a bag. */
    public Bag(){
    }

    /* Accessor Method. */
    /* This method returns the type of the bag. */
    public String getType(){
        return type;
    }

    /* Mutator Method. */
    /* This method sets the bag's type. */
    public void setType(String newType){
        this.type = newType;
    }

    /* This toString method additionally adds type to the toString method in the superclass. */
    public String toString(){
        return super.toString() + "\n  Type: "+getType();
    }
} /* End Bag class. */
