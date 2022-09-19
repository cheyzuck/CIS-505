package Module_3;

/* Zuck, C. (2022). CIS 505 Intermediate Java Programming. Bellevue University. */

class Customer {
    /* These are the attributes of a customer. */
    private String name;
    private String address;
    private String city;
    private String zip;

    /* This is the default constructor. */
    public Customer(){
        String name = "Jane Doe";
        String address = "1234 Main St.";
        String city = "New York";
        String zip = "10001";
    }

    /* This is a customer with arguments for all four string fields. */
    public Customer(String name, String address, String city, String zip){
        this.name = name;
        this.address = address;
        this.city = city;
        this.zip = zip;
    }
    /* Accessor Methods. */

    /* This method returns the Customer's name. */
    public String getName(){
        return name;
    }
    
    /* This method returns the Customer's address. */
    public String getAddress(){
        return address;
    }

    /* This method returns the Customer's city. */
    public String getCity(){
        return city;
    }

    /* This method returns the Customer's zip code. */
    public String getZip(){
        return zip;
    }

    /* This overrides the toString method to specifically recall all Customer details. */
    public String toString(){
        return "  --Customer Details--\n  Name: " +name+ "\n  Address: " +address+ "\n  City: " +city+ "\n  Zip Code: " +zip;
    }
    /* End toString method. */
}
/* End Customer class. */
