/* Zuck, C. (2022). CIS 505 Intermediate Java Programming. Bellevue University. 
 
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: Comprehensive Version (12th ed.). Pearson Education, Inc.

*/

package Module_4.BowlingShopApp;

public class Product {
    /* These are the attributes of a product. */
    private String code;
    private String description;
    private double price = 0;

    /* This is the default constructor. */
    public Product(){
    }

    /* Accessor Methods. */
    /* This method returns the product code. */
    public String getCode(){
        return code;
    }

    /* This method returns the product description. */
    public String getDescription(){
        return description;
    }

    /* This method returns the product price. */
    public double getPrice(){
        return price;
    }

    /* Mutator methods. */
    /* This method sets the product code. */
    public void setCode(String newCode){
        this.code = newCode;
    }

    /* This method sets the product description. */
    public void setDescription(String newDescription){
        this.description = newDescription;
    }

    /* This method sets the product price. */
    public void setPrice(double newPrice){
        this.price = newPrice;
    }

    /* toString method. */
    public String toString(){
        return "  --Product Listing--\n  Product Code: "+getCode()+"\n  Description: "+getDescription()+"\n  Price: " + String.format("$%,6.2f",getPrice());
    }
}/* End Product class. */
