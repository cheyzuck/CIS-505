/* Zuck, C. (2022). CIS 505 Intermediate Java Programming. Bellevue University. 

 * Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: Comprehensive Version (12th ed.). Pearson Education, Inc.

*/

package Module_4.BowlingShopApp;

public class Ball extends Product{ /* Ball class extends Product (superclass). */
    /* This is the additional attribute of a ball. */
    private String color;

    /* This is a default constructor for a ball. */
    public Ball(){
    }

    /* Accessor Method. */
    /* This method returns the color of the ball. */
    public String getColor(){
        return color;
    }

    /* Mutator Method. */
    /* This method sets the ball's color. */
    public void setColor(String newColor){
        this.color = newColor;
    }
    /* This toString method additionally adds color to the toString method in the superclass. */
    public String toString(){
        return super.toString() + "\n  Color: "+getColor();
    }
} /* End Ball class. */
