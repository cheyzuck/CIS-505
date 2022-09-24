/* Zuck, C. (2022). CIS 505 Intermediate Java Programming. Bellevue University. */

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
    /* This returns the product code. */
    public String getCode(){
        return code;
    }

    /* This returns the product description. */
    public String getDescription(){
        return description;
    }

    /* This returns the product price. */
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
        return "  --Product Listing--\n  Product Code: "+getCode()+"\n  Description: "+getDescription()+"\n  Price: "+getPrice();
    }
}/* End Product class. */
