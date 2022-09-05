public class Fan{
	/* These are the attributes of a Fan. */
    private int fanSpeed;
    private boolean On;
    private double fanRadius;
    String fanColor;

    /* These are my constants for fan speed. */
    final static int STOPPED = 0;
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;

    /* This is the default constructor. */
    public Fan(){
        int fanSpeed = STOPPED;
        boolean On = false;
        double fanRadius = 6;
        String fanColor = "white";
    }
    /* This is an argument constructor. */
    public Fan(int Speed, boolean Power, double Radius, String Color){
        int fanSpeed = Speed;
        boolean On = Power;
        double fanRadius = Radius;
        String fanColor = Color;
    }
    /* Accessor Methods. */
    public int getSpeed(){
        return fanSpeed;
    }
    public boolean isOn(){
        return On;
    }
    public double getRadius(){
        return fanRadius;
    }
    public String getColor(){
        return fanColor;
    }
    /* Mutator Methods. */
    public void setSpeed (int newSpeed){
        fanSpeed= newSpeed;
    }
    public void turnOn (){
        On = true;
    }
    public void turnOff(){
        On = false;
    }
    public void setRadius (double newRadius){
        fanRadius = newRadius;
    }
    public void setColor (String newColor){
        fanColor = newColor;
    }
    /* toString method. */
    public String toString(){
        if (On){
            return "The fan is "+fanColor+" with a radius of "+fanRadius+" and the fan is off.";
        }
        else{
            return "The fan speed is on and set at "+fanSpeed+". The fan is "+fanColor+" with a radius of "+fanRadius+" inches."; 
        }
    }
    
}