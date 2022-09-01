/* Zuck, C. (2022). CIS 505 Intermediate Java Programming. Bellevue University.

Java Class Attributes. W3 Schools. (2022). Retrieved 1 September 2022, from https://www.w3schools.com/java/java_class_attributes.asp.
Modifications by C. Zuck, 2022.

Java Declare Multiple Variables. W3 Schools. (2022). Retrieved 1 September 2022, from https://www.w3schools.com/java/java_variables_multiple.asp.
Modifications by C. Zuck, 2022.

Java Tutorial. W3 Schools. (2022). Retrieved 1 September 2022, from https://www.w3schools.com/java/default.asp. 
Modifications by C. Zuck, 2022. 

Payne, D., (2021). CSD 405 Intermediate Java Programming. Bellevue University, all rights reserved. 
*/

public class ZuckHelloWorld {

    /**
     * Method with multiple strings used to print a defined first and last name.
     * 
     * @return prints results in defined output.
     */
    public static void main(String[] args) {
        String message = "Hello, World";
        String firstName = "Cheyenne ";
        String lastName = "Zuck";
        System.out.println(message + " from " + firstName + lastName + "!"); // Output message with defined first and
                                                                             // last name.
    } // End main.
} // End ZuckHelloWorld.
