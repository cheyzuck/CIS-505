/* Zuck, C. (2022). CIS 505 Intermediate Java Programming. Bellevue University.

Java Class Attributes. W3 Schools. (2022). Retrieved 1 September 2022, from https://www.w3schools.com/java/java_class_attributes.asp.
Modifications by C. Zuck, 2022.

Java Constructors. W3 Schools. (2022). Retrieved 4 September 2022, from https://www.w3schools.com/java/java_constructors.asp.
Modifications by C. Zuck, 2022.

Java Class Methods. W3 Schools. (2022). Retrieved 4 September 2022, from https://www.w3schools.com/java/java_class_methods.asp.
Modifications by C. Zuck, 2022.

Java Declare Multiple Variables. W3 Schools. (2022). Retrieved 1 September 2022, from https://www.w3schools.com/java/java_variables_multiple.asp.
Modifications by C. Zuck, 2022.

Java If...Else. W3 Schools. (2022). Retrieved 4 September 2022, from https://www.w3schools.com/java/java_conditions.asp.
Modifications by C. Zuck, 2022.

Java Methods. W3 Schools. (2022). Retrieved 4 September 2022, from https://www.w3schools.com/java/java_methods.asp.
Modifications by C. Zuck, 2022.

Java Tutorial. W3 Schools. (2022). Retrieved 1 September 2022, from https://www.w3schools.com/java/default.asp. 
Modifications by C. Zuck, 2022. 

Payne, D., (2021). CSD 405 Intermediate Java Programming. Bellevue University, all rights reserved. */

public class TestFanApp{

    /* This starts the main method, which allows the program to run. */
    public static void main(String[] args){
        /* This uses the argument constructor to call a new object. */
        Fan Fan01 = new Fan(Fan.MEDIUM, true, 7, "pink");
        /* These are the Mutator Methods in action with new settings for each respective field. */
        Fan01.setColor("pink");
        Fan01.setOn();
        Fan01.setRadius(7.0);
        Fan01.setSpeed(Fan.MEDIUM);
        /* This outputs the toString returns in the 'if' condition. */
        System.out.println(Fan01.toString());
    
        /* This uses the default constructor to call a new object. */
        Fan Fan02 = new Fan();

        /* This outputs the toString returns in the 'else' condition. */
        System.out.println(Fan02.toString());
    }/* End Main Method. */
}/*End TestFanApp. */
