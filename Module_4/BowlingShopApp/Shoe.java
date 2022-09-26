/* Zuck, C. (2022). CIS 505 Intermediate Java Programming. Bellevue University. */

package Module_4.BowlingShopApp;

public class Shoe extends Product {/* Shoe class extends Product (superclass). */
    /* This is the additional attribute of a shoe. */
    private double size;

    /* This is a default constructor for a shoe. */
    public Shoe(){
    }

    /* Accessor Method. */
    /* This method returns the size of the shoe. */
    public double getSize(){
        return size;
    }

    /* Mutator Method. */
    /* This method sets the shoe's size. */
    public void setSize(double newSize){
        this.size = newSize;
    }

    /* This toString method additionally adds size to the toString method in the superclass. */
    public String toString(){
        return super.toString() + "  Shoe Size: "+getSize();
    }
}
