/* Zuck, C. (2022). CIS 505 Intermediate Java Programming. Bellevue University. 

Java If...Else. W3 Schools. (2022). Retrieved 18 September 2022, from https://www.w3schools.com/java/java_conditions.asp.
Modifications by C. Zuck, 2022.

*/

package Module_3;

class CustomerDB {
    /* This is the attribute of the CustomerDB. */
    private int id;

    /* These are my unique customers using the customer argument. */
    static Customer customer1007 = new Customer("Joseph Biden", "1600 Pennsylvania Ave.", "Washington D.C.", "20500");
    static Customer customer1008 = new Customer("Darth Vader", "01 Death Star Way","Galactic Empire","00666");
    static Customer customer1009 = new Customer("Indiana Jones", "1981 Marshall College Way","Bedford", "10506");

    /* This is my getCustomer method with if/else if statements to return the unique customers based on matching the customer ID.*/
    public static Customer getCustomer(int id){
        if (id == 1007){
            return customer1007;
        }
        else if (id == 1008){
            return customer1008;
        }
        else if (id == 1009){
            return customer1009;
        }
        else{ /* This returns the default customer if the ID does not match any of the above. */
            Customer defaultCustomer = new Customer();
            return defaultCustomer;
        }
            
    }/* End getCustomer method. */
    
}/* End CustomerDB class. */
