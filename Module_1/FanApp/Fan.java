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

public class Fan{
	/* These are the attributes of a Fan. */
    private int speed = STOPPED;
    private boolean on = false;
    private double radius = 6; /* Correction 3. */
    String color = "white"; /* Correction 2. */

    /* These are my constants for fan speed. */
    final static int STOPPED = 0;
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;

    /* This is the default constructor. */
    public Fan(){
        int speed = STOPPED; /*Yellow is a warning. Code will work as intended. */
        boolean on = false;
        double radius = 6;
        String color = "white";
    }
    /* End default Constructor. */
    /* This is an argument constructor. */
    public Fan(int Speed, boolean Power, double Radius, String Color){
        int speed = Speed;/*Yellow is a warning. Code will work as intended. */
        boolean on = Power;
        double radius = Radius;
        String color = Color;
    }
    /* End Argument Constructor. */
    /* Accessor Methods. */

    /* This method gets speed from default constructor. */
    public int getSpeed(){
        return speed;
    }
    /* This method gets boolean from default constructor. */
    public boolean isOn(){
        return on;
    }
    /* This method gets radius from default constructor. */
    public double getRadius(){
        return radius;
    }
    /* This method gets color from default constructor. */
    public String getColor(){
        return color;
    }
    /* End Accessor Methods. */
    /* Mutator Methods. */
    /* This method sets new fan speed based on new speed integer. */
    public void setSpeed (int newSpeed){
        this.speed= newSpeed;
    }
    /* This method changes boolean based on new boolean field. */
    public void setOn (){
        this.on = true;
    }
    /* This method changes radius based on new radius integer. */
    public void setRadius (double newRadius){
        this.radius = newRadius;
    }
    /* This method changes color based on new color string. */
    public void setColor (String newColor){
        this.color = newColor;
    }
    /* End Mutator Methods. */
    /* toString method. */
    /* This allows changes to string based on if the boolean is true or false and outputs the string. */
    public String toString(){
        if (on){ /* Correction 1. */
            return "The fan speed is on and set at "+speed+". The fan is "+color+" with a radius of "+radius+" inches.";
        }
        else{
            return "The fan is "+color+" with a radius of "+radius+" and the fan is off."; 
        }
    }/* End toString Method. */
    
}/* End Fan Class. */