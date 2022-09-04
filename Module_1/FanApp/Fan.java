public class Fan {
/* Constants. */
    final int STOPPED = 0;
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int fanSpeed = STOPPED;
    private boolean fanPower = false;
    private double fanRadius = 6;
    private String fanColor = "white";

    public Fan() {
        int fanSpeed = 0; 
        boolean fanPower = false; 
        double fanRadius = 6;
        String fanColor = "white";
    }

    public int getSpeed(){
        return fanSpeed;
    }
    public boolean getPower(){
        return fanPower;
    }
    public double getRadius(){
        return fanRadius;
    }
    public String getColor(){
        return fanColor;
    }
    public void setSpeed (int fanSpeed){
        this.fanSpeed= fanSpeed;
    }
    public void setPower (boolean fanPower){
        this.fanPower = fanPower;
    }
    public void setRadius (double fanRadius){
        this.fanRadius = fanRadius;
    }
    public void setColor (String fanColor){
        this.fanColor = fanColor;
    }
/* These are Constructors. The first is a default Constructor. */
    public String toString(){
        return "Fan Speed: "+fanSpeed+ "\n Fan Power: "+fanPower+ "\n Radius: "+fanRadius+"\n Fan Color: "+fanColor+ "\n ";
    }

}

